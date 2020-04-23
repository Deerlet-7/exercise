package day21;

/**
 * Created by Deerlet-7 on 2020/4/23 22:18
 * 统计每个月兔子总数
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month;
        while(sc.hasNext()){
            month = sc.nextInt();
            System.out.println(rebitNum(month));
        }
    }
    public static int rebitNum(int month){
        if(month < 3){
            return 1;
        }
        return rebitNum(month -1) + rebitNum(month - 2);
    }
}