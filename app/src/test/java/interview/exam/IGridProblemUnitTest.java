package interview.exam;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import interview.exam.problem.GridProblemImpl;
import interview.exam.problem.IGridProblem;

/**
 * Interviewer only. Write test cases that test assumptions and edge cases
 */
public class IGridProblemUnitTest {
    
    private IGridProblem interfaceToTest = new GridProblemImpl();
    private Random rand = new Random();

    @Test public void shouldReturnTrue_whenPatternExistsInGrid(){
        String[] grid = Utility.generateGrid(10, 10);
        String[] pattern = Utility.generatePatternThatExists(grid);
        System.out.println("Grid X");
        for(String row : grid){
            System.out.println(row);
        }
        System.out.println("Pattern grid Y");
        for (String row : pattern){
            System.out.println(row);
        }
        assertTrue(interfaceToTest.solveGrid(grid, pattern));
    }

    @Test public void shouldReturnFalse_whenCheckingForRandomGrid(){
        String[] grid = Utility.generateGrid(100, 100);
        String[] pattern = Utility.generateGrid(rand.nextInt(100), rand.nextInt(100));
        System.out.println("Grid X");
        for(String row : grid){
            System.out.println(row);
        }
        System.out.println("Pattern grid Y");
        for(String row : pattern){
            System.out.println(row);
        }
        assertFalse(interfaceToTest.solveGrid(grid, pattern));
    }
}
