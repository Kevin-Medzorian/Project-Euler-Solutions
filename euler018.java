


/**
 * @author Kevin
 */
public class euler018 {

    private static final String triangle = "75\n"
            + "95 64\n"
            + "17 47 82\n"
            + "18 35 87 10\n"
            + "20 04 82 47 65\n"
            + "19 01 23 75 03 34\n"
            + "88 02 77 73 07 63 67\n"
            + "99 65 04 28 06 16 70 92\n"
            + "41 41 26 56 83 40 80 70 33\n"
            + "41 48 72 33 47 32 37 16 94 29\n"
            + "53 71 44 65 25 43 91 52 97 51 14\n"
            + "70 11 33 28 77 73 17 78 39 68 17 57\n"
            + "91 71 52 38 17 14 91 43 58 50 27 29 48\n"
            + "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n"
            + "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    public static void main(String[] args) {
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
        //System.out.println(inputTriangle[i][j]);
    }

}