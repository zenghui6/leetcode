package LeetCode.p125验证回文串;

public class Solution {
    public boolean isPalindrome(String s) {
       if(s == null || s.length() == 0)
           return true;
       //删除空格和转换为小写
       String str = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
        for (int i = 0 , j = str.length()-1; i < j; i++,j--) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
        }

        return true;
    }
}
