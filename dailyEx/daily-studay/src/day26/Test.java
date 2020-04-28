package day26;

import java.util.*;

/**
 * Created by Deerlet-7 on 2020/4/28 14:17
 * 记票统计
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            //统计候选者
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            String[] candidate = str.split(" ");
            LinkedHashMap<String,Integer>  map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(candidate[i],0);
            }
            map.put("Invalid", 0);
            //统计投票
            int m = sc.nextInt();
            sc.nextLine();
            String str2 = sc.nextLine();
            String[] poll = str2.split(" ");
            for (int i = 0; i < m; i++) {
                if(map.containsKey(poll[i])){
                    map.put(poll[i],map.get(poll[i])+1);
                }else {
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            Set<String> s = map.keySet();
            for (String st: s) {
                System.out.println(st + " : " + map.get(st));
            }
        }
    }
}
