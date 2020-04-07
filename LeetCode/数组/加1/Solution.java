package LeetCode.数组.加1;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/7
 **/
public class Solution {
    public int[] plusOne(int[] digits) {
        //进位符
        int carry = 1;
        for (int i = digits.length-1; i >= 0  ; i--) {
            int count = digits[i]  + carry;
           if (count >= 10){
               carry = 1;
           }else
               carry = 0;

           digits[i] = count % 10;
        }

        if (carry == 1){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i+1] = digits[i];
            }

            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9, 9, 9})));
    }
}
