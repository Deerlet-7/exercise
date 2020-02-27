import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();//collection接口实例化一个ArrayList对象
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("我");
        list.add("爱");
        list.add("java");
        System.out.println(list.size() );
        System.out.println(list.isEmpty());
        Object[] array = list.toArray();
       /* int[] arr = new int[]{1,2,3,4};
        arr.toString();
        for (int c:arr) {
            System.out.print(c);
        }
        System.out.println(array.toString());*/
      /* array.toString();
        for (Object c:array) {
            System.out.print(c);
        }
        System.out.println();*/
        System.out.println(Arrays.toString(array));
        for (String s:list) {
            System.out.println(s);
        }
        list.remove("爱");
        for (String c:list) {
            System.out.print(c);
        }
        System.out.println();
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
