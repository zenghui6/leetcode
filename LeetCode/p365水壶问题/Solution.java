package LeetCode.p365水壶问题;

/**
 * @ClassName Solution
 * @Description: ax + by = z
 *         裴蜀定理:  若a,b是整数,且gcd(a,b)=d，那么对于任意的整数x,y,ax+by都一定是d的倍数，特别地，一定存在整数x,y，使ax+by=d成立。
 * @Author zeng
 * @Date 2020/3/21
 **/
public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x + y < z)
            return false;
        if (x==0 || y == 0)
            return z == 0 || x + y == z;

        return z % gcd(x,y) == 0;
    }

    private int gcd(int x, int y){
//        return x == 0 ? y : gcb(x%y , y);
        return y == 0 ? x : gcd(y, x%y);
    }


    public static void main(String[] args) {
        System.out.println(6%2);
        System.out.println(2%6);
    }
}
