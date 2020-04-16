package LeetCode.p14最长公共前缀;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/4/16
 **/
public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        //公共前缀为整个string
        String reg = strs[0];
        for (String str : strs){
            //只要有一个不匹配就缩短 一个, 直到全部匹配
            while (!str.startsWith(reg)){
                if (reg.length() == 1){
                    return "";
                }

                reg = reg.substring(0,reg.length()-1);
            }
        }

        return reg;
    }

}
