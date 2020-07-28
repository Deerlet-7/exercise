package Deerlet.dao;

import Deerlet.exception.SystemException;
import Deerlet.model.Article;
import Deerlet.uti.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Deerlet-7 on 2020/7/28 13:04
 */
//jdbc数据库sql操作
public class ArticleDAO {
    //显示文章列表
    public static List<Article> list() {
        Connection c = DBUtil.getConnection();
        PreparedStatement p = null;
        ResultSet r = null;
        String sql = "select id,title,content,user_id,create_time from article";
        try {
            List<Article> articles = new ArrayList<>();
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            while (r.next()){
                Article article = new Article();
                article.setId(r.getInt("id"));
                article.setTitle(r.getString("title"));
                article.setContent(r.getString("content"));
                article.setUserId(r.getInt("user_id"));
                article.setCreatTime(new Date(r.getTimestamp("create_time").getTime()));
                articles.add(article);
            }
            return articles;
        } catch (SQLException e) {
            throw new SystemException("001","查询文章列表出错。",e);
        } finally {
            DBUtil.close(c,p,r);
        }
    }

    public static int insert(Article article) {
        Connection c = DBUtil.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into article (user_id,title,content,create_time)"+
                " select id,?,?,?"+
                " from user where name = ?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1,article.getTitle());
            ps.setString(2,article.getContent());
            ps.setTimestamp(3,new Timestamp(new Date().getTime()));
            ps.setString(4,article.getUserAccout());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new SystemException("002","新增文章出错。",e);
        } finally {
            DBUtil.close(c,ps);
        }
    }

    public static Article query(Integer articleId) {
        Connection c = DBUtil.getConnection();
        PreparedStatement ps = null;
        ResultSet r = null;
        String sql = "select id,title,content,user_id,create_time"+
                " from article where id = ?";
        Article article = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setInt(1,articleId);
            r = ps.executeQuery();
            while (r.next()){
                article = new Article();
                //文章设置属性
                article.setId(articleId);
                article.setTitle(r.getString("title"));
                article.setContent(r.getString("content"));
                article.setUserId(r.getInt("user_id"));
                article.setCreatTime(new Date(r.getTimestamp("create_time").getTime()));
            }
            return article;
        } catch (SQLException e) {
            throw new SystemException("003","查询文章详情出错。",e);
        } finally {
            DBUtil.close(c,ps,r);
        }
    }

    public static int update(Article article) {
        Connection c = DBUtil.getConnection();
        PreparedStatement p = null;
        String sql = "update article set title=?,content=?where id=?";
        try {
            p = c.prepareStatement(sql);
            p.setString(1,article.getTitle());
            p.setString(2,article.getContent());
            p.setInt(3,article.getId());
            return p.executeUpdate();
        } catch (SQLException e) {
            throw new SystemException("004","修改文章出错。",e);
        } finally {
            DBUtil.close(c,p);
        }
    }

    public static int delete(int[] ids) {
        Connection c = DBUtil.getConnection();
        PreparedStatement p = null;
        StringBuilder sql = new StringBuilder("delete from article where id in (");
        for (int i = 0; i < ids.length; i++) {
            if(i>0)
                sql.append(",");
            sql.append("?");
        }
        sql.append(")");
        try {
            p = c.prepareStatement(sql.toString());
            for (int i = 0; i < ids.length; i++) {
                p.setInt(i+1,ids[i]);
            }
            return p.executeUpdate();
        } catch (SQLException e) {
            throw new SystemException("005","删除文章出错。",e);
        } finally {
            DBUtil.close(c,p);
        }
    }
}
