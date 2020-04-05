package day04;

/**
 * Created by Deerlet-7 on 2020/4/2 14:27
 * 删除公共字符
 */
import java.util.*;
/*public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(deleteStr(s1,s2));
    }
    public static String deleteStr(String s1,String s2){
        StringBuffer sb = new StringBuffer(s1);
        for(int i = 0; i < s2.length();i++){
            for(int j = 0; j<sb.length();j++){
                if(s2.charAt(i) == sb.charAt(j)){
                    sb.deleteCharAt(j);
                }
            }
        }
        return sb.toString();
    }
}*/

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i=0;i<ch.length;i++){
                if(!str.contains((String.valueOf(ch[i])))){
                    System.out.print(ch[i]);
                }
            }
        }
    }
}
