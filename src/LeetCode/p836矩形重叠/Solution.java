package LeetCode.p836矩形重叠;

/**
 * @ClassName Solution
 * @Description: 卡死4个不相交的点就行, 定住第一个矩形,第二个矩形分别在上下左右,并且一条边重叠
 * @Author zeng
 * @Date 2020/3/18
 **/
public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec2[2] <= rec1[0] || rec2[1] >= rec1[3] || rec2[0] >= rec1[2] || rec2[3] <= rec1[1])
            return false;
        else return true;
    }
}
