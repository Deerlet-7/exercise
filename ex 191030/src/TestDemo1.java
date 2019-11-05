import java.util.Arrays;
public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        printArry(arr);
        String out =Arrays.toString(transform(arr));
        System.out.println(out);
    }
    public static void printArry(int[] arr){//遍历数组
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static int[] transform(int[] arr//实现乘二功能
        int[] ret = arr;
        for (int i = 0; i <ret.length ; i++) {
            arr[i] = arr[i] *2;
        }
        return ret;
    }
}
