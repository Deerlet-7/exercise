package day09;

/**
 * Created by Deerlet-7 on 2020/4/8 19:11
 * 末尾为0的数
 * 就看他有几个五
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int n = 20;//sc.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        int count = 0;
        int ret = n;
        while(n>1){
            ret = (ret * --n);
        }
        System.out.println(ret);
        while(ret%10 == 0){
            count++;
            ret/=10;
        }
        return count;
    }
}
