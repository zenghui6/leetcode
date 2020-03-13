package LeetCode.p169多数元素;

import java.util.*;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/3/13
 **/
public class Solution {
    /**
     * 方法1,使用map计数,判断谁数最多
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = -1;
        for (int k : nums) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else
                map.put(k, 1);
        }

        int res = 0;

        /*
           Map.entrySet() 这个方法返回的是一个Set<Map.Entry<K,V>>，Map.Entry 是Map中的一个接口，
        他的用途是表示一个映射项（里面有Key和Value），而Set<Map.Entry<K,V>>表示一个映射项的Set。
        Map.Entry里有相应的getKey和getValue方法，即JavaBean，让我们能够从一个项中取出Key和Value。
         */
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    /**
     * 方法二,排序,多数那么中间的数肯定是
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * 方法三,摩尔投票法
     */
    public int majorityElement3(int[] nums) {
        int cand_num = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (cand_num == nums[i])
                ++count;
            else {
                if (--count == 0) {
                    cand_num = nums[i];
                    count = 1;
                }
            }
        }
        return cand_num;
    }
}
