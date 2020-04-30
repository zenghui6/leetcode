package LeetCode.p3旋转数组;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums ={-1,-100,-10,1};
        int k=3;
        solution.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
