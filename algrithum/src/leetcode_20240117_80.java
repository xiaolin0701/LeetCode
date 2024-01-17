package src;

/**
 *@Author ylwang
 *@Date   2024/1/17
 */
public class leetcode_20240117_80 {
    /*
     *给你一个有序数组 nums ，
     *请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
     *不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */
    public static int removeDuplicates(int[] nums) {
        int left=2,right=2,i=0;
        if(nums.length<=2)  return nums.length;
        while (right< nums.length){
            if((nums[right]!=nums[left-2])){
                nums[left]=nums[right];
                left++;
            }
                right++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3,3,4,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
}
