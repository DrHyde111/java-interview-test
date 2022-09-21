package interview.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import interview.test.problem.GridProblemImpl;
import interview.test.problem.IGridProblem;

public class IGridProblemUnitTest {
    
    private IGridProblem interfaceToTest = new GridProblemImpl();
    private Random rand = new Random();

    @Test public void shouldReturnTrue_whenPatternExistsInGrid(){
        String[] grid = Utility.generateGrid(10, 10);
        String[] pattern = Utility.generatePatternThatExists(grid);
        for(String row : grid){
            System.out.println(row);
        }
        for (String row : pattern){
            System.out.println(row);
        }
        assertTrue(interfaceToTest.solveGrid(grid, pattern));
    }

    @Test public void shouldReturnFalse_whenCheckingForRandomGrid(){
        String[] grid = Utility.generateGrid(100, 100);
        String[] pattern = Utility.generateGrid(rand.nextInt(100), rand.nextInt(100));
        for(String row : grid){
            System.out.println(row);
        }
        for(String row : pattern){
            System.out.println(row);
        }
        assertFalse(interfaceToTest.solveGrid(grid, pattern));
    }
}
