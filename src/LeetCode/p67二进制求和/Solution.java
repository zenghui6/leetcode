package LeetCode.p67二进制求和;

/**
 * @ClassName Solution
 * @Description: 1. 补零对齐, 2. 反向,按位相加 3.最后反向字符串
 * @Author zeng
 * @Date 2020/4/19
 **/
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        //进位
        int flag = 0 ;
        for (int i = a.length()-1 ,j = b.length()-1; i >= 0|| j>=0 ; i--, j--) {
            int sum = flag;
                //按位加, 不够长补0;
            sum += i >= 0 ? a.charAt(i) - '0'  : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            //计算%2, 判断是否进位
            str.append(sum%2);
            flag = sum / 2;  //1/2 =0  , 2/2 =1
        }

        //将进位加入
        str.append(flag == 1 ? 1 : "");
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1"));
    }
}
