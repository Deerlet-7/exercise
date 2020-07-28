package Deerlet.exception;

/**
 * Created by Deerlet-7 on 2020/7/28 11:17
 */
public class SystemException extends BaseException{
    public SystemException(String code, String message) {
        this(code, message,null);
    }

    public SystemException(String code, String message, Throwable cause) {
        super("SYS"+code, "系统异常："+message, cause);
    }
}
