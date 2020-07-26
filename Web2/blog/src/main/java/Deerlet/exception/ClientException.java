package Deerlet.exception;

/**
 * Created by Deerlet-7 on 2020/7/21 17:23
 */
public class ClientException extends BaseException{

    public ClientException(String code, String message) {
        this(code, message,null);
    }

    public ClientException(String code, String message, Throwable cause) {
        super("CIL"+code,"客户端错误："+ message, cause);
    }
}
