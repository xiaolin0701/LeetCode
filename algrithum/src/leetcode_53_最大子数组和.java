package src;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Integer.MIN_VALUE;

public class leetcode_53_最大子数组和 {
    int maxSumArray( int[] nums ) {
        List< Integer > arrayList = new ArrayList<>();
        int length = nums.length;
        if ( length == 1 ) {
            return nums[ 0 ];
        }
        for ( int i = 0 ; i < length ; ++i ) {
            int sumMax=0;
            for ( int j = i ; j < length ; ++j ) {
                sumMax += nums[ j ];
                arrayList.add( sumMax );
            }
        }
        int ans = arrayList.getFirst();
        for ( int i : arrayList ) {
            ans = Math.max( i , ans );
        }
        return ans;
    }
//前缀和解法
    int maxSumArray_( int[] nums ) {
        int length = nums.length;
        if ( length == 1 ) {
            return nums[ 0 ];
        }
        int[] preNums = new int[length];
        preNums[ 0 ] = nums[ 0 ];
        for ( int i = 1 ; i < length; ++i ) {
            preNums[ i ] = preNums[ i - 1 ] + nums[ i  ];
        }
        int minValue = 0;
        int result = MIN_VALUE;
        for ( int i = 0 ; i < length ; ++i ) {
            result = Math.max( preNums[ i ] - minValue , result );
            minValue = Math.min( preNums[ i ] , minValue );
        }
        return result;
    }

    int maxSumArrayDp( int[] nums ) {
        int length = nums.length;
        if ( length == 1 ) {
            return nums[ 0 ];
        }
        int[] dp = new int[ length ];
        dp[ 0 ] = nums[ 0 ];
        int result = dp[ 0 ];
        for ( int i = 1 ; i < length ; ++i ) {
            if ( dp[ i - 1 ] < 0 ) {
                dp[ i ] = nums[ i ];
            } else dp[ i ] = dp[ i - 1 ] + nums[ i ];
            result = Math.max( dp[ i ] , result );
        }
        return result;
    }

    void main() {
        int[] nums = {-2,-3,-1};
        System.out.println(maxSumArray_( nums ));
    }
}
