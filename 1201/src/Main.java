import java.util.*;
//
public class Main{
    public static String func(String str){
        String[] s = str.split(" ");
        StringBuilder ret = new StringBuilder("");
        for (String ss:s){
            ret.append(ss);
        }
        return ret.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ret = func(str);
        System.out.println(ret);
    }
}
