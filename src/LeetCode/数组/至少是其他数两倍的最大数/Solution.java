package LeetCode.数组.至少是其他数两倍的最大数;

/**
 * 比较记录
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/7
 **/
public class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        //找到最大值和第二大值
        int max = nums[0];
        int second = -1;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
                //可能小于最大但大于第二大
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }

        return max >= 2 * second ? index : -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.dominantIndex(new int[]{1,0}));
    }
}
