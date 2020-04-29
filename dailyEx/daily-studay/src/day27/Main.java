package day27;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/4/29 12:29
 * 找x
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int x= sc.nextInt();
            System.out.println(findX(arr,x));
        }
    }
    public static int findX(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
