package src;

public class splitBalancedString {
    void solution(String s) {
        int length = s.length();
        int[] sumASCII=new int[length];
        char[] sToCharArray = s.toCharArray();
        int left=1,right=length-2,sumLeft,sumRight,sumMiddle;
        sumASCII[ 0 ] = sToCharArray[ 0 ];
        for ( int i = 1 ; i < length ; ++i ) {
            sumASCII[i] = sToCharArray[i]+sumASCII[i-1];
        }
        while ( left < right-1 ) {
            sumLeft = sumASCII[ left-1 ];
            sumRight = sumASCII[ length - 1 ] - sumASCII[ right ];
            sumMiddle = sumASCII[ right - 1 ] - sumASCII[ left ];
            System.out.println(STR."\{left},\{right}");
            if ( sumRight == sumMiddle && sumRight == sumLeft ) {
                System.out.println( STR."\{left},\{right}" );
                return;
            }
            if (sumLeft<sumRight ) {
                left++;
            }else right--;
        }
        System.out.println("0,0");
    }

    void main() {
        solution( "bcdabcdacdb" );
    }
}
