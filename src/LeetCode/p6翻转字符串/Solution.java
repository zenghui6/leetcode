package LeetCode.p6翻转字符串;

/**
 * @program: leetcode
 * @description: .
 * @author: Mr.Zeng
 * @create: 2019-04-01 14:53
 **/
public class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i <s.length/2 ; i++) {
            char a = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = a;
        }
    }
}