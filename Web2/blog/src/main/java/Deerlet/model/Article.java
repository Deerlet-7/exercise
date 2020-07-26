package Deerlet.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by Deerlet-7 on 2020/7/21 11:58
 */
@Getter
@Setter
@ToString
public class Article {
    private Integer id;
    private String title;
    private String content;
    private Integer userId;
    private Date creatTime;
    //新增文章时，传入的字段
    private String userAccout;
}
