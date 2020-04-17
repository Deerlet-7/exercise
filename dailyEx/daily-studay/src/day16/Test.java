package day16;

/**
 * Created by Deerlet-7 on 2020/4/17 15:48
 * 统计同成绩学生人数
 */
import java.util.*;
public class Test{
    public static void main(String[] aegs){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            if(N == 0){
                return;
            }
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            int count = 0;
            for(int i = 0; i < N; i++){
                if(arr[i] == key){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
