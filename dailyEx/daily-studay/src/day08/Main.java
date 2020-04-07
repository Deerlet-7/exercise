package day08;

import java.util.*;

/**
 * Created by Deerlet-7 on 2020/4/7 22:01
 * 删数
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n>=1000){
                n=999;
            }
            System.out.println(operat(n));
        }
    }
    public static int operat(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(i);
        }
        int i = 0;
        while(list.size()>1){
            i = (i+2)%list.size();
            list.remove(i);
        }
        return list.get(0);
    }
}
