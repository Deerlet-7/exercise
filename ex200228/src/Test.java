public class Test {
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    public static void main1(String[] args) {
        int[] nums = new int[]{2,3,5,6,8,9};
        int target = 4;
        System.out.println(Test.searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if(nums[i]>=target){
                break;
            }
        }
        return i;
    }
}