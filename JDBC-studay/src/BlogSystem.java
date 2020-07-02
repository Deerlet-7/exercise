import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/7/2 17:07
 */
public class BlogSystem {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/study?userSSL=false",
                    "root",
                    ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.println("博客系统>");
            int select = sc.nextInt();
            switch (select){
                case 1:registerUser();break;
                default:running = false;
            }
        }
    }
    private static void registerUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String username = sc.nextLine();
        Statement statement
        sc.close();
    }
}
