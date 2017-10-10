
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class euler079 {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(new File("src/data_79.dat"));
        ArrayList<Integer> code = new ArrayList();
        while(scan.hasNextLine()){
            int[] vals = new int[3];
            for (int i = 0; i < 3; i++) 
                if(code.size() < 3)
                    code.add(scan.nextInt());
                else
                    vals[i] = scan.nextInt();
            
            
            for (int i : vals){
                
                
                
            }
            
            
            
        }  
        
    }

}
