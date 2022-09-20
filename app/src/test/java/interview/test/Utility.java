package interview.test;

import java.util.Random;

public class Utility {
    
    /**
     * Generate a random grid given a width and height
     * @param width - the width of the grid
     * @param heigh - the heigh of the grid
     * @return
     * grid
     */
    public static String[] generateGrid(int width, int height){
        Random rand = new Random();
        String[] grid = new String[height];
        for(int y = 0; y < height; y++){
            StringBuilder randomString = new StringBuilder();
            for(int x = 0; x < width; x++){
                randomString.append(rand.nextInt(10));
            }
            grid[y] = randomString.toString();
        }
        return grid;
    }

    public static String[] generatePatternThatExists(String[] grid){
        Random rand = new Random();
        if (grid != null && grid.length > 0){
            // generate random height.
            int patternHeight = rand.nextInt(grid.length);
            int patternRow = rand.nextInt(grid.length - patternHeight);

            String[] pattern = new String[patternHeight];
            // Generate number of a base width.
            int patternWidth = rand.nextInt(grid[0].length());
            int patternStringStart = rand.nextInt(grid[0].length() - patternWidth);
            // Start the pattern at some height between max height and start
            for( int x = 0; x < patternHeight; x++){
                pattern[x] = grid[patternRow].substring(patternStringStart, patternStringStart + patternWidth);
                patternRow++;
            }
            return pattern;
        }
        throw new IllegalArgumentException("Grid is null or empty");
    }

    public static String[] generatePatternThatDoesNotExists(String[] pattern){
        return null;
    }
}
