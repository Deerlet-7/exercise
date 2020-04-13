package day13;

/**
 * Created by Deerlet-7 on 2020/4/13 19:18
 * 跟奥巴马画方格
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            String b = sc.next();
            print(a, b);
        }
    }

    public static void print(int a, String b) {
        for (int i = 0; i < ((a + 1) / 2); i++) {
            if (i == 0 || i == (((a + 1) / 2) - 1)) {
                for (int j = 0; j < a; j++) {
                    System.out.print(b);
                }
            } else {
                for (int j = 0; j < a; j++) {
                    if (j == 0 || j == a - 1) {
                        System.out.print(b);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}