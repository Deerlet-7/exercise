package day06;

/**
 * Created by Deerlet-7 on 2020/4/5 9:25
 * 计算糖果
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        while (sc.hasNext()){
            for(int i = 0;i<4;i++){
                num[i] = sc.nextInt();
            }
        }
        opreat(num);
    }
    public static void opreat(int[] num){
        if((((num[0]+num[2])%2)!=0)||(((num[1]+num[3])%2)!=0)||(num[3]-((num[1]+num[3])/2)<0)){
            System.out.print("No");
            return;
        }
        int A = (num[0]+num[2])/2;
        int B = (num[1]+num[3])/2;
        int C = num[3] - B;
        if(A<0||B<0||C<0){
            System.out.print("No");
            return;
        }
        int[] ans = {A,B,C};
        for(int i = 0; i<2;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.print(ans[2]);
    }
}
