package day29;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/5/9 22:57
 * 数字和为sum的方法数
 */
public class Test {
    static int[] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            int sum = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int index = 0;
            System.out.println(count(index,sum));
        }
    }
    public static int count(int index,int sum){
        if (index==n) return 0;
        if (arr[index]==sum) return 1+count(index+1,sum);
        else if (sum>arr[index]) return count(index+1,sum-arr[index])+count(index+1,sum);
        return count(index+1,sum);
    }
}
