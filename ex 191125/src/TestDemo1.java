//给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
//如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,1};
        System.out.println( uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int count = 0;
        int a = 0;
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <arr.length-i; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if( a == count){
                return false;
            }else {
                a = count;
            }
        }
        return true;
    }
}
