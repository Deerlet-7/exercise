package test;

import java.util.ArrayList;

/**
 * Created by Deerlet-7 on 2020/7/27 15:27
 * 最小的k个数
 */
public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k>input.length||k<0){
            return list;
        }
        for(int i = 0;i<input.length-1;i++){
            for(int j = i+1;j<input.length;j++){
                if(input[i]>input[j]){
                    int tem = input[i];
                    input[i] = input[j];
                    input[j] = tem;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
}