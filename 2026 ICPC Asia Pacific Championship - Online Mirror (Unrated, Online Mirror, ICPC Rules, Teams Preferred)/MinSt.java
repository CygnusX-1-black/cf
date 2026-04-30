import java.util.*;

public class MinSt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String S = scanner.next();
        System to calculate_kth_largest = new System();
        System.out.println(calculate_kth_largest(n, k, S));
    }

    public static int calculate_kth_largest(int n, int k, String S) {
        int[] fValues = new int[n];
        for (int w = 1; w <= n; w++) {
            int fW = 0;
            int rows = (int) Math.ceil((double) n / w);
            int[][] grid = new int[rows][w];
            for (int i = 0; i < n; i++) {
                grid[i / w][i % w] = S.charAt(i) - '0';
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] == 0) {
                        int mines = 0;
                        if (i > 0) {
                            mines += grid[i - 1][j];
                        }
                        if (i < rows - 1 && j < grid[i + 1].length) {
                            mines += grid[i + 1][j];
                        }
                        if (j > 0) {
                            mines += grid[i][j - 1];
                        }
                        if (j < w - 1 && j < grid[i].length - 1) {
                            mines += grid[i][j + 1];
                        }
                        fW += mines;
                    }
                }
            }
            fValues[w - 1] = fW;
        }
        Arrays.sort(fValues);
        return fValues[n - k];
    }
}