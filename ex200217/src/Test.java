import java.util.Scanner;
//给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,5,2,3,6,3};
        System.out.println("输入val值：");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(Test.removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int jug = 0;
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;
                jug = 1;
            }
            if(jug == 1){
                i-=1;
            }
        }
        return n;
    }
}
