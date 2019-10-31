import java.util.Arrays;

public class TestDemo1 {
    //数组拷贝
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,7,9};
        write(arr);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        write(arr2);
        int[] arr3 = myCopyOf(arr,arr.length);
        write(arr3);
    }
    public static void write(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] myCopyOf(int[] arr,int length){
        int[] ret = new int[length];
        for (int i = 0; i < length; i++) {
            ret[i] = arr[i] ;
        }
        return ret;
    }
}
