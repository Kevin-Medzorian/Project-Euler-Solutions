
import java.io.File;
import java.util.Scanner;

/**
 * @author Kevin
 */

public class uil7 {

    
    public static void main(String[] args) throws Exception{
       Scanner scan = new Scanner(new File("src/data_uil7.dat"));
       scan.next();
       while(scan.hasNextLine()){
           System.out.println(func(scan.nextInt()));
       }
    }
    public static String func(int num){
        int sum = 0;
        
        for(int i = 1; i < num; i++)
            if(num % i == 0)
                sum+=i;
        
        return sum < num ? "DEFICIENT" : sum == num ? "PERFECT" : sum > num ? "ABUNDANT" : "-1";
    }
}
