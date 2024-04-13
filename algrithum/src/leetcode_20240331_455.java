package src;

import java.util.Arrays;

public class leetcode_20240331_455 {
    public int findContentChildren( int[] g , int[] s ) {
        int result;
        Arrays.sort( g );
        Arrays.sort( s );
        int bNum=0,count=0;
        for ( int j : s ) {
            if ( bNum == g.length ) {
                break;
            }
            if ( j >= g[ bNum ] ) {
                count++;
                bNum++;
            }
        }
        return count;
    }
}
