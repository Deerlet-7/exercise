package Deerlet.servlet;

import Deerlet.dao.ArticleDAO;
import Deerlet.exception.BusinessException;
import Deerlet.model.Article;
import Deerlet.uti.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

/**
 * Created by Deerlet-7 on 2020/7/21 16:18
 */
@WebServlet("/articleAdd")
public class ArticleAddServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        InputStream is = req.getInputStream();
        //http请求Content-Type为application/json，请求时json字符串，需要反序列化为java对象
        //需要检查json字符串的键必须和java类型中的属性匹配
        //json字符串在Java中没有，报异常
        //文章新增：包括title，content，userAccout
        Article article = JSONUtil.deserialize(is,Article.class);
        System.out.println("===========================\n"+article);
        int num = ArticleDAO.insert(article);
        if(num != 1)
            throw new BusinessException("001","插入文章错误");
        //模拟数据库插入数据操作
        return null;
    }
}
