/**
 * Created by Deerlet-7 on 2020/7/5 15:51
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.mysql.jdbc.Driver");
        System.out.println(cls.getSimpleName());
    }
}
