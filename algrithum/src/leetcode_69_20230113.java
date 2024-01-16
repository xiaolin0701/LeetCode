/**
 *@Author ylwang
 *@Date   2024/1/13
 */
package src;

public class leetcode_69_20230113 {
    //给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
    public int mySqrt(int x) {
        for(long i=0;i<=x;i++){
            if(i*i<=(long)x&&(i+1)*(i+1)>(long)x)
                return (int)i;
        }

        return 0;
    }
}
