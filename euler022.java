import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class euler022 extends Euler{

    
    public static void main(String[] args) throws Exception{
        Start();
        
        Scanner chopper = new Scanner(new File("22data.txt"));
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] names = chopper.next().replaceAll("\"", "").split(",");
        
        Arrays.sort(names);
        long total = 0;
        for (int i = 0; i < names.length; i++) {
            int score = 0;
            for(char c : names[i].toCharArray())
                score += alpha.indexOf(c) +1;
            total += score * (i+1);
        }
        
        System.out.println(total);
    }

}
