package webTest;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/6/12 18:55
 * 单调栈结构
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            long[] arr = new long[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextLong();
            }
            fun(arr);
        }
    }
    public static void fun(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int L = -1;
            int R = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    R = j;
                    break;
                }
            }
            if(i>0){
                for (int j = i; j >=0 ; j--) {
                    if(arr[i] > arr[j]){
                        L = j;
                        break;
                    }
                }
            }
            System.out.println(L +" "+ R);
        }
    }
}
