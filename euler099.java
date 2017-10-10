
import java.io.File;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class euler099 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();
        
        Scanner scan = new Scanner(new File("src/data_99.dat"));
        Double greatest = 0.0;
        int index = -1;
             
        for(int i = 1; scan.hasNextLine(); i++){
            String[] data = scan.nextLine().split(",");  
            Double num = Double.parseDouble(data[1]) * Math.log(Double.parseDouble(data[0]));
            
            if(num > greatest){
                index = i;
                greatest = num;
            }
        }
        
        System.out.println("Answer: "+index);
    }

}
