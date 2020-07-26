package Deerlet.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Deerlet-7 on 2020/7/21 15:17
 */
@Getter
@Setter
@ToString
public class Result {
    private boolean success;
    private String message;
    private String stackTrace;
    private Object data;
}
