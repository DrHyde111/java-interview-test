package interview.test.problem;

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
     * 
     * pattern
     * 1920
     * 1923
     * 1912
     * String pattern = new String[]{"1920", "1923", "1912"}
     * 
     * return string = YES
     * @param grid the parameter grid
     * @param pattern the pattern to check
     * @return "YES" or "NO" depending on if the pattern exists within the main grid
     */
    public String solveGrid(String[] grid, String[] pattern);
}
