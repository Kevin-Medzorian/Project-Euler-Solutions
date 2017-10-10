
import java.io.File;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class uil8 {

    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(new File("src/data_uil8.dat"));
       scan.next();
       while(scan.hasNextLine()){
           int num = scan.nextInt();
           for (int i = num; i > 0; i--) {
               if(num % i == 0 && isPrime(i)){
                   System.out.println(i);
                   break;
               }
           } 
       }
       
    }
    public static boolean isPrime(int num){
        if(num == 2)
            return true;
        for (int i = 2; i*i <= num; i++) 
            if(num % i == 0)
                return false;
        
        return true;    
    }
}
