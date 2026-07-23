import java.util.LinkedList;
import java.util.Queue;
public class Problem4 {
    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visit = new boolean[m][n];
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i,j});
                    visit[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int[] d : dir) {
                int r = cur[0] + d[0];
                int c = cur[1] + d[1];
                if (r >= 0 && c >= 0 && r < m && c < n && !visit[r][c]) {
                    mat[r][c] = mat[cur[0]][cur[1]] + 1;
                    visit[r][c] = true;
                    queue.offer(new int[]{r,c});
                }
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        int[][] ans = updateMatrix(mat);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}