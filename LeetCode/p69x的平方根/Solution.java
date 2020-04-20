package LeetCode.p69x的平方根;

/**
 * @ClassName Solution
 * @Description: 普通方法:二分搜索法, 数学方法: 牛顿法
 * @Author zeng
 * @Date 2020/4/19
 **/
public class Solution {
    public int mySqrt(int x) {
        if(x==1) return x;
        int l = 0 , r = x;
        while (l < r){
            int mid = l + (r-l)/2;

            //if (x < mid*mid) 这个可能会越界
            if (x/mid < mid){
                r = mid;
            }else
                l = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(4));
    }
}
