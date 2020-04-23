package day21;

/**
 * Created by Deerlet-7 on 2020/4/23 22:46
 * 最难的问题
 */
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(oprea(s));
        }
    }
    public static String oprea(String s){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 32){
                sb.append(s.charAt(i))  ;
            }else if ((s.charAt(i) - 5) < 65){
                sb.append((char) (86 + (s.charAt(i)-65))) ;
            }else {
                sb.append ((char) (s.charAt(i) - 5));
            }
        }
        return sb.toString();
    }
}