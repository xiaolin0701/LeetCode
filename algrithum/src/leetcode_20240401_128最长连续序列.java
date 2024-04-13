package src;

import java.util.*;

public class leetcode_20240401_128最长连续序列 {
    int longestConsecutive( int[] nums ) {
        Set< Integer > set = new HashSet<>();
        for ( int i : nums ) {
            set.add( i );
        }
        Integer[] integers = set.toArray( new Integer[ 0 ] );
        nums = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {
            nums[i] = integers[ i ];
        }
        int ans=0;
        Arrays.sort( nums );
        if ( nums.length == 1 ) {
            return 1;
        }
        for ( int i = 0 ; i < nums.length-1 ; i++ ) {
            int count=1;
            if ( nums[ i + 1 ] - nums[ i ] != 1 ) {
                ans=Math.max( 1,ans );
            }
            else {
                while ( i < nums.length - 1 && nums[ i + 1 ] - nums[ i ] == 1 ) {
                    count++;
                    i++;
                }
                ans=Math.max( count,ans );
                i--;
            }
        }
        return ans;
    }

    void main( String[] args ) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive( nums ));
    }
}
