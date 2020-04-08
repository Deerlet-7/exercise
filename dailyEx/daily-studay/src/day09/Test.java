package day09;

/**
 * Created by Deerlet-7 on 2020/4/8 19:45
 * 数字颠倒
 */
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 123;//sc.nextInt();
        int tmp = n;
        String s = new String();
        while(tmp>0){
            s += String.valueOf(tmp%10);
            tmp /= 10;
        }
        System.out.println(s);
    }
}
