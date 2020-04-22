package day20;

import java.util.Arrays;

/**
 * Created by Deerlet-7 on 2020/4/22 22:32
 * 微信红包
 */
public class Gift {
    public static void main(String[] args) {
        int[] gifts = {1,2,3,2,2};
        int n = gifts.length;
        System.out.println(getValue(gifts,n));
    }
    public static int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int k = gifts[n/2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(gifts[i] == k){
                count++;
            }
        }
        if (count>(n/2)){
            return k;
        }
        return 0;
    }
}
