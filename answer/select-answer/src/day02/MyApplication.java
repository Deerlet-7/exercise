package day02;

/**
 * Created by Deerlet-7 on 2020/4/2 15:18
 */
class Test {
    static int a = 8;
    public static void hello() {
        System.out.println("hello");
    }
}
public class MyApplication {
    public static void main(String[] args) {
        Test test=null;
        test.hello();
        System.out.println(test.a = 4);
    }
}
