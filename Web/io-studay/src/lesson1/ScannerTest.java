package lesson1;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/6/4 14:06
 */
public class ScannerTest {
    public static void main(String[] args){
        //1、Scanner都是阻塞方法，造成当前线程阻塞
        //2、满足一定条件才返回：
        // hasNext满足换行符、空格等特殊字符
        //hasNextLine满足换行符
        //hasNextInt读取到不满足int的字符
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
