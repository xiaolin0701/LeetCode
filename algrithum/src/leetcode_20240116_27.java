package src;
/**
 *@Author ylwang
 *@Date   2024/1/16
 */
public class leetcode_20240116_27 {
/*
 *给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 *不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 *元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public static int removeElement(int[] nums, int val) {
    int length= nums.length, left=0,right=0;
    //双指针解决

    while (right<length){
        if(nums[right]==val)  right++;
        else {
            nums[left]=nums[right];
            left++;
            right++;
        }
    }

    return left;
}

    public static void main(String[] args) {
        int[] nums={2,2,3,2,0};
        int i = removeElement(nums, 0);
        System.out.println(i);
    }
}
