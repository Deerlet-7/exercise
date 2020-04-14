package day13;

/**
 * Created by Deerlet-7 on 2020/4/13 19:34
 * 长整数相加
 */
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(addLongInteger(a,b));
        }
    }

    public static String addLongInteger(String a, String b){
        int leng = Math.max(a.length(),b.length());
        int t = 0;
        if(a.length() != b.length()){
            if(a.length() < b.length()){
                int tem = b.length() - a.length();
                for (int i = 0; i < tem; i++) {
                    a = "0" + a;
                }
            }else {
                int tem = a.length() - b.length();
                for (int i = 0; i < tem; i++) {
                    b = "0" + b;
                }
            }
        }
        int[] arr = new int[leng];
        for (int i = (leng -1); i >= 0; i--) {
            arr[i] = (a.charAt(i) - '0') + (b.charAt(i) - '0') + t;
            t = 0;
            t = arr[i] / 10;
            arr[i] = arr[i] % 10;
        }
        String s = Integer.toString(arr[0]);
        for (int i = 1; i < leng; i++) {
            s += arr[i];
        }
        return s;
    }
}