package src;

import java.util.Locale;

/**
 *@Author ylwang
 *@Date   2024/1/18
 */
public class leetcode_20240118_125 {
    //验证回文串
    //如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
    //
    //字母和数字都属于字母数字字符。
    //
    //给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
    public static boolean isPalindrome(String s) {
        char[] newS= s.toLowerCase().replaceAll( "[^a-z0-9]" , "" ).toCharArray();
        int length=newS.length;
        for(int i=0;i<length/2;i++){
            if(newS[i]!=newS[length-1-i])   return false;
        }
        return true;
    }

    public static void main( String[] args ) {
        System.out.println(isPalindrome("0P"));
    }
}
