class Solution {

    class Pair {
        int r;
        int c;

        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int orangesRotting(int[][] grid) {
        int fo = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> main = new LinkedList<>();
        Queue<Pair> helper = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    fo++;
                } else if (grid[i][j] == 2) {
                    main.add(new Pair(i, j));
                }
            }
        }

        if (fo == 0) {
            return 0;
        }

        int level = 0;

        while (main.size() > 0) {
            Pair p = main.remove();
            int r = p.r;
            int c = p.c;

            if (isSafe(r - 1, c, rows, cols, grid)) {
                helper.add(new Pair(r - 1, c));
                grid[r - 1][c] = 2;
                fo--;
            }

            if (isSafe(r, c + 1, rows, cols, grid)) {
                helper.add(new Pair(r, c + 1));
                grid[r][c + 1] = 2;
                fo--;
            }

            if (isSafe(r + 1, c, rows, cols, grid)) {
                helper.add(new Pair(r + 1, c));
                grid[r + 1][c] = 2;
                fo--;
            }

            if (isSafe(r, c - 1, rows, cols, grid)) {
                helper.add(new Pair(r, c - 1));
                grid[r][c - 1] = 2;
                fo--;
            }

            if (main.size() == 0) {
                level++;
                main = helper;
                helper = new LinkedList<>();
            }

        }

        if (fo == 0) {
            return level - 1;
        } else {
            return -1;
        }
    }

    public boolean isSafe(int r, int c, int rows, int cols, int[][] grid) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != 1) {
            return false;
        }
        return true;
    }
}