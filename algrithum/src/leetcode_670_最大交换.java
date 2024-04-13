package src;
import java.util.*;


public class leetcode_670_最大交换 {
    int maximumSum( int nums ) {
        ArrayList< Integer > arrayList = new ArrayList<>();
        while ( nums > 0 ) {
            arrayList.add( nums % 10 );
            nums /= 10;
        }
        int size = arrayList.size();
        int[] numsArray = new int[size];
        for ( int i = 0 ; i < size ; ++i ) {
            numsArray[ i ] = arrayList.get( i );
        }
        int[] MaxNum = Arrays.copyOf( numsArray , size );
        Arrays.sort( MaxNum );
        int sign=1;
        for ( int i = size - 1 ; i > 0 ; --i ) {
            if ( sign == 0 ) {
                break;
            }
            if ( MaxNum[ i ] != numsArray[ i ] ) {
                for ( int j = 0 ; j < i ; ++j ) {
                    if ( numsArray[ j ] == MaxNum[ i ] ) {
                        numsArray[ j ] = numsArray[ i ];
                        numsArray[ i ] = MaxNum[ i ];
                        sign=0;
                    }
                }
            }
        }
        int resultNum = 0, byteLength = 1;
        for ( int i = 0 ; i <size ; ++i ) {
            resultNum += numsArray[ i ] * byteLength;
            byteLength *= 10;
        }
        return resultNum;
    }

    void main() {
        int b = 987664515;
        System.out.println( maximumSum( b ) );
    }
}
