package day32;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/7/27 11:55
 * 在霍格沃茨找零钱
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String P = sc.next();
            String A = sc.next();
            int[] P2 = toIntArray(P);
            int[] A2 = toIntArray(A);
            for (int i = 0; i < P2.length; i++) {
                if(P2[i]>A2[i]){
                    System.out.println(countMony(A2,P2));
                }else {
                    System.out.println(countMony(P2,A2));
                }
            }
        }
    }
    public static String countMony(int[] P,int[] A){
        int[] count = new int[P.length];
        int i = P.length-1;
        for (; i >= 0 ; i--) {
            if(i == 2){
                count[i] = A[i]-P[i];
                if(count[i]<0){
                    count[i]+=29;
                    A[--i]-=1;
                    ++i;
                }
            }
            if(i == 1){
                count[i] = A[i]-P[i];
                if(count[i]<0){
                    count[i]+=17;
                    A[--i]-=1;
                    ++i;
                }
            }
            if (i == 0 ){
                count[i] = A[i]-P[i];
            }
        }
        String result = null;
        for (int j = 0; j < count.length-1; j++) {
            result += String.valueOf(count[j]);
            result+=".";
        }
        result += count[2];
        result = result.substring(4);
        return result;
    }
    public static int[] toIntArray(String s){
        String[] str = s.split("\\.");
        int[] str2 = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            str2[i] = Integer.parseInt(str[i]);
        }
        return str2;
    }
}
