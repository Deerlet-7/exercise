public class TestDemo1 {

    //完成toString函数
    public static void main(String[] args) {
        int[] arr = {3,5,7};
        String arr2 = toString(arr);
        System.out.println(arr2);
    }
    public static String toString(int[] array){
        String ret ="[";
        for (int i = 0; i <array.length ; i++) {
            ret += array[i];
            if(i != array.length){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }


    //将数组中的每个元素都 * 2
    public static void main6(String[] args) {
        int[] arr = {2,3,5,6};
        int[] output = transfrom(arr);
        show(arr);
        show2(output);
    }
    public static void show(int[] out){
        for (int x:out) {
            System.out.println(x);
        }
    }
    public static void show2(int[] out2){
        for (int x:out2) {
            System.out.println(x);
        }
    }
    public static int[] transfrom(int[] array){
        int[] ret =new int [array.length];
        for (int i = 0; i <array.length ; i++) {
            ret[i] = array[i]*2;
        }
        return ret;
    }
    public static void transfrom1(int[] arr1){
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]*2);
        }
    }


    public static void main5(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(arr[0]);
        func(arr);
    }
    public static void func(int[] a){
        a[0] = 13;
        System.out.println(a[0]);
    }


    public static void main4(String[] args) {
        int num = 3;
        fun(num);
        System.out.println("num:" + num);
    }
    public static void fun(int x) {
        x = 10;
        System.out.println("num:" + x);
    }



    //数组作为参数
    public static void main3(String[] args) {
        int[] arr = new int[] {2,3,5,6,7};
        Show(arr);
    }
    public static void Show(int[] array) {
        for (int x:array) {
            System.out.println(x);
        }
    }


    //遍历数组
    public static void main2(String[] args) {
        int[] array = new int[]{1,2,3,6,0};
        for (int x:array) {
            System.out.println(x);
        }
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i]);
//        }
    }

    //数组长度；下标访问数组
    public static void main1(String[] args) {
        int[] array = new int[]{1,2,3,6,8};
        System.out.println("length:"+array.length);
        System.out.println(array[4]);
    }
}
