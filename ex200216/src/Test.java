import java.util.Scanner;
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        System.out.println("输入要移的位数k：");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Test.rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        int[] nums2 = new int[nums.length];
        for (int i = k; i < nums.length; i++) {
            nums2[i] = nums[i-k];
        }
        for (int i = 0; i < k ; i++) {
            nums2[i] = nums[nums.length-(k-i)];
        }
        for (int x:nums2) {
            System.out.print(x);
            System.out.print(' ');
        }
    }
}
