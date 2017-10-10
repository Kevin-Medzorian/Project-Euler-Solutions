
import java.io.File;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class uil11 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("src/data_uil11.dat"));
        scan.nextLine();
        while (scan.hasNextLine()) 
            System.out.println((Valid(scan.nextLine().toLowerCase()) ? "VALID" : "WEAK"));

    }

    public static boolean Valid(String line) {
        String[] regex = {"aeiou", "bcdfghjklmnpqrstvwxyz", "0123456789"};

        if(line.length() < 8)
            return false;
       
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < regex[i].length(); j++) 
                if (line.contains("" + regex[i].charAt(j))) 
                    break;
                else if (j == regex[i].length() - 1) 
                    return false;
        
        for (int i = 0; i < line.length() - 3; i++) {
             String word = line.substring(i, i + 3);
             boolean con = false;
             for (int j = 0; j < 3; j++)
                 con = !regex[0].contains(""+word.charAt(j)) ? true : con;
             if(!con)
                 return false;
        }
        
        return true;
    }
}
