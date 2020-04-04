package day03;


import java.util.*;

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
        Stack<Character> lefts = new Stack<>();
        if(A == null || n != A.length()){
            return false;
        }
        for (int i = 0; i < n ; i++) {
            if(A.charAt(i) == '('){
                lefts.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(lefts.empty()){
                    return false;
                }
                lefts.pop();
            }else  {
                return false;
            }
        }
        if(lefts.empty()){
            return true;
        }else {
            return false;
        }
    }
    public static boolean chkParenthesis1(String A, int n) {
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

