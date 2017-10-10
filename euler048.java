

import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler048 {

    
    public static void main(String[] args) {  
        BigInteger sum = new BigInteger ("0");
        
        for(int i = 1; i < 1001; i++)  
            sum = sum.add(new BigInteger(""+i).pow(i));
        
        System.out.println("Final Answer: "+sum.toString().substring(sum.toString().length()-10));
        
    }

}
