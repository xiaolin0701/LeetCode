package src;

import java.util.*;

public class solution {
    //如果一个字符串不含有任何重复字符，我们称这个字符串为 “好” 字符串。给你一个字符串 s ，请你返回 s 中长度为 3 的 “好”子字符串 的数量。注意，如果相同的“好”子字符串出现多次，每一次都应该被记入答案之中。子字符串 是一个字符串中连续的字符序列。
//
//示例 1：
//
//输入：s = "xyzzaz"
//
//输出：1
//
//解释：总共有 4 个长度为 3 的子字符串："xyz"，"yzz"，"zza" 和 "zaz" 。
//
//唯一的长度为 3 的好子字符串是 "xyz" 。
//
//示例 2：
//
//输入：s = "aababcabc"
//
//输出：4
//
//解释：总共有 7 个长度为 3 的子字符串："aab"，"aba"，"bab"，"abc"，"bca"，"cab" 和 "abc" 。
//
//好子字符串包括 "abc"，"bca"，"cab" 和 "abc" 。
    int findGoodString( String s ) {
        int goodStringNum = 0;
        char[] sToCharArray = s.toCharArray();
        for ( int i = 0 ; i < sToCharArray.length-3 ; ++i ) {


            
        }
        return  goodStringNum;
    }

    void main() {
        System.out.println(findGoodString( "xyzzaz" ));
    }

}
