class Solution {
    class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public int orangesRotting(int[][] grid) {

        Queue<Pair> main = new LinkedList<>();
        Queue<Pair> helper = new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    main.add(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if(fresh==0 ){
            return 0 ; 
        }
        int time = 0;
        while (main.size() > 0) {

            Pair p = main.remove();

            int r = p.i;
            int c = p.j;

            if (isFreshOrange(r - 1, c, grid)) {
                helper.add(new Pair(r - 1, c));
                fresh--;
            }
            if (isFreshOrange(r, c + 1, grid)) {
                helper.add(new Pair(r, c + 1));
                fresh--;
            }
            if (isFreshOrange(r + 1, c, grid)) {
                helper.add(new Pair(r + 1, c));
                fresh--;
            }
            if (isFreshOrange(r, c - 1, grid)) {
                helper.add(new Pair(r, c - 1));
                fresh--;
            }

            if (main.size() == 0) {
                main = helper;
                helper = new LinkedList<>();
                time++;
            }
        }

        if (fresh == 0) {
            return time-1;
        } else {
            return -1;
        }
    }

    public boolean isFreshOrange(int r, int c, int[][] grid) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != 1) {
            return false;
        }
        grid[r][c] = 2;
        return true;
    }
}