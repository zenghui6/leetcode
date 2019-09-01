package 三旋转数组;

//自己写的好low啊
public class Solution {
    /** 
    * @Description:  
    * @Param:  
    * @return:  
    * @Author: Mr.Zeng
    * @Date:  
    */ 
    public void rotate(int[] nums, int k) {
        int tag=0;
        for(int i=0;i<k;i++){
            tag=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = tag;
        }
    }
}
//下面是大佬写的 反复翻转，厉害
//public class Solution {
//    /**
//     * @param nums: an array
//     * @param k: an integer
//     * @return: rotate the array to the right by k steps
//     */
//    public int[] rotate(int[] nums, int k) {
//        // Write your code here
//        int n = nums.length;
//        k %= n;
//        reverse(nums, 0, n - k - 1);
//        reverse(nums, n - k, nums.length - 1);
//        reverse(nums, 0, nums.length - 1);
//        return nums;
//    }
//
//    public void reverse(int[] n, int i, int j) {
//        for (int p = i, q = j; p < q; p++, q--) {
//            int temp = n[p];
//            n[p] = n[q];
//            n[q] = temp;
//        }
//    }
//}
