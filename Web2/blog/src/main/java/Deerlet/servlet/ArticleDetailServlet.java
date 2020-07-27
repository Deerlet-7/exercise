package Deerlet.servlet;

import Deerlet.exception.ClientException;
import Deerlet.model.Article;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by Deerlet-7 on 2020/7/21 17:10
 */
@WebServlet("/articleDetail")
public class ArticleDetailServlet extends AbstractBaseServlet{
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //获取请求数据中的id（文章id）
        String id = req.getParameter("id");
        Integer articleId;
        try {
            articleId = Integer.parseInt(id);
        } catch (Exception e) {
            throw new ClientException("001","请求参数错误：id="+id);
        }
        if(articleId == 1){
            int i = 11/0;
        }
        return testData();//测试代码，以后替换为数据库根据文章id查询文章信息操作
    }
    public static Article testData(){
        Article a1 = new Article();
        a1.setId(1);
        a1.setTitle("好啊");
        a1.setContent("你是狗吗，是的");
        a1.setUserId(1);
        a1.setCreatTime(new Date());
        return a1;
    }
}
