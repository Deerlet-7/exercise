package day28;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/4/30 14:48
 * 守形数
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(judge(num));
        }
    }
    public static String judge(int num){
        int count = 0;
        int tmp = num;
        while (tmp != 0){
            count++;
            tmp /= 10;
        }
        tmp = (int) Math.pow(num,2);
        tmp %= (int) Math.pow(10,count);
        if(tmp == num){
            return "Yes!";
        }
        return "No!";
    }
}
