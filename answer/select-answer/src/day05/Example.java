package day05;

/**
 * Created by Deerlet-7 on 2020/4/7 15:22
 */
public class Example{
    String str=new String("good");
    char[]ch={'a','b','c'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public  void change(String str, char[] ch){
        str.concat("ooo");
        ch[0]='g';
    }
}
