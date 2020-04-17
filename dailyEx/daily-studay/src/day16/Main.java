package day16;

/**
 * Created by Deerlet-7 on 2020/4/17 13:39
 * 洗牌
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();
        while (groups-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] ans = new int[2*n];
            for (int i = 0; i < 2 * n; i++) {
                int tmp = i;
                for (int j = 0; j < k; j++) {
                    if(tmp < n){
                        tmp = 2 * (tmp +1) -1;//((n - tmp) * 2) - 1;
                    }else {
                        tmp = 2 * ((tmp+1) -n);
                    }
                }
                ans[tmp] = sc.nextInt();
            }
            if(ans.length> 0) System.out.print(ans[0]);
            for(int i = 1;i< 2*n;i++){
                System.out.print(" "+ans[i]);
            }
            System.out.println();
        }
    }
}