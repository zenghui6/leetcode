package LeetCode.p1071字符串的最大公因子;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/3/12
 **/
public class Solution {
    public  String gcdOfStrings(String str1, String str2) {
        //假设str1 是 n个X, str2是M个x, 那么 str1 + str2肯定要等于str2 + str1 的
        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }

        //留下的就是有最大公约数的
        //辗转相除法
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }

    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings("abaaba","aba"));

    }
}
