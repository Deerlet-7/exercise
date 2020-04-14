package day14;

/**
 * Created by Deerlet-7 on 2020/4/14 22:05
 * 组个最小数
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,3,2,0,0,7,0,4,3,3};
        /*for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }*/
        int k = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            if(arr[0] != 0 && k == 0){
                for (int j = 1; j < 10; j++) {
                    if(arr[j] != 0){
                        sb.append(j);
                        arr[j]--;
                        k++;
                        break;
                    }
                }
                k++;
            }
            if(arr[i] != 0){
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i);
                }
            }
        }
        System.out.println(sb);
    }
}
