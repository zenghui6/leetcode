package LeetCode.p2买卖股票的最佳时机;

class Solution {
     int maxProfit(int[] prices) {
      int resoult=0;
      for(int i=0;i<prices.length-1;i++){
          int diff=0;
          diff = prices[i+1] -prices[i];
          if(diff>0)
             resoult += diff;
      }
      return resoult;
    }
}
