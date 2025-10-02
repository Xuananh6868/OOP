public class TetrisGrid {
    private boolean[][] grid;

    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public void clearRows() {
        if (grid == null) return;
        int width = grid.length;
        if (width == 0) return;
        int height = grid[0].length;

        for (int y = 0; y < height; y++) {
            boolean full = true;
            for (int x = 0; x < width; x++) {
                if (!grid[x][y]) {
                    full = false;
                    break;
                }
            }

            if (full) {
                for (int yy = y; yy < height - 1; yy++) {
                    for (int x = 0; x < width; x++) {
                        grid[x][yy] = grid[x][yy + 1];
                    }
                }

                for (int x = 0; x < width; x++) {
                    grid[x][height - 1] = false;
                }

                y--;
            }
        }
    }

    public boolean[][] getGrid() {
        return grid;
    }
}
