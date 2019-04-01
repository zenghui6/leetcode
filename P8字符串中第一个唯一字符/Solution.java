package P8字符串中第一个唯一字符;

/**
 * @program: leetcode
 * @description: .
 * @author: Mr.Zeng
 * @create: 2019-04-01 21:32
 **/
class Solution {
    public int firstUniqChar(String s) {

        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++)
            //第几个位置的数字就是第几个字母出现的次数
            freq[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++)
            //找出第一个出现次数在freq中为1的字母
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
