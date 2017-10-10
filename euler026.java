

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
/**
 * @author Kevin
 */
public class euler026 {

    public static void main(String[] args) {
        
        int num = 0;
        int length = 0;
        
        for(int i = 1000;i>1; i--){
            if(length > i)
                break;
            
            int[] numbers = new int[i];
            int ind = 1;
            int len = 0;
            
            while(numbers[ind] == 0 && ind != 0){
                numbers[ind] = len;
                ind *=10;
                ind %= i;
                len++;
            }

            if(len - numbers[ind] > length){
                length = len-numbers[ind];
                num= i;
            }  
        }
        
        System.out.println("\nFinal Answer: "+ num);
    }

}
