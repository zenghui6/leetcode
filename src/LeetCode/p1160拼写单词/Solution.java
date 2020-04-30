package LeetCode.p1160拼写单词;

import java.util.HashMap;
import java.util.Map;

/**
 * 记录chars中各个字母的 数量  , 再统计要组成的单词的字母个数
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/3/17
 **/
public class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = chars.toCharArray();

        for (char c : ch) {
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//            } else {
//                map.put(c, 1);
//            }
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int ans = 0;
        for (String word : words) {

            //引用传递, tmp 的值改变 会继续改变 map的值,使用clone
            HashMap<Character,Integer> tmp = (HashMap<Character, Integer>) map.clone();
            char[] s = word.toCharArray();
            ans += check(s,tmp);
        }

        return ans;
    }

    private int check(char[] cs, Map<Character, Integer> map) {
        int count = 0 ;
        for (char c : cs) {
            if (!map.containsKey(c)) {
                return 0;
            }else {
                //匹配到了值减一
                if (map.get(c) >= 1){
                    map.put(c,map.get(c) - 1);
                }else { //值为0,字母已经匹配完了
                    return 0;
                }
            }
        }

        //匹配成功
        return cs.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ret = solution.countCharacters(new String[]{"cat","bt","hat","tree"},"attach");
        System.out.println(ret);
    }
}
