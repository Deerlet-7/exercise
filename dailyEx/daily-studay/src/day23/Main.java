package day23;

/**
 * Created by Deerlet-7 on 2020/4/25 22:20
 * 数字分类
 */
import java.text.NumberFormat;
import java.util.*;
public class Main{
    public static void main(String[] aegs){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }
            if(A1(array,N) == 0){
                System.out.printf("N");
            }else {
                System.out.print(A1(array,N)+" ");
            }
            if(A2(array,N) == 0){
                System.out.printf("N");
            }else {
                System.out.print(A2(array,N)+" ");
            }
            if(A3(array,N) == 0){
                System.out.printf("N");
            }else {
                System.out.print(A3(array,N)+" ");
            }
            if(A4(array,N).equals("0")){
                System.out.printf("N");
            }else {
                System.out.print(A4(array,N)+" ");
            }
            if(A5(array,N) == 0){
                System.out.printf("N");
            }else {
                System.out.print(A5(array,N));
            }
        }
    }
    public static int A1(int[] array,int N){
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if(array[i]%10 == 0){
                sum += array[i];
            }
        }
        return sum;
    }
    public static int A2(int[] array,int N){
        int flag = 1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if(array[i]%5 == 1){
                array[i] *= flag;
                sum += array[i];
                flag *= -1;
            }
        }
        return sum;
    }
    public static int A3(int[] array,int N){
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(array[i]%5 == 2){
                count++;
            }
        }
        return count;
    }
    public static String A4(int[] array, int N){
        double sum = 0;
        double count = 0;
        for (int i = 0; i < N; i++) {
            if(array[i]%5 == 3){
                sum += array[i];
                count++;
            }
        }
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        return nf.format(sum/count);
    }
    public static int A5(int[] array,int N){
        int max = 0;
        for (int i = 0; i < N; i++) {
            if(array[i]%5 == 4){
                max = Math.max(array[i],max);
            }
        }
        return max;
    }
}
