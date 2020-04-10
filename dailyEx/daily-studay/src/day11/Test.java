package day11;

/**
 * Created by Deerlet-7 on 2020/4/10 16:18
 * 构建乘积数组
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6, 7, 9};
        System.out.println(Arrays.toString(multiply(A)));
        System.out.println(Arrays.toString(multiply1(A)));

    }
    public static int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;
            //计算下三角连乘
            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            //计算上三角
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
    public static int[] multiply1(int[] A) {
        int length = A.length;
        if (length == 0) {
            return null;
        }
        int[] B = new int[length];
        int[] C = new int[length];
        for (int j = 0; j < length; j++) {
            for (int i = 0; i < length; i++) {
                C[i] = A[i];
            }
            int tem = 1;
            for (int i = 0; i < length; i++) {
                C[j] = 1;
                tem *= C[i];
            }
            B[j] = tem;
        }
        return B;
    }
}