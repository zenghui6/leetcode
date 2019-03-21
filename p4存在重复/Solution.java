package p4存在重复;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: leetcode
 * @description: 解决方法
 * @author: Mr.Zeng
 * @create: 2019-03-21 19:11
 **/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);//先排序
        for (int i=0;i<nums.length-1;i++){ //最多倒数第二个为
            if (nums[i] == nums[i+1])
                return true;
        }
        return  false;
    }
}
