package webTest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Deerlet-7 on 2020/6/12 18:42
 * 数组中值出现了一次的数字
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            fun(arr);
        }
    }
    public static void fun(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer c : arr) {
            int k = map.getOrDefault(c, 0);
            map.put(c, k + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 1) {
                System.out.print(e.getKey() + " ");
            }
        }
        System.out.print("\n");
    }
}
