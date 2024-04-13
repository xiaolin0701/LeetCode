package src;

public class leetcode_20210330_541 {
    public String reverseStr( String s , int k ) {
        char[] strToChar=s.toCharArray();
        int length=strToChar.length;
        int left=0,right=k-1;
        while ( left<length-1 ) {
            reverseStrPart( strToChar , left , Math.min( right , length - 1 ) );
            left += 2*k;
            right += 2*k;
        }
        return String.copyValueOf( strToChar );
    }


    public void reverseStrPart( char[] s, int left , int right ) {
        char curr;
        while ( left <= right ) {
            curr = s[ left ];
            s[ left ] = s[ right ];
            s[ right ] = curr;
            left++;
            right--;
        }
    }
}
