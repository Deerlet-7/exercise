import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Deerlet-7 on 2020/8/28 13:59
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[][] arr = new int[num][2];
            for (int i = 0; i < num; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            judge(arr,num);
        }
    }
    public static void judge(int[][] arr,int num){
        Set<int[]> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                if(!((arr[i][0]>arr[j][0]) || (arr[i][1]>arr[j][1]))){
                    set.add(arr[i]);
                }
            }
        }
        for (int[] a:set) {
            System.out.println(a[0]+" "+a[1]);
        }
    }
}