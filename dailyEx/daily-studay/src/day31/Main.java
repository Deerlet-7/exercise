package day31;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/6/27 20:05
 * 说反话 (20)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            for (int i = ss.length-1; i > 0 ; i--) {
                System.out.print(ss[i] + " ");
            }
            System.out.println(ss[0]);
        }
    }
}
