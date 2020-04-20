/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/17
 **/
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;

        int index = 0;
        String str = haystack;
        while (!str.equals("")){
            if (str.startsWith(needle)) return index;
            else {
                index++;
                str = str.substring(1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("hello", "ll"));
    }
}
