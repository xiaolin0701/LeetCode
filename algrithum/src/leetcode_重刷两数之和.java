package src;

import java.util.HashMap;
import java.util.Map;

public class leetcode_重刷两数之和 {
    int[] twoSum( int[] nums , int target ) {
        int location=0;
        Map< Integer, Integer > hashmap = new HashMap<>();
        for ( int i : nums ) {
            if ( !hashmap.containsKey( target - i ) ) {
                hashmap.put( i , location );
                location++;
            }else {
                int[] ans = {location , hashmap.get( target - i )};
                return ans;
            }
        }
        return new int[2];
    }
}
