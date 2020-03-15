package LeetCode.p300最长上升子序列;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/3/14
 **/
public class Solution {
    //二分
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        int len = 0;
        for (int num: nums) {
            int idx = Arrays.binarySearch(res, 0, len, num);
            idx = idx < 0? -idx - 1: idx;
            res[idx] = num;
            if (idx == len) {
                len++;
            }
        }
        return len;
    }

    //动态规划
}
