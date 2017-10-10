
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class uil9{

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("src/data_uil9.dat"));
        scan.nextLine();
        
        while(scan.hasNextLine()){
            String[] arr = scan.nextLine().split(" ");
            ArrayList<int[]> output = new ArrayList();

            for (int i = 0; i < arr.length; i++) {
                int[] element = {Integer.parseInt(arr[i]), 0};
                element[1] = i + 1 + amountLower(element[0], arr);
                output.add(element);
            }
            
            Collections.sort(output, (int[] f, int[] s) -> f[1] < s[1] ? -1 : f[1] > s[1] ? 1 : f[0] > s[0] ? 1 : -1);
            
            for (int i = 0; i < output.size(); i++) 
                System.out.print(output.get(i)[0] +" ");
            
            System.out.println("");
        }   
    }
    
    public static int amountLower(int num, String[] arr){
        int amount = 0;
        for (String arr1 : arr) 
            if (Integer.parseInt(arr1) < num) 
                amount++;
            
        return amount;
    }
}
