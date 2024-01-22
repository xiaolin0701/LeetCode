package src;

import java.util.HashMap;

/**
 *@Author ylwang
 *@Date   2024/1/23
 */
public class leetcode_20240123_169 {
    //给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    //还可以用投票法、排序后取中位数法（因为题目中已知总是存在这样的元素）
    public static int majorityElement(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        if(nums.length==1)  return nums[ 0 ];
        for(int i:nums){
                 if(!hashMap.containsKey(i)){
                     hashMap.put( i,1 );
                 }else {
                     if(hashMap.get( i )>=n/2) {
                         System.out.println(hashMap);
                         return i;
                     }
                     hashMap.put(i,hashMap.get( i )+1);
                 }
        }
        return  0;
    }

    public static void main( String[] args ) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(  nums ));
    }
}
