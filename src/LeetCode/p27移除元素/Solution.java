package LeetCode.p27移除元素;

/**
 * @ClassName Solution
 * @Description: 将val 值移到最后,返回修改后的数组长度
 * @Author zeng
 * @Date 2020/3/26
 **/
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int tag = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[tag] = nums[i];
                tag ++;
            }
        }
        return tag;
    }
}
