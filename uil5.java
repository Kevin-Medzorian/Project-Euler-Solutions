
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Kevin
 */

public class uil5 {
    
    static ArrayList<Integer> list = new ArrayList();
    
 // static  int count =0;
    public static void main(String[] args) throws Exception{
        
        
        
        
        int[][] nums = {{1,2,3} , {1,2,3} };
        //final int whites = 0;
       // AtomicInteger count = new AtomicInteger(1);
        
        //Arrays.stream(nums).peek(i -> return Arrays.stream(i).peek(j -> return j==255)).count;///forEach(j -> count.add += true ? 1 : 0));

       // for (int[] num : nums) 
         //   Arrays.stream(num).forEach(i -> {whites += true ? 1 : 0;});
        
      //  String[] nums = {"three","two","one"};
      //  Arrays.stream(nums).forEach(num -> System.out.println(num)); 
        
       Scanner scan = new Scanner(new File("src/data_uil5.dat"));
       scan.next();
       
       while(scan.hasNextLine()){
           int num = scan.nextInt();
           String regex = scan.next(); 
           for(int temp = num*2, stop = 0;; temp += num, stop = 0){
               int tmp = temp;
               while(tmp > 0){
                   if(regex.contains(""+(tmp % 10))){
                       stop = 1;
                   }
                   tmp /= 10;
               }
               if(stop == 0){
                   System.out.println(temp);
                   break;
               }
           }
       }
    }
    

}
