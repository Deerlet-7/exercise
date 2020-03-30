import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();*/
        String a = "aba";
        String b = null;
        int count = 0;
        if(a!=null&&b!=null){
            for(int i = 0;i<= a.length();i++){
                StringBuffer sb = new StringBuffer(a);
                StringBuffer sbb = sb.insert(i,b);
                if(judge(sbb)){
                    count++;
                }
            }
        }else if (b == null&&a!=null){
            count = a.length()+1;
        }else {
            return;
        }
        System.out.println(count);
    }
    public static boolean judge(StringBuffer sbb){
        int i = sbb.length()/2;
        String sb1 = sbb.substring(0,i) ;
        StringBuffer sb2 = new StringBuffer(sbb.substring(i));
        String sb3 =  sb2.reverse().toString();
        return sb1.equals(sb3);
    }
}
