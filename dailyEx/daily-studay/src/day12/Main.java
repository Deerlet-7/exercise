package day12;

import java.util.Arrays;

/**
 * Created by Deerlet-7 on 2020/4/12 19:54
 * 生成格雷码
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(getGray(n)));
    }
    public static String[] getGray(int n) {
        String[] s = null;
        if(n == 1){
            s = new String[]{"0","1"};
        }else{
            String[] strs = getGray(n-1);
            s = new String[2*strs.length];
            for(int i=0; i<strs.length; i++){
                s[i] = "0"+strs[i];
                s[s.length-1-i] = "1"+strs[i];
            }
        }
        return s;
    }
}
