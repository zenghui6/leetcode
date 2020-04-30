package LeetCode.p9回文数;

/**
 * @ClassName Solution
 * @Description: 回文数,首先负数肯定不是,0肯定是
 * @Author zeng
 * @Date 2020/4/14
 **/
public class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 ) return false;

        int tmp = x;
        int ret = 0;
        while (x > 0){
            int n = ret;
            n *= 10;
            n += x % 10;
            x /= 10;
            ret = n;
        }

        if (ret == tmp) return true;
        else return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}
