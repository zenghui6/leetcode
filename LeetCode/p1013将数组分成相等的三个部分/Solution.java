package LeetCode.p1013将数组分成相等的三个部分;

/**
 * @ClassName Solution
 * @Description: 1.首先计算3份的平均值,如果没有平均值肯定是不行的
 *              2. 将前面相加直到刚好等于平均值,count++ ;
 *              3.找到加出来两份,然后另一个肯定是的
 * @Author zeng
 * @Date 2020/3/11
 **/
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        
        if (sum % 3 !=0){
            return false;
        }
        
        int avg = sum / 3;

        int curSum = 0;
        int count = 0; //计数,找到几个了
        for (int i : A) {
            curSum += i;

            if (curSum == avg){
                count ++;
                curSum =  0;
            }
    }

        return count == 3 || (avg == 0 && count > 3); //如果目标值是0的话可以大于3段
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
    }
}