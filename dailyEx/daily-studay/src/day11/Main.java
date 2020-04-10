package day11;

/**
 * Created by Deerlet-7 on 2020/4/10 14:56
 * 个位数统计15
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] arr = new int[10];
        for(int i = 0; i < n.length(); i++){
            arr[n.charAt(i)- 48]++;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                System.out.println(i+":"+arr[i]);
            }
        }
    }
}
