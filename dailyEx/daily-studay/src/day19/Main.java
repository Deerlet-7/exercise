package day19;

import java.util.Arrays;

/**
 * Created by Deerlet-7 on 2020/4/21 21:58
 * 子串判断
 */
public class Main {
    public static void main(String[] args) {
        String[] p = {"a","b","c","d"};
        int n = p.length;
        String s = "abc";
        System.out.println(Arrays.toString(chkSubStr(p,n,s)));
    }
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] ans = new boolean[n];
        for(int i = 0; i < n; i++){
            ans[i] = jurge(p[i],s);
        }
        return ans;
    }
    public static boolean jurge(String p, String s){
        for(int i = 0; i < s.length(); i++){
            if(s.contains(p)){
                return true;
            }
        }
        return false;
    }
}
