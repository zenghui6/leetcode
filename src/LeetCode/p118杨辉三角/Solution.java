package LeetCode.p118杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        //第一种情况传入0 返回空
        if (numRows == 0){
            return ret;
        }

        //传入1
        ret.add(new ArrayList<>());
        ret.get(0).add(1);

        //计算
        for (int i = 1; i < numRows; i++) {
            //当前要计算的列
            List<Integer> cur = new ArrayList<>();
            //需要的上一列
            List<Integer> pre = ret.get(i-1);

            //计算列,第一个为1
            cur.add(1);
            //cur[j] = pre[j]+pre[j-1]

            for (int j = 1; j < i; j++) {
                cur.add(pre.get(j) + pre.get(j-1));
            }

            //最后一个补1
            cur.add(1);
            //将一列加入
            ret.add(cur);
        }

        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}
