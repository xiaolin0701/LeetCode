package src;

import java.math.BigInteger;

public class al_20240113 {
    //给定一个整数 n ，返回 n! 结果中尾随零的数量。
    public static int trailingZeroes(int n) {
        int ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }
}
