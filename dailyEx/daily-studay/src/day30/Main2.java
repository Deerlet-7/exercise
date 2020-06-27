package day30;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/6/27 19:49
 * 大整数排序
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            BigInteger[] bg = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                bg[i] = sc.nextBigInteger();
            }
            Arrays.sort(bg);
            for (int i = 0; i < n; i++) {
                System.out.println(bg[i]);
            }
        }
    }
}
