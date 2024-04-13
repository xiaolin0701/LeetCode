package src;

import java.util.Arrays;

public class leetcode_20240315_135 {
    void main(){
        int[] candies={1,2,4,1,2,34,143,1235,14,1234,124,124,1,653,234,5,51,514,124};
        int length=candies.length;
        int[] left=new int[length];
        for(int i=0;i<length;i++){
            if((i>0)&&(candies[i-1]<candies[i])){
                left[i]=left[i-1]+1;
            }else left[i]=1;
        }
        System.out.println( Arrays.toString( left ) );
        int right=0,result=0;
        for ( int i = length-1 ; i >=0; i-- ) {

            if(i<length-1&&(candies[i]>candies[i+1]))
            {
                right++;

            }else{
               right=1;
            }
            System.out.print( STR."\{right} " );
            result+=Math.max( right,left[i] );
        }
        System.out.println(result);
    }

}
