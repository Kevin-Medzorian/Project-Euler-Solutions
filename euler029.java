

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author Kevin
 */
public class euler029 {

    
    public static void main(String[] args) {
        ArrayList<BigInteger> nums = new ArrayList<>();
       
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j < 101; j++) {
                BigInteger num = new BigInteger(""+i);
                num = num.pow(j);
                
                if(!nums.contains(num))
                    nums.add(num);  
            }           
        }
        System.out.println(nums.size()); 
    }

}
