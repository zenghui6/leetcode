package LeetCode.数组.寻找数组中心的索引;

/** 前缀和算法
 * 满足公式 sum = 2 leftSum + nums[i]    return i
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/7
 **/
public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0 ;
        for (int i : nums) sum += i;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + 2*leftSum == sum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.pivotIndex(new int[] {-1,-1,-1,-1,-1,-1});
    }
}
