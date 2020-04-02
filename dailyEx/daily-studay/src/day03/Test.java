package day03;


/**
 * Created by Deerlet-7 on 2020/4/1 21:34
 * 合法括号
 */
public class Test {
    public static void main(String[] args) {
        String A = "(()())";
        int n = A.length();
        System.out.println(chkParenthesis(A,n));
    }
    public static boolean chkParenthesis(String A, int n) {
        // write code here
         int a = 0;
         int b = 0;
         int d = 0;
        for (int i = 0; i < n ; i++) {
            if(A.charAt(i) == '('){
                a++;
            }else if(A.charAt(i) == ')'){
                b++;
            }else {
                d++;
            }
        }
        if(a == b && d == 0){
            return true;
        }
        return false;
    }
}

