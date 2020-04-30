package LeetCode.P1TwoSum;


public class Main {
    public static void main(String[] args) {
        int[] res = new int[2];
       int[] nums={2,7,11,15};
       int target=9;
        Solution solution = new Solution();
       res = solution.twoSum(nums,target);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);

        }
    }
}
