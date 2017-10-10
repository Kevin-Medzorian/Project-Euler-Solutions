


import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author Kevin
 */
public class euler495 {


    public static void main(String[] args) {

        /*BigInteger factorial = new BigInteger("10000");

        for (int i = 1; i < 10000; i++) {
            factorial = factorial.multiply(new BigInteger("" + i));
        }

        for(int i = 0; i < 100; i++){
            int random = (int) (Math.random() * 291)+20;
            if(Mathk.isPrime(random))
                continue;
            System.out.println(random +", 3 = "+three(random));
        }*/
        
        
        System.out.println(W(10000, 30));
    }
    public static int W(int n, int k){
        int sum = 0;
        
        for(int i = 10000; i > 29; i--)
            sum += i;
        
        
        return sum;
    }
    
    public static int three(int num) {
        int amount = 0;
        for (int i = 1; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                for (int k = j+1; k < num; k++) {
                    if(i*j*k == num)
                        amount++;
                }
            }
        }
        return amount;
    }
    public static int four(int num) {
        int amount = 0;
        for (int i = 1; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                for (int k = j+1; k < num; k++) {
                    for (int l = k+1; l < num; l++) {
                        if(i*j*k*l == num)
                            amount++;
                    }
                }
            }
        }
        return amount;
    }
}
