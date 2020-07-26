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

/**
 * Created by Deerlet-7 on 2020/7/21 16:23
 */
public abstract class AbstractBaseServlet extends HttpServlet {
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
    }
    public abstract Object process (HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
