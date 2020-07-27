package day31;

import java.util.*;

/**
 * Created by Deerlet-7 on 2020/6/27 20:18
 *简单错误记录
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String, Integer>();
        while (sc.hasNext()){
            String path = sc.next();
            int id = path.lastIndexOf("\\");
            String failname = id == -1?path:path.substring(id+1);
            int line = sc.nextInt();
            String key = failname +" " + line;
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue()-a.getValue();
            }
        });
        int m = 0;
        for (Map.Entry<String,Integer> mapping:list) {
            if(m>=8){
                break;
            }
            String[] str = mapping.getKey().split(" ");
            String filename = str[0];
            if(filename.length()>16){
                filename = filename.substring(filename.length()-16);
            }
                String n = str[1];
                Integer count = mapping.getValue();
                System.out.printf("%s %s %d%n",filename,n,count);
                m++;
            }
        }
    }
