package day22;

/**
 * Created by Deerlet-7 on 2020/4/24 20:07
 * 到底买不买
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String has = sc.next();
        String want = sc.next();
        sc.close();
        int miss = 0;
        for (int i = 0; i < want.length(); i++) {
            if (!has.contains(String.valueOf(want.charAt(i)))) {
                miss++;
            }
            has = has.replaceFirst(String.valueOf(want.charAt(i)), "*");
        }
        if (miss != 0) {
            System.out.print("No " + miss);
        } else {
            System.out.print("Yes " + (has.length() - want.length()));
        }
    }
}
