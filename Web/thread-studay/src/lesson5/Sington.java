package lesson5;

/**
 * Created by Deerlet-7 on 2020/5/1 14:37
 * 单例模式
 */
public class Sington {
    public static volatile Sington instance = null;
    private Sington(){};
    public static Sington getInstance(){
        if(null == instance){
            synchronized (Sington.class){
                if(null == instance){
                    instance = new Sington();
                }
            }
        }
        return instance;
    }
}

