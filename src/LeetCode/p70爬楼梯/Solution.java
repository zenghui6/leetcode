package LeetCode.p70爬楼梯;

/**
 * 动态规划
 * 因为它只有两种跳法，1，2
 * dp[n] = dp[n-1] + dp[n-2]
 */
public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];

        //从1开始方便理解
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
