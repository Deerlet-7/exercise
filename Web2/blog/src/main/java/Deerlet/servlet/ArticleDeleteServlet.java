package Deerlet.servlet;

import Deerlet.dao.ArticleDAO;
import Deerlet.exception.BusinessException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Deerlet-7 on 2020/7/27 10:22
 */
@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends AbstractBaseServlet{
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String idsString = req.getParameter("ids");
        int[] ids = parseIds(idsString);
        int num = ArticleDAO.delete(ids);
        if(num == 0)
            throw new BusinessException("005","文章删除出错。");
        return null;
    }
    public static int[] parseIds(String idsString){
        String[] idArray = idsString.split(",");
        int[] ids = new int[idArray.length];
        for (int i = 0; i < idArray.length; i++) {
            ids[i] = Integer.parseInt(idArray[i]);
        }
        return ids;
    }
}
