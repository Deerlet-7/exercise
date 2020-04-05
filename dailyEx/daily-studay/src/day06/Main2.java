package day06;

/**
 * Created by Deerlet-7 on 2020/4/5 10:06
 * 一组数字中出现次数大于n/2的数
 */
import java.util.*;
public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()/2-1));
    }
}
