package interview.test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import interview.test.problem.GridProblemImpl;
import interview.test.problem.IGridProblem;

public class IGridProblemUnitTest {
    
    private IGridProblem interfaceToTest = new GridProblemImpl();
    private Random rand = new Random();

    @Test public void TestCase1(){
        String[] grid = Utility.generateGrid(10, 10);
        String[] pattern = Utility.generatePatternThatExists(grid);
        for(String row : grid){
            System.out.println(row);
        }
        for (String row : pattern){
            System.out.println(row);
        }
        // assertEquals("YES", interfaceToTest.solveGrid(grid, pattern));
    }

    @Test public void TestCase2(){
        String[] grid = Utility.generateGrid(100, 100);
        String[] pattern = Utility.generateGrid(rand.nextInt(100), rand.nextInt(100));
        for(String row : grid){
            System.out.println(row);
        }
        for(String row : pattern){
            System.out.println(row);
        }
        // Loop until pattern doesn't exist in the grid
        // while(interfaceToTest.solveGrid(grid, pattern).equalsIgnoreCase("YES")){
        //     pattern = Utility.generateGrid(20, 20);
        // }
        // assertEquals("NO", interfaceToTest.solveGrid(grid, pattern));
    }

    @Test public void TestCase3(){

    }
}
