package day06;

/**
 * Created by Deerlet-7 on 2020/4/5 9:25
 * 计算糖果
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        while (sc.hasNext()){
            for(int i = 0;i<4;i++){
                num[i] = sc.nextInt();
            }
        }
        opreat(num);
    }
    public static void opreat(int[] num){
        if((((num[0]+num[2])%2)!=0)||(((num[1]+num[3])%2)!=0)||(num[3]-((num[1]+num[3])/2)<0)){
            System.out.print("No");
            return;
        }
        int A = (num[0]+num[2])/2;
        int B = (num[1]+num[3])/2;
        int C = num[3] - B;
        if(A<0||B<0||C<0){
            System.out.print("No");
            return;
        }
        int[] ans = {A,B,C};
        for(int i = 0; i<2;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.print(ans[2]);
    }
}
/*
import java.util.Scanner;
public class day26.Main.Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y1, y2, y3, y4;
        float a, b, c;
        while (in.hasNextInt()) {
            y1 = in.nextInt();
            y2 = in.nextInt();
            y3 = in.nextInt();
            y4 = in.nextInt();
            a = (y1 + y3) / 2f;
            b = (y3 - y1) / 2f;
            c = (y4 - y2) / 2f;
            if ((a - ((y1 + y3) / 2)) != 0) {
                System.out.print("No");
                return;
            }
            if ((b - ((y3 - y1) / 2) != 0) || (b != ((y2 + y4) / 2))) {
                System.out.print("No");
                return;
            }
            if ((c - ((y4 - y2) / 2)) != 0) {
                System.out.print("No");
                return;
            }
//满足所有的约束条件，输出解。
            System.out.print((int) a + " " + (int) b + " " + (int) c);
        }
    }
}*/
