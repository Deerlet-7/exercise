package day04;

/**
 * Created by Deerlet-7 on 2020/4/2 14:00
 * 买苹果（所有大于十的偶数都可以由8和6组成）
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(lessesBag(n));
        }*/
        int n = 17;
        System.out.println(lessesBag(n));
    }
    public static int lessesBag(int n){
        if((n % 2 != 0) || ((n < 12) &&(n != 6)&&(n != 8))){
            return -1;
        }
        return (n+7)/8;
    }
}
