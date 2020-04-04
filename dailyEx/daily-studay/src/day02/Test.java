package day02;

/**
 * Created by Deerlet-7 on 2020/4/3 12:05
 * 数组中的逆序对
 */
public class Test {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5,6,7,0};
        System.out.println(count(A,A.length));
    }
    public static int count(int[] a , int n ){
        int count = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = (i+1); j < n ; j++) {
                if(a[i]>a[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
