package src;

public class leetcode_20240309_238 {
    public int[] productExceptSelf(int[] nums){
        int length=nums.length;
        int[] newIntLeft=new int[length];
        int[] newIntRight=new int[length];
        newIntLeft[0]=1;
        for(int i=1;i<length;i++){
            newIntLeft[i]=nums[i-1]*newIntLeft[i-1];
        }
        newIntRight[length-1]=1;
        for(int i=length-2;i>=0;i--){
            newIntRight[i]=newIntRight[i+1]*nums[i+1];
        }
        int[] resultNum=new int[length];
        for(int i=0;i<length;i++){
            resultNum[i]=newIntLeft[i]*newIntRight[i];
        }
        return  resultNum;
    }
}
