package day03;

/**
 * Created by Deerlet-7 on 2020/4/1 18:46
 */
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "abc34567";
        System.out.println(longestStr(str));
    }
    public static String longestStr(String s){
        String ss=null;
        int count = 1;
        int max = 0;
        int begin = 0;
        int i = 1;
        for (int j = 0; j < s.length()-1; j+=count) {
            while ((s.charAt(i)-1) == s.charAt(i-1)){
                count++;
                i++;
            }
            if((s.charAt(i)-1) != s.charAt(i-1)){
                i++;
            }
            if(max<count){
                ss = s.substring(begin,i);
                max = count;
            }
            begin = i;
        }
        return ss;
    }
}
