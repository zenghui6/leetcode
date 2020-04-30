package LeetCode.p1从排序数组中删除重复项;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums= {0,1,1,2,2,3,3,4,5,6,6,7};
        int len = solution.removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }
}
