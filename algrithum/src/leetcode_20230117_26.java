package src;
/**
 *@Author ylwang
 *@Date   2024/1/17
 */
public class leetcode_20230117_26 {
    /*
     *给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，
     *使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
     *然后返回 nums 中唯一元素的个数。
     */
    public static int removeDuplicates(int[] nums) {

        int left=0,right=1,i=0;

        while (right< nums.length){

            if(nums[right]!=nums[left]){
                nums[left+1]=nums[right];
                right++;
                left++;
            }else {
                right++;
            }

        }
        return left+1;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

}
