package src;

/**
 *@Author ylwang
 *@Date   2024/1/13
 */
public class leetcode_50_20230113 {
    //实现 pow(x, n) ，即计算 x 的整数 n 次幂函数。
    public static double myPow(double x, int n) {
        /*
         *对于这道题，使用快速幂来完成，总体上是递归和分治的思想进行。
         *并不止于次，还考虑了整数，浮点长度溢出的问题
         */
        long N = n;
        return N >=0 ? quickpow(x,N) : 1.0 / quickpow(x,-N);
    }
    public static double quickpow(double x,long y){
        double ret =1.0;
        while (y!=0){
            if((y&1)!=0){
                ret*=x;
            }
            x*=x;
            y>>=1;
        }
        return ret;
    }
    //对于求幂，可以有递归，即为从等式的右边开始，可以展开为二进制后迭代由等式的左边开始。
    public static void main(String[] args) {
        System.out.println(myPow(2,-10));
    }
    //我学到的：分情况讨论，由简入难
}
