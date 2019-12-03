import static java.lang.Math.pow;

public class TestDemo1 {
    public static double toNumber(String str){
        double p = 0;
        double c = 0;
        double m = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i)-'0';
            p += (double)c*pow((double)10,m);
            m--;
        }
        return p;
    }
    public static String addStrings(String num1, String num2) {
        double s = toNumber(num1);
        double s2 = toNumber(num2);
        double sum = s+s2;
        String ss = Double.toString(sum);
        return ss;
    }
    public static void main(String[] args) {
        String s = "6913259244";
        String s2 = "71103343";
        String ss =addStrings(s,s2);
        System.out.println(ss);
    }
}
