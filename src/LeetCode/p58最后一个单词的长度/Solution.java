package LeetCode.p58最后一个单词的长度;

/**
 * @ClassName Solution
 * @Description: 输入: "Hello World"
 *               输出: 5
 * @Author zeng
 * @Date 2020/4/19
 **/
public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) != ' '){
                length++;
            }else if (length != 0){
                return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("a"));
    }
}
