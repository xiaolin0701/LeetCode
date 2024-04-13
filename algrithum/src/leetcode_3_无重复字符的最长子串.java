package src;

import java.util.HashSet;
import java.util.Set;


public class leetcode_3_无重复字符的最长子串 {
    int longestLengthOfNoRepeat( String s ) {
        int right = -1,length=0;
        char[] sToChar = s.toCharArray();
        Set< Character > set = new HashSet<>();
        for ( int i = 0 ; i < sToChar.length ; ++i ) {
            if ( i != 0 ) {
                set.remove( sToChar[ i-1 ] );
            }
            while ( right+1<sToChar.length&&!set.contains( sToChar[right+1] ) ){
                set.add( sToChar[right+1] );
                right++;
            }
            length = Math.max( length , right - i + 1 );
        }
        return length;

    }

    void main() {
        System.out.println( longestLengthOfNoRepeat( "abcabcabcd" ) );
    }

}
