package LeetCode.p119杨辉三角2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex += 1;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        if (rowIndex == 0)
            return new ArrayList<>();

        //传入1
        ret.add(new ArrayList<>());
        ret.get(0).add(1);

        //计算下面列
        for (int i = 1; i < rowIndex; i++) {
            ArrayList<Integer> cur = new ArrayList<>();

            List<Integer> pre = ret.get(i-1);
            cur.add(1);

            for (int j = 1; j < i; j++) {
               cur.add(pre.get(j) + pre.get(j-1));
            }

            cur.add(1);

            ret.add(cur);
        }

        return ret.get(rowIndex-1);
    }

    //公式法
    // C(nk)=n!/(k!(n−k)!)=(n∗(n−1)∗(n−2)∗...(n−k+1))/k!
    public List<Integer> getRow2(int rowIndex){
        List<Integer> ans = new ArrayList<>();
        int N = rowIndex;
        for (int i = 0; i < N; i++) {
            ans.add(Combination(N,i));
        }

        return ans;
    }

    private int Combination(int N, int k){
        long res = 1;
        for (int i = 0; i < k; i++) {
            res = res * (N - k + i) / i;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(3));
    }
}
