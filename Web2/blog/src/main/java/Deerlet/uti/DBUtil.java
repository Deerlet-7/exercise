package Deerlet.uti;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

/**
 * Created by Deerlet-7 on 2020/7/27 18:45
 */
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/blogdemo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = " ";
    /*
    *单例模式
    * 1、编码写出来：写双重校验锁
    * 2、谈谈单例/谈谈单例模式实现方式：
    *     非线程安全：饿汉式，懒汉式
    *     线程安全：双重校验锁，静态内部类，匿名内部类
    * 3、线程安全的单例模式，把代码表达出来
    *    只需要说双重校验锁的代码就行：
    *    1）DCL（双重校验锁）
    *    2）两次null判断，第一次保证效率，第二次保证同一个对象
    *    3）中间使用synchronized加锁，保证对象赋值操作的原子性
    *    4）共享变量使用volatile保证可见性、禁止指令重排序
    * 4、双重校验锁内部的细节：两次判断，一次加锁，变量使用volatile，明白为什么
    */
    private static volatile DataSource DS;
    private static DataSource getDataSource(){
        if(DS == null){
            synchronized (DBUtil.class){
                if(DS == null){
                    DS = new MysqlDataSource();
                    ((MysqlDataSource)DS).setURL(URL);
                    ((MysqlDataSource)DS).setUser(USERNAME);
                    ((MysqlDataSource)DS).setPassword(PASSWORD);
                }
            }
        }
        return DS;
    }
    
}
