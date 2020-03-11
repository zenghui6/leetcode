package LeetCode.p2买卖股票的最佳时机;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] prices={7,1,5,3,6,4};
        int resoult;
        resoult = solution.maxProfit(prices);
        System.out.println(resoult);
    }
}
