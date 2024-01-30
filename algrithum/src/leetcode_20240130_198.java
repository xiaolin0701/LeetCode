package src;
/**
 *@Author ylwang
 *@Date   2024/1/30
 */
//打家劫舍，一维动态规划经典题
//定义子问题
//写出子问题的递推关系
//确定 DP 数组的计算顺序
//空间优化（可选）
public class leetcode_20240130_198 {
    public static int rob(int[] nums) {
        int n=nums.length;
        int[] newN=new int[n+1];
        newN[0]=0;
        newN[1]=nums[ 0 ];
        for(int i=2;i<n+1;++i){
            newN[i]=Math.max(newN[i-1],newN[ i-2 ]+nums[i-1] );
        }
        return newN[n];
    }

    public static void main( String[] args ) {
        int[] nums={2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
