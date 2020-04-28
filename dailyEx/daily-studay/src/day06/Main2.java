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

/*
import java.util.*;
public class day26.Main.Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int num = arr[0];
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                } else if (count > 0) {
                    count--;
                } else {
                    num = arr[j];
                }
            }
            System.out.println(num);
        }
    }
}*/
