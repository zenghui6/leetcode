package LeetCode.p13罗马数字转整数;

import java.util.HashMap;

/**
 * @ClassName Solution
 * @Description: I , V , X , L , C , D , M
 *               1 , 5 , 10  50  100 500 1000
 *               在这里最好使用 switch 来代替 map 会快很多
 * @Author zeng
 * @Date 2020/4/14
 **/
public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();

        int ret = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            //小的数字位于大的数字左边
            if (map.get(chars[i]) < map.get(chars[i+1])){
                ret -= map.get(chars[i]);
            }else {
                ret += map.get(chars[i]);
            }
        }

        ret += map.get(chars[chars.length-1]); //加上最后一位

        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("IV"));
    }
}
