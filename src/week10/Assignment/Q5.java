public class Q5 {
    // Busiest Bus Row: O(r*c) time, O(1) extra space.
    // Returns {row index, total}; ties go to the smaller row index.
    static int[] busiestRow(int[][] grid) {
        int bestRow = 0, bestTotal = -1;
        for (int i = 0; i < grid.length; i++) {
            int total = 0;
            for (int value : grid[i]) total += value;
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = i;
            }
        }
        return new int[]{bestRow, bestTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        int[] answer = busiestRow(grid);
        System.out.println("Row " + answer[0] + ", Total " + answer[1]);
    }
}
