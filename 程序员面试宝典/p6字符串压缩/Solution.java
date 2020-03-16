package 程序员面试宝典.p6字符串压缩;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/3/16
 **/
public class Solution {
    public String compressString(String S) {
        if (S == null || S.length() == 0){
            return S;
        }
        int len = S.length();
        StringBuilder str = new StringBuilder();

        char[] chars = S.toCharArray();

        char tag = chars[0];
        int count = 1;
        str.append(tag);

        for (int i = 1 ; i < chars.length ; i++) {
            char c  = chars[i];
            if ( c == tag){
                count ++;
            }else {
                str.append(count);
                str.append(c);
                tag = c;
                count = 1;
            }
        }
        str.append(count);

      return str.length() >= len ? S : str.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = solution.compressString("aabcccccaaa");
        System.out.println(str);
    }
}
