package LeetCode.p7整数翻转;

/**
 * @ClassName Solution
 * @Description: 整数翻转,主要主要
 * @Author zeng
 * @Date 2020/4/14
 **/
public class Solution {
    public int reverse(int x) {
        if (x == Integer.MAX_VALUE)  return 0;
        //符号位
        int neg = x < 0 ? -1 : 1;
        int ret = 0;
        x = Math.abs(x);
        //简单的正数翻转
        while (x > 0){
            int n = ret;
            n *= 10;
            n += x % 10;
            x /= 10;

            //判断溢出
            if (n / 10 != ret) return 0;
            ret = n;
        }

        return ret * neg;
    }
}
