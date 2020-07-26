package Deerlet.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Deerlet-7 on 2020/7/21 17:18
 */
@Getter
@Setter
public class BaseException extends RuntimeException{
    protected String code;

    public BaseException(String code,String message) {
        this(code,message,null);
    }

    public BaseException(String code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
