public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);//实参
    }
    public static void printArray(int[] a) { //形参
        for (int x : a) {
            System.out.println(x);
        }
    }

}
