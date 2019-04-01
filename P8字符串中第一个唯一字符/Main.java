package P8字符串中第一个唯一字符;

/**
 * @program: leetcode
 * @description: main
 * @author: Mr.Zeng
 * @create: 2019-04-01 21:31
 **/
public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "loveleetcode";
        int c = solution.firstUniqChar(s);
        System.out.println(c);
    }
}
