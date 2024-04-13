package src;

public class leetcode_14_最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if ( strs.length == 0 ) {
            return "";
        }
        int nums = 0;
        StringBuilder ans= new StringBuilder();
        while ( nums < strs[ 0 ].length() ) {
            char curChar = strs[ 0 ].charAt( nums );
            for ( String str : strs ) {
                if ( str.length()<=nums||str.charAt( nums ) != curChar ) {
                    return ans.toString();
                }
            }
            ans.append( curChar );
            nums++;
        }
        if ( ans.toString().isEmpty() )
            return "false";
        return ans.toString();
    }
}
