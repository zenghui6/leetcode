package LeetCode.x的平方根;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        int l = 1 , r = x/2;
        while (l < r){
            //左中位版本
            int mid = l + ((r - l)>>>1);    //位运算的优先级很低
            if (mid < x/mid) {
                l = mid+1;
                //这里还要进行夹逼准则
                //如果 平方大于 x就返回前面一个值
                if (l > x/l) return mid;
            }
            else r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(10));
    }
}
