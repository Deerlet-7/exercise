package Deerlet.servlet;

import Deerlet.exception.BaseException;
import Deerlet.model.Result;
import Deerlet.uti.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Deerlet-7 on 2020/7/21 16:23
 */
public abstract class AbstractBaseServlet extends HttpServlet {
    private static final ConcurrentMap<String,Integer> MAP = new ConcurrentHashMap<>();
    private static final ConcurrentMap<String, AtomicInteger> MAP2 = new ConcurrentHashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json;charset=utf-8");
        //前端约定好的统一返回的son数据格式
        Result result = new Result();
        try {
            //正确返回业务数据
            Object data = process(req,resp);
            result.setSuccess(true);
            result.setData(data);
        } catch (Exception e){//捕获异常，需要设置前端需要错误信息和堆栈信息
            if(e instanceof BaseException){
                BaseException be = (BaseException) e;
                result.setMessage("错误码："+be.getCode()+"错误信息："+be.getMessage());
            }else {
                result.setMessage("服务器异常：未知错误:");
            }
            StringWriter sw = new StringWriter();
            PrintWriter epw = new PrintWriter(sw);
            e.printStackTrace(epw);
            result.setStackTrace(sw.toString());
        }
        PrintWriter pw = resp.getWriter();
        pw.println(JSONUtil.serialize(result));//返回json字符串
        pw.flush();
/*        System.out.println("schem:"+req.getScheme());//协议号  http
        System.out.println("ServletPath:"+req.getServletPath());//请求Servlet路径  /articleList
        System.out.println("ContexPath:"+req.getContextPath());//应用部署路径（上下文路径）  /blog
        System.out.println("RequestURL:"+req.getRequestURL());//请求的全路径 http://localhost:8080/blog/articleList
        System.out.println("requestURI:"+req.getRequestURI());//ContexPath+ServletPath   /blog/articleList
        System.out.println("PathInfo:"+req.getPathInfo());//null*/
        //方法一：通过synchronized保证代码原子性
        synchronized (MAP) {
            String path = req.getServletPath();
            Integer count = MAP.get(path);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            MAP.put(path, count);
        }
        //方法二：通过AtomicInteger结合ConcurrentHashMap来保证线程安全
        String path = req.getServletPath();
        //ConcurrentHashMap.putIfAbsent(),如果没有键存在，就保存给定的键值对，返回null
        //如果是键有映射关系，就直接返回对应的值
        AtomicInteger count = MAP2.putIfAbsent(path,new AtomicInteger(1));
        if(count != null){
            count.incrementAndGet();
        }
    }

    public abstract Object process (HttpServletRequest req, HttpServletResponse resp) throws Exception;

    public static ConcurrentMap<String, Integer> getMAP() {
        return MAP;
    }

    public static ConcurrentMap<String, AtomicInteger> getMAP2() {
        return MAP2;
    }
}
