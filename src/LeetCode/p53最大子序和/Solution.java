package LeetCode.p53最大子序和;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/19
 **/
public class Solution {
    //1. 暴力法
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j <nums.length; j++) {
                sum += nums[j];
                if (sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    //2. 动态规划
    //动态方程: dp[i] = max(nums[i],dp[i-1] + nums[i])
    //求出每段的最大子序和
    public int maxSubArray2(int[] nums){
        int max = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i],dp[i-1] + nums[i]);
            max = Math.max(max,dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
