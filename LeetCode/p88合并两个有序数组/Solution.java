package LeetCode.p88合并两个有序数组;


public class Solution {
    /**
     * 比较插入
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1;
        int j = n-1;
        //因为nums1后面是空的，可以将排序倒过来，从后面，从大到小
        while (i >= 0 && j>= 0){
            if (nums1[i] <= nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        //两个数组最短的已经比较完了，剩下的一个数组的部分是已经排序了的
        while (i >= 0)
            nums1[k--] = nums1[i--];
        while (j >= 0)
            nums1[k--] = nums2[j--];
     }
}
