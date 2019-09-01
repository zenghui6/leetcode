package P5只出现一次的数据;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,2,1,1};
        int b;
        b = solution.singleNumber(nums);

        //方法二，计算机取异或
        int res= 0;
        for (int i :nums) {
            //遍历，取异或
            res ^= i;
            System.out.println(res);
        }
        System.out.println(" ");
        System.out.println(b);
    }
}
