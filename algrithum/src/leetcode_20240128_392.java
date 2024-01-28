package src;
//判断子序列，指针
public class leetcode_20240128_392 {
    public static boolean isSubsequence( String s , String t ) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int slength = s.length();
        int tlength = t.length();
        int tnum = 0;
        for ( int snum = 0 ; snum < slength ; ++snum ) {
            //t剩下的没有s剩下的长
            if ( tlength - tnum < slength - snum ) return false;
            while ( sArray[ snum ] != tArray[ tnum ] ) {
                //执行到最后一位还是不等
                if ( tnum == tlength - 1 ) return false;
                tnum++;
            }
            //相等或是不等t这一位都用完了。所以都要进位
            tnum++;
        }
        return true;
    }

    public static void main( String[] args ) {
        System.out.println( isSubsequence( "axc" , "ahbgdc" ) );
    }
}
