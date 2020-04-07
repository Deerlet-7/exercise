package day08;

/**
 * Created by Deerlet-7 on 2020/4/7 23:19
 * n个数里最小的k个
 */
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        while (sc.hasNext()){
            for (int i = 0;i<102 ; i++) {
                arr[i] = sc.nextInt();
            }
        }
        int key = arr[arr.length-1];
        arr[arr.length-1]=0;
        Arrays.sort(arr);
        int[] ans = Arrays.copyOfRange(arr,1 ,arr.length);
        for (int a:ans) {
            System.out.print(a+" ");
        }
    }
}
