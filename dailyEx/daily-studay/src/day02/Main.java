package day02;
//汽水瓶问题
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(canGet(n));
    }
    public static int canGet(int n){
        int count = 0;
        if(n<1||n>100){
            return 0;
        }
        while(n>2){
            count += n/3;
            n = (n/3)+(n%3) ;
        }
        if(n == 2){
            count++;
        }
        return count;
    }
}

