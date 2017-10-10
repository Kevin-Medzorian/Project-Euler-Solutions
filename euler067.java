

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class euler067 {

    static String triangle = "";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner chopper = new Scanner(new File("src/data_67.dat"));
        while(chopper.hasNextLine())
            triangle += chopper.nextLine()+"\n";
        
        
        
        String[] line = triangle.split("\n");

        String[][] grid = new String[line.length][0];
        for (int i = 0; i < grid.length; i++) 
            grid[i] = line[i].split(" ");
        
        
        
        int[][] inputTriangle = new int[grid.length][16];
        
        for (int i = 0; i < grid.length; i++) 
            for (int j = 0; j < grid[grid.length-1].length; j++) 
                inputTriangle[i][j] = Integer.parseInt(grid[i][j]);
            
        
        int lines = inputTriangle.length;
        
        int i = 0;
        int j = 0;
        for (i = lines - 2; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                inputTriangle[i][j] += Math.max(inputTriangle[i + 1][j], inputTriangle[i + 1][j + 1]);
            }
        }

    }

}
