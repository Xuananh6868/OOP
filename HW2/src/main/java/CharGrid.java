// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int row = grid.length;
        int cols = grid[0].length;
        int minRows = row, maxRows = -1;
        int minCols = cols, maxCols = -1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols ; j++){
                if(grid[i][j] == ch) {
                    minRows = Math.min(minRows, i);
                    minCols = Math.min(minCols,j);
                    maxRows = Math.max(maxRows,i);
                    maxCols = Math.max(maxCols,j);
                }
            }
        }
        int s = (maxRows - minRows + 1) * (maxCols - minCols +1);
        if(maxRows ==   -1) return 0;
		return s;
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int up = 0, down = 0, left = 0, right = 0;

                char ch =grid[i][j];
                for(int r = i -1; r >=0 && grid[r][j] == ch; i--) up++;
                for(int r = i +1; r >=0 && grid[r][j] == ch; i++) down++;
                for(int r = j -1; r >=0 && grid[r][j] == ch; j--) left++;
                for(int r = j -1; r >=0 && grid[r][j] == ch; j++) right++;

                if(up == down && left == right && up == left && up >0 ) count++;
            }
        }
        return count;
	}
	
}
