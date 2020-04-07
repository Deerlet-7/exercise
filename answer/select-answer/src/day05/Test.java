package day05;

/**
 * Created by Deerlet-7 on 2020/4/7 14:56
 */
public class Test {
    public static void main(String sgf[]) {
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);
    }
    static void operate(StringBuffer x,StringBuffer y) {
        x.append(y);
        y=x;
    }
}
