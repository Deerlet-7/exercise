package day01;
import java.util.*;
import java.lang.*;
//统计回文
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = 0;
        if(a!=null&&b!=null){
            for(int i = 0;i<= a.length();i++){
                StringBuffer sb = new StringBuffer(a);
                StringBuffer sbb = sb.insert(i,b);
                if(judge(sbb)){
                    count++;
                }
            }
        }else if(a != null && b == null){
            StringBuffer sb = new StringBuffer(a);
            if(judge(sb)){
                count = sb.length()+1;
            }
        }else if(a == null && b != null){
            StringBuffer sb = new StringBuffer(b);
            if(judge(sb)){
                count = 1;
            }
        }else {
            return;
        }
        System.out.println(count);
    }
    public static boolean judge(StringBuffer sbb){
        int i = sbb.length()/2;
        String sb1 = sbb.substring(0,i) ;
        StringBuffer sb2;
        if(sbb.length()%2==0){
            sb2 = new StringBuffer(sbb.substring(i));
        }else {
            sb2 = new StringBuffer(sbb.substring(i+1));
        }
        String sb3 =  sb2.reverse().toString();
        return sb1.equals(sb3);
    }
}
