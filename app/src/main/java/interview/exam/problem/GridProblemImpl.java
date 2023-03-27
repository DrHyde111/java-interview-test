package interview.exam.problem;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GridProblemImpl implements IGridProblem {

    /**
     * Provide the implementation to solve the problem statement
     */
    @Override
    public boolean solveGrid(String[] grid, String[] pattern) {
        // get the dimensions of the grid and the pattern
        int gridArrayLength = grid.length;
        int patternArrayLength = pattern.length;

        if(gridArrayLength<1){
            return false;
        }
        if(patternArrayLength<1){
            return false;
        }

        int gridRowLength = grid[0].length();
        int patternRowLength = pattern[0].length();

        if(patternArrayLength > gridArrayLength ){
            return false;
        }

        if(patternRowLength > gridRowLength){
            return false;
        }
        // loop through the grid
        for (int i = 0; i <= gridArrayLength - patternArrayLength; i++) {
            for (int j = 0; j <= gridRowLength - patternRowLength; j++) {

                // check if the pattern matches at the current position
                boolean match = true;
                for (int p = 0; p < patternArrayLength; p++) {
                    for (int q = 0; q < patternRowLength; q++) {
                        if (grid[i+p].charAt(j+q) != pattern[p].charAt(q)) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        // pattern not found
        return false;
    }
    @Override
    public boolean solveGridBetter(String[] grid, String[] pattern){
        // get the dimensions of the grid and the pattern
        int gridArrayLength = grid.length;
        int patternArrayLength = pattern.length;

        if(gridArrayLength<1){
            return false;
        }
        if(patternArrayLength<1){
            return false;
        }

        int gridRowLength = grid[0].length();
        int patternRowLength = pattern[0].length();

        if(patternArrayLength > gridArrayLength ){
            return false;
        }

        if(patternRowLength > gridRowLength){
            return false;
        }

        //check do first row of patterns ever apear
        String gridStr = String.join("", grid);
        Pattern regex = Pattern.compile(pattern[0]);
        Matcher matcher = regex.matcher(gridStr);
        ArrayList<Integer> startingPoints = new ArrayList<Integer>();


        //regex search is faster than brute force (nested loops)
        boolean result = true;
        while (matcher.find()) {
            startingPoints.add(matcher.start());
        }

        if(startingPoints.isEmpty()){
            return false;
        }

        // Iterate through pattern entries

            // Check next indexes on which part of pattern should occur
            for (int startingPointIndex = 0; startingPointIndex<startingPoints.size(); startingPointIndex++) {
                for (int patternArrayIndex = 0; patternArrayIndex < patternArrayLength; patternArrayIndex++) {
                    String currentPattern = pattern[patternArrayIndex];


                    //calculate index of next pattern
                int nextPoint = startingPoints.get(startingPointIndex)+(gridRowLength*patternArrayIndex);

                if(nextPoint>gridStr.length()){
                    result = false;
                    break;
                }
                if(patternRowLength==1){
                    if(!(gridStr.substring(nextPoint, nextPoint).equals(currentPattern))){
                        result = false;
                        break;
                    }
                }
                if(!(gridStr.substring(nextPoint, nextPoint+patternRowLength).equals(currentPattern))){
                    result = false;
                    break;
                }
                if(patternArrayIndex == patternArrayLength-1){
                    return true;
                }
            }
        }

        return result;
    }
    }

