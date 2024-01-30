package src;

import java.util.ArrayList;
import java.util.List;

public class leetcode_20240129_228 {
    public static List<String> summaryRanges( int[] nums) {
        List<String> ret = new ArrayList<String>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->");
                temp.append( nums[ high ] );
            }
            ret.add(temp.toString());
        }
        return ret;
    }

    public static void main( String[] args ) {
        int[] nums={0,1,2,4,5,7};
        System.out.println(summaryRanges( nums ));
    }
}
