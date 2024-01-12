package src;
import java.util.Arrays;

public class Solution {


        public static int[] plusOne(int[] digits) {

            int length=digits.length;

            for(int i=0;i<length;i++){

                if(i==length-1)  digits[i]++;

            }

            char[] charDigits= Arrays.toString(digits).toCharArray();

            int challenger=charDigits.length;

            int[] newDigits =new int[challenger];

            int counter=0;

            for(int j=0;j<challenger;j++){

                newDigits[j]= Character.getNumericValue(charDigits[counter]);

                counter++;

            }

            return newDigits;
        }


    public static void main() {

        int[] nums1={1,2,3,4,5,0,0,0,0,0};

        System.out.println(Arrays.toString(plusOne(nums1)));
    }
}
