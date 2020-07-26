package Deerlet.uti;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Deerlet-7 on 2020/7/21 13:56
 */
public class JSONUtil {
    private static volatile ObjectMapper MAPPER;
    public static ObjectMapper get(){
        if(MAPPER == null){//双重校验锁 完成线程安全模式的单例
            synchronized (JSONUtil.class){
                if(MAPPER == null){
                    MAPPER = new ObjectMapper();
                }
            }
        }
        return MAPPER;
    }
    //java对象序列化为json字符串
    public static String serialize(Object o){
        try {
            return get().writeValueAsString(o);
        } catch (JsonProcessingException e) {//编译时异常转化为运行时异常
            throw new RuntimeException("JSON序列化失败，对象为"+o,e);
        }
    }
    //将json字符串反序列化为Java对象
    public static <T> T deserialize(String json,Class<T> clazz){
        try {
            return get().readValue(json,clazz);
        } catch (IOException e) {
            throw new RuntimeException("JSON反序列化失败，对象为"+json ,e);
        }
    }
    public static <T> T deserialize(InputStream is, Class<T> clazz){
        try {
            return get().readValue(is,clazz);
        } catch (IOException e) {
            throw new RuntimeException("JSON反序列化失败", e);
        }
    }
}
