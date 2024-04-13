package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_5_20240411_最长回文子串 {
    String MaxLength( String s ) {
        int length = s.length();
        if ( length < 2 ) {
            return s;
        }
        Boolean[][] dp = new Boolean[length][length];
        for ( int i = 0 ; i < length ; ++i ) {
            dp[ i ][ i ] = true;
        }
        int maxLength = 1, begin = 0;
        char[] sToCharArray = s.toCharArray();
        for ( int L = 2 ; L <= length ; L++ ) {
            for ( int i = 0 ; i < length  ; ++i ) {
                int j = L + i - 1;
                if ( j >= length ) {
                    break;
                }
                if ( sToCharArray[ i ] != sToCharArray[ j ] ) {
                    dp[ i ][ j ] = false;
                }else {
                    if ( j - i <= 2 ) {
                        dp[ i ][ j ] = true;
                    } else {
                        dp[ i ][ j ] = dp[ i + 1 ][ j - 1 ];
                    }
                }
                if ( dp[ i ][ j ] && j - i + 1 > maxLength ) {
                    maxLength = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring( begin , begin + maxLength );

    }

    String violet( String s ) {
        int length = s.length();
        if ( length == 1 ) {
            return s;
        }
        List< String > list = new ArrayList<>();
        for ( int i = 0 ; i < length ; ++i ) {
            StringBuilder string = new StringBuilder();
            for ( int j = i ; j < length ; ++j ) {
                string.append( s.toCharArray()[ j ] );
                String string1 = string.toString();
                list.add( string1 );
            }
        }
        HashMap<Integer,String> hashMap=new HashMap<>();
        int Max=0;
        for ( String stringBuilder : list ) {
            int size = stringBuilder.length();
            char[] sbToChar = stringBuilder.toCharArray();
            boolean isTrue = true;
            for ( int i = 0 ; i < (size) / 2 ; ++i ) {
                if ( sbToChar[ i ] != sbToChar[ size - 1 - i ] ) {
                    isTrue = false;
                    break;
                }
            }
            if ( isTrue ) {
                hashMap.put(  size ,stringBuilder );
                Max = Math.max( size , Max );
            }
        }
        return hashMap.get( Max );
    }

    void main() {
        System.out.println(violet( "658asddsabbb" ));
    }
}
