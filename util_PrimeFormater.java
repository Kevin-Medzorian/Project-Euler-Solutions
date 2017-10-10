import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class util_PrimeFormater extends Euler{
    static String masterList = "100000000 ";
    public static void main(String[] args) throws Exception {
        Start();
        int[] list = new int[1000000];
        String path = "C:\\Users\\Kevin\\Desktop\\primes";

        for (int i = 1; i <= 6; i++) {   
            
            Scanner scan = new Scanner(new File(path + i + ".txt"));
            
            for (int j = 0; j < 1000000; ) 
               list[j++] = scan.nextInt();
            
            String stringList = Arrays.toString(list);
            
            masterList += stringList.substring(1, stringList.length()-1).replace(",", " ");
        }        
        
        
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/primes.dat"), "utf-8"));
        writer.write(masterList);
        writer.close();
    }

}
