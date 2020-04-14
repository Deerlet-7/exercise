package day14;

/**
 * Created by Deerlet-7 on 2020/4/14 23:00
 * 尼科彻斯定理
 */
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getNiko(n));
    }
    public static String getNiko(int n){
        int key = n * (n - 1) + 1;
        StringBuffer s = new StringBuffer();
        for(int i = 0; i < n; i++){
            if(i < n-1){
                s.append(key);
                s.append("+");
            }else{
                s.append(key);
            }
            key += 2;
        }
        return s.toString();
    }
}
