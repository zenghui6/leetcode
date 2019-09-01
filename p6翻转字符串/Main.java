package P6翻转字符串;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description: .
 * @author: Mr.Zeng
 * @create: 2019-04-01 14:53
 **/
public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);
        System.out.println(s);
    }
}
