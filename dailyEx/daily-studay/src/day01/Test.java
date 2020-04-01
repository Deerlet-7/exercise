package day01;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {2,4,1,5,8};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void quickSort(int[] a){
        int i;
        for( i = 0;i < a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    swap(a,i,j);
                }
            }
        }
    }
    public static void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
