package day03;

/**
 * Created by Deerlet-7 on 2020/4/1 18:46
 * 最长连续数字串
 */
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "abc34567";
        System.out.println(longestStr(str));
    }
    public static String longestStr(String s){
        String ss = null;
        int count = 0;
        int max = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                count++;
                if(max<count){
                    max = count;
                    end = i;
                }
            } else {
                count=0;
            }
            if(end!=0){
                ss = s.substring(end-max+1,end+1);
            }
        }
        return ss;
    }
}