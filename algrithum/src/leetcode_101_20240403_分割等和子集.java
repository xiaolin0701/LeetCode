package src;

public class leetcode_101_20240403_分割等和子集 {
    boolean canPartition( int[] nums ) {
        int sum = 0;
        for ( int i : nums ) {
            sum += i;
        }
        if ( sum % 2 != 0 ) {
            return false;
        }
        int length = nums.length;
        boolean[][] dp = new boolean[ length ][ sum / 2 + 1 ];
        for ( int i = 0 ; i < length ; ++i ) {
            dp[ i ][ 0 ] = true;
        }
        dp[ 0 ][ nums[ 0 ] ] = true;
        for ( int i = 0 ; i < length ; ++i ) {

        }
        return dp[ length - 1 ][ sum / 2 ];
    }
}
