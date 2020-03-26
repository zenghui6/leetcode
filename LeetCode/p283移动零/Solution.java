package LeetCode.p283移动零;

/**
 * @ClassName Solution
 * @Description: 一个标记指向0地址, 变量数组,遇到非0 与 0交换
 * @Author zeng
 * @Date 2020/3/26
 **/
public class Solution {
    public void moveZeroes(int[] nums) {
        int tag = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                if (tag != i)//指向同一个就不用交换了,直接后移就行
                   { //交换,不要交换,后面直接赋值0就行
                    nums[tag] = nums[i];
                    nums[i] = 0;
                   }
                tag++;
            }
        }
    }
}
