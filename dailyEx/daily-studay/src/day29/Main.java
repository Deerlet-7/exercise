package day29;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/5/9 22:02
 * 年会抽奖
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(String.format("%.2f",probalility(num))+"%");
        }
    }
    public static double probalility(int num){
        int tmp = num;
        long ret = 1;
        for (int i = 1; i <= tmp; i++) {
            ret *= i;
        }
        double result = (count(num)/(double)ret) * 100;
        return result;
    }
    public static double count(int num){
        if(num == 1){
            return 0;
        }else if(num == 2){
            return 1;
        }else {
            return (num -1)*(count(num-1)+count(num -2));
        }
    }
}
