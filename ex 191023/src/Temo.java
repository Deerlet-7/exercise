//一个错误代码，警醒不好好学习的自己
import java.util;
public class Temo {
    public static void main(String[] args) {
        int[] array =new int[]{2,4,5,6,8};
        System.out.println(toString.array);
        System.out.println(toString.fun(array));
    }
    public static int[] fun(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i]*2;
        }
        return tmp;
    }
}
