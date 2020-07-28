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
 * Created by Deerlet-7 on 2020/7/27 9:58
 */
@WebServlet("/articleUpdate")
public class ArticleUpdateServlet extends AbstractBaseServlet{
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //文章修改：包含id，title，content
        InputStream is = req.getInputStream();
        Article article = JSONUtil.deserialize(is,Article.class);
        System.out.println("=======================================\n");
        //模拟修改数据
        int num = ArticleDAO.update(article);
        if(num != 1)
            throw new BusinessException("004","文章修改出错。");
        return null;
    }
}
