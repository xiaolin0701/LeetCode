package src;
/**
 *@Author ylwang
 *@Date   2024/2/1
 */
public class leetcode_20240131_121 {
    //给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
    //
    //你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
    //
    //返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==1) return 0;
        int num=0,maxProfit=0;
        int[] profit=new int[n*(n-1)/2];
        for(int i=0;i<n-1;++i){
            for ( int j=i+1;j<n;++j ){
                profit[num]=prices[j]-prices[i];
                maxProfit=Math.max( profit[num],maxProfit );
                num++;
            }
        }
        return maxProfit;
    }
    public static int maxProfit_2(int[] prices){
        int n=prices.length;
        if(n==1) return 0;
        int[] profit=new int[n];
        int minPrice=prices[0],maxProfit=0;
        for(int i=0;i<n;i++){
            minPrice=Math.min( minPrice,prices[i] );
            profit[i]=prices[i]-minPrice;
            maxProfit=Math.max( maxProfit,profit[i] );
        }
        return maxProfit;
    }

    public static void main( String[] args ) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit( prices ));
        System.out.println(maxProfit_2( prices ));
    }
}
