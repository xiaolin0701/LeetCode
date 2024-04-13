package src;
public class leetcode_20240329_367 {
    public int isPureSquare(int[] num,int target) {
        int left=0;
        int right=num.length-1;
        while ( left <= right ) {
            int middle=(left+right)/2;
            if ( num[ middle ] > target ) {
                right=middle-1;
            } else if ( num[ middle ] < target ) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public boolean isPerfectSquare( int num ) {
        if ( num == 1 ) {
            return true;
        }
        int left=1,right=num/2;
        while ( left <= right ) {
            int middle = ( left + right ) / 2;
            long result= (long) middle *middle;
            if (result < num ) {
                left = middle + 1;
            } else if ( result > num ) {
                right=middle-1;
            } else return true;
        }
        return false;
    }

    void main() {
        for ( int i = 1 ; i < 100 ; ++i ) {
            int[] num = {1 , 2 , 3 , 4 , 5};
            System.out.println(isPureSquare(num,5));
        }
    }
    }




