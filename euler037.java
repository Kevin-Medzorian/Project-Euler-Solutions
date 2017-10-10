

import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler037 {

    
    public static void main(String[] args) {
       
        int sum = 0;
        
        for(int num = 11, amount = 0; amount < 11; num+=2){
            if(!Mathk.isPrime(num))
                continue;
            
            int temp = num;
            boolean nope = false;
            while(temp >= 1){
                if(!Mathk.isPrime(temp)){
                    nope = true;
                    break;
                }
                temp /= 10;
            }
            
            if(nope)
                continue;
            
            String number = ""+num;
            
            while(number.length() > 0){
                
                if(!Mathk.isPrime(Integer.parseInt(number))){
                    nope = true;
                    break;
                }
                number = number.substring(1);
            }
            
            if(nope)
                continue;
            
            sum+=num;
            amount++;
        }
        
        System.out.println("Final Answer: "+sum);
        
    }

}
