package Deerlet.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by Deerlet-7 on 2020/7/21 11:56
 */
@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String name;
    private Date creatTime;
}
