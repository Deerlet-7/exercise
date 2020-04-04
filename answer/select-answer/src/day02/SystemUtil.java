package day02;

/**
 * Created by Deerlet-7 on 2020/4/2 15:04
 */
public class SystemUtil{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase().equals("admin");
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}
