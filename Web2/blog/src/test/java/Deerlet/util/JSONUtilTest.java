package Deerlet.util;

import Deerlet.model.Article;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Deerlet-7 on 2020/7/21 12:21
 */
public class JSONUtilTest {
    @Test
    public void t1(){
        try {
            ObjectMapper mapper = new ObjectMapper();
            Article article = new Article();
            article.setId(1);
            article.setTitle("好啊");
            article.setContent("你是狗吗，是的");
            article.setUserId(1);
            article.setCreatTime(new Date());
            //将对象序列化为json字符串
            String s = mapper.writeValueAsString(article);
            System.out.println(s);
            //将json字符串反序列化为java对象
            Article des = mapper.readValue(s,Article.class);
            System.out.println(des);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
