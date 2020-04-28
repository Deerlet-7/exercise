package day26;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/4/28 13:47
 * 数字之和
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(sum1(n) + " " + sum2(n));
        }
    }

    public static int sum1(int n) {
        int sum1 = 0;
        while (n != 0) {
            sum1 += n % 10;
            n /= 10;
        }
        return sum1;
    }

    public static int sum2(int n) {
        int sum2 = 0;
        int m = (int) Math.pow(n, 2);
        while (m != 0) {
            sum2 += m % 10;
            m /= 10;
        }
        return sum2;
    }
}
