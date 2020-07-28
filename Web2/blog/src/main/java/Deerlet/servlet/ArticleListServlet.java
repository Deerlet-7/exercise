package Deerlet.servlet;

import Deerlet.dao.ArticleDAO;
import Deerlet.model.Article;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Deerlet-7 on 2020/7/21 14:10
 */
@WebServlet("/articleList")
public class ArticleListServlet extends AbstractBaseServlet {
/*    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json;charset=utf-8");
        //前端约定好的统一返回的son数据格式
        Result result = new Result();
        try {
            //正确返回业务数据
            List<Article> articles = testData();
            result.setSuccess(true);
            result.setData(articles);
        } catch (Exception e){//捕获异常，需要设置前端需要错误信息和堆栈信息
            result.setMessage(e.getMessage());
            StringWriter sw = new StringWriter();
            PrintWriter epw = new PrintWriter(sw);
            e.printStackTrace(epw);
            result.setStackTrace(sw.toString());
        }
        PrintWriter pw = resp.getWriter();
        pw.println(JSONUtil.serialize(result));
        pw.flush();
    }*/

    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Article> articles = ArticleDAO.list();
        return articles;
        //return testData();
    }

    //测试数据
/*    public static List<Article> testData(){
        List<Article> articles = new ArrayList<>();
        Article a1 = new Article();
        a1.setId(1);
        a1.setTitle("好啊");
        a1.setContent("你是狗吗，是的");
        a1.setUserId(1);
        a1.setCreatTime(new Date());
        Article a2 = new Article();
        a2.setId(2);
        a2.setTitle("啦啦啦");
        a2.setContent("仙女在此");
        a2.setUserId(1);
        a2.setCreatTime(new Date());
        articles.add(a1);
        articles.add(a2);
        return articles;
    }*/
}
