package day27;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/4/29 12:56
 * 整数与IP地址之间的转换
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String ip = sc.nextLine();
            if(ip.contains(".")){
                System.out.println(opreat(ip));
            }else {
                System.out.println(opreat2(ip));
            }
        }
    }
    public static Long opreat(String ip){
        long sum = 0L;
        String answer = null;
        String[] strIp = ip.split("\\.");
        for (int i = 0; i < strIp.length; i++) {
            if(answer == null){
                answer = toBin(strIp[i]);
            }else {
                answer += toBin(strIp[i]);
            }
        }
        for (int i = 31; i >= 0; i--) {
            if(answer.charAt(i) == '1'){
                sum += (long) Math.pow(2,(31 - i));
            }
        }
        return sum;
    }
    public static String toBin(String s){
        String[] str = new String[32];
        byte ss = (byte) Integer.parseInt(s);
        for (int i = 0; i < str.length; i++) {
            byte val = ss;
            if((val >> 7) !=0){
                str[i] = "1";
            }else {
                str[i] = "0";
            }
            ss <<= 1;
        }
        String ans = str[0];
        for (int i = 1; i < 8; i++) {
            ans += str[i];
        }
        return ans;
    }
    public static String opreat2(String ip){
        int sum = 0;
        String str = toBin(ip);
        StringBuffer ans = null;
        int min = 24;
        int max = 32;
        for (int j = 0; j < 5; j++) {
            for (int i = min; i < max ; i--) {
                if(str.charAt(i) == '1'){
                    sum += (int) Math.pow(2,(30-i));
                }
            }
            min -= 8;
            max -= 8;
            ans.append(String.valueOf(sum));
            ans.append(".");
        }
        return ans.toString();
    }
}
