package interview.exam;

import interview.exam.problem.GridProblemImpl;
import interview.exam.problem.IGridProblem;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InterviewUnitTests {
    private IGridProblem interfaceToTest = new GridProblemImpl();
    @Test public void EmptyPatternListTest(){
        String[] grid = new String[]{"6535229462", "9388124961", "5414752924", "2844960400", "0673530317","8237785356", "0099599924","2625169955", "4025204532","1904284820"};
        String[] pattern = new String[]{};
        assertFalse(interfaceToTest.solveGrid(grid, pattern));
        assertFalse(interfaceToTest.solveGridBetter(grid, pattern));
    }
    @Test public void EmptyPatternEntriesTest(){
        String[] grid = new String[]{"6535229462", "9388124961", "5414752924", "2844960400", "0673530317","8237785356", "0099599924","2625169955", "4025204532","1904284820"};
        String[] pattern = new String[]{"", ""};
        assertTrue(interfaceToTest.solveGrid(grid, pattern));
        assertTrue(interfaceToTest.solveGridBetter(grid, pattern));
    }
    @Test public void EmptyGridTest(){
        String[] grid = new String[]{};
        String[] pattern = new String[]{"10273", "10461", "36012"};
        assertFalse(interfaceToTest.solveGrid(grid, pattern));
        assertFalse(interfaceToTest.solveGridBetter(grid, pattern));
    }
    @Test public void EmptyGridEntriesTest(){
        String[] grid = new String[]{"", ""};
        String[] pattern = new String[]{"10273", "10461", "36012"};
        assertFalse(interfaceToTest.solveGrid(grid, pattern));
        assertFalse(interfaceToTest.solveGridBetter(grid, pattern));
    }
    @Test public void ValuesFromBeginningTest(){
        String[] grid = new String[]{"1231802461010273", "1023971023710461", "1481027310236012", "1023917204671230"};
        String[] pattern = new String[]{"12318024", "10239710"};
        assertTrue(interfaceToTest.solveGrid(grid, pattern));
        assertTrue(interfaceToTest.solveGridBetter(grid, pattern));
    }
    @Test public void ValuesFromEndTest(){
        String[] grid = new String[]{"1231802461010273", "1023971023710461", "1481027310236012", "1023917204671230"};
        String[] pattern = new String[]{"0461", "6012", "1230"};
        assertTrue(interfaceToTest.solveGrid(grid, pattern));
        assertTrue(interfaceToTest.solveGridBetter(grid, pattern));
    }
    @Test public void SingleDigitValuesGoodTest(){
        String[] grid = new String[]{"1231802461010273", "1023971023710461", "1481027310236012", "1023917204671230"};
        String[] pattern = new String[]{"1", "1", "3"};
        assertTrue(interfaceToTest.solveGrid(grid, pattern));
        assertTrue(interfaceToTest.solveGridBetter(grid, pattern));
    }
    @Test public void SingleDigitValuesBadTest(){
        String[] grid = new String[]{"1231802461010273", "1023971023710461", "1481027310236012", "1023917204671230"};
        String[] pattern = new String[]{"1", "9", "6"};
        assertFalse(interfaceToTest.solveGrid(grid, pattern));
        assertFalse(interfaceToTest.solveGridBetter(grid, pattern));
    }


}
