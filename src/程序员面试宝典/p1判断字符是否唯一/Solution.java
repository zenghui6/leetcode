package 程序员面试宝典.p1判断字符是否唯一;

import java.util.TreeSet;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/3/11
 **/
public class Solution {
    /**
     * 方法1使用 set 但使用了额外的数据结构
     * @param astr
     * @return
     */
    public static boolean isUnique1(String astr) {

        TreeSet<Character> set = new TreeSet<>();
        for (char c : astr.toCharArray()){
            if (set.contains(c)){
                return false;
            }
        }

        return true;
    }

    /**
     * 当字符的最后一出现不是现在就代表重复
     * @param astr
     * @return
     */
    public static boolean isUnique2(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            if (astr.lastIndexOf(astr.charAt(i)) != i){
                return false;
            }
        }
        return true;
    }

    public static boolean isUnique3(String astr){
        int[] chars = new int[26];

        for (char c : astr.toCharArray() ) {
            chars[c - 'a'] ++;
            if (chars[c - 'a'] > 1){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique1("true"));
        System.out.println(isUnique2("cruud"));
        System.out.println(isUnique3("curud"));
    }
}
