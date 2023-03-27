package interview.exam.problem;

public interface IGridProblem {
    
    /**
     * Given a matrix of characters. Check to see if the pattern grid exists inside of the larger grid
     * Grid
     * 12930482091238127
     * 12037128741023801
     * 19208301741029388
     * 19238012938172401
     * 19123812038127415
     * String grid = new String[]{"12930482091238127", "12037128741023801", "19208301741029388", "19238012938172401", "19123812038127415"}
     * grid will always exist as 
     * grid[0] = first row
     * grid[1] = second row
     * ...
     * grid[n] = nth row
     * 
     * pattern
     * 1920
     * 1923
     * 1912
     * String pattern = new String[]{"1920", "1923", "1912"}
     * 
     * @param grid the parameter grid
     * @param pattern the pattern to check
     * @return true or false depending on if the pattern exists within the main grid
     */
    public boolean solveGrid(String[] grid, String[] pattern);

    public boolean solveGridBetter(String[] grid, String[] pattern);
}
