package LeetCode.p695岛屿的最大面积;

import java.util.Stack;

/**
 * @ClassName Solution
 * @Description: TODO
 * @Author zeng
 * @Date 2020/3/15
 **/
class Solution {
    /**
     * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
     * [0,0,0,0,0,0,0,1,1,1,0,0,0],
     * [0,1,1,0,1,0,0,0,0,0,0,0,0],
     * [0,1,0,0,1,1,0,0,1,0,1,0,0],
     * [0,1,0,0,1,1,0,0,1,1,1,0,0],
     * [0,0,0,0,0,0,0,0,0,0,1,0,0],
     * [0,0,0,0,0,0,0,1,1,1,0,0,0],
     * [0,0,0,0,0,0,0,1,1,0,0,0,0]]
     * 深度优先算法,先找到节点值为1的值
     *
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //找到了 1 的点
                if (grid[i][j] == 1) {
                    max = Math.max(dfs(i, j, grid), max);
                }
            }
        }
        return max;
    }

    //往4个方向深度优先遍历
    public int dfs(int i, int j, int[][] grid) {
        //递归先写结束条件,
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 0) {
            return 0;
        }

        //将当前节点置 -1 ,因为子节点也会继续向4个方向 为1 的地方遍历
        grid[i][j] = -1;

        int count = 1;
        count += dfs(i, j + 1, grid);
        count += dfs(i, j - 1, grid);
        count += dfs(i - 1, j, grid);
        count += dfs(i + 1, j, grid);

        return count;
    }


    /**
     * DFS 使用栈实现
     *
     * @param grid
     * @return
     */


    int[][] dicts = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private boolean isInArea ( int[][] grid, int i, int j){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return false;
        return true;
    }

    public int maxAreaOfIsland2( int[][] grid ){
        Stack<int[]> stack = new Stack<>();
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //找到了 1 的点
                if (grid[i][j] == 1) {
                    int tmp = 0;
                    grid[i][j] = 0;
                    stack.add(new int[]{i, j});

                    while (!stack.isEmpty()) {
                        int[] cur = stack.pop();
                        tmp++;
                        int x = cur[0];
                        int y = cur[1];
                        for (int[] d : dicts) {
                            int nx = x + d[0];
                            int ny = y + d[1];
                            if (isInArea(grid, nx, ny) && grid[nx][ny] == 1) {
                                grid[nx][ny] = 0;
                                stack.push(new int[]{nx, ny});
                            }
                        }
                    }
                    ret = Math.max(ret, tmp);
                }
            }

        }
        return ret;
    }
}
