package 常见算法.KMP;

import java.util.Arrays;

/**
 * @ClassName MaxMatchLengths
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/17
 **/
public class MaxMatchLengths {
    // 构造模式串 pattern 的最大匹配数表
    int[] calculateMaxMatchLengths(String pattern) {
        int[] maxMatchLengths = new int[pattern.length()];
        int maxLength = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (maxLength > 0 && pattern.charAt(maxLength) != pattern.charAt(i)) {
                maxLength = maxMatchLengths[maxLength - 1]; // ①
            }
            if (pattern.charAt(maxLength) == pattern.charAt(i)) {
                maxLength++; // ②
            }
            maxMatchLengths[i] = maxLength;
        }
        return maxMatchLengths;
    }

    public static void main(String[] args) {
        MaxMatchLengths maxMatchLengths = new MaxMatchLengths();
        System.out.println(Arrays.toString(maxMatchLengths.calculateMaxMatchLengths("ababababa")));
    }
}
