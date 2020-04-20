package LeetCode.p35搜索插入位置;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/19
 **/
public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }
        return nums.length;
    }

    //二分查找法
    public int searchInsert2(int[] nums, int target) {
       int l = 0 , r = nums.length;
       while (l < r){
           int mid = l + (r - l)/2;
           if (target > nums[mid]){
               l = mid + 1;
           }else
               r = mid;
       }

       return l;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert2(new int[]{1, 2, 3, 7, 9, 11}, 12));
    }

}
