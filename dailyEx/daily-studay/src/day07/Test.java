package day07;

/**
 * Created by Deerlet-7 on 2020/4/6 22:37
 * 最小公倍数
 * 最小公倍数 = 两数相乘 ÷ 两数的最大公约数
 */
/*import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 5;//sc.nextInt();
        int b = 7;//sc.nextInt();
        System.out.println(min(a,b));
    }
    public static int min(int a,int b){
        int i;
        for( i = 1;;i++){
            if(((i%a)==0)&&((i%b)==0)){
                return i;
            }
        }
    }
}*/
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 18;//sc.nextInt();
        int b = 12;//sc.nextInt();
        System.out.println((a*b)/maxG(a,b));
    }
    public static int maxG(int a,int b){
        int c = (a<b?a:b);
        int max = 0;
        for(int i = 1;i<=c;i++){
            if(((a%i)==0)&&((b%i)==0)){
                max = i;
            }
        }
        return max;
    }
}
