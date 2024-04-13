package src;

import java.text.Format;

public class leetcode_1221_分割平衡字符串 {
    int MaxBalancedStringSplit(String s) {
        int count=0;
        int LNum=0,RNum=0;
        for ( char a : s.toCharArray() ) {
            if ( a == 'L' ) {
                LNum++;
            }else RNum++;
            if ( LNum==RNum )   count++;
        }
        return count;
    }

}
