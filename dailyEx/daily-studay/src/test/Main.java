package test;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/7/27 14:54
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            judge(s);
        }
    }
    public static void judge(String s){
        int begin = 0;
        int end = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)+1 == s.charAt(i+1)){
                count++;
            }

        }
    }
}
