


import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author Kevin
 */
public class euler071 extends Euler {

    public static void main(String[] args) {
        Start();
        
        //Since max denominator is 1,000,000 - the smallest change in a number is 1/1,000,000 - which is 0.000001
        //this means whatever fraction's decimal value - 0.000001, then multiplied by 1,000,000 will be 
        //the numerator for a rounded fraction (in this case 428570/1,000,000)
        
        //note this only works for extremely high bounds, such as 1,000,000
        
        System.out.println("Answer: "+ ((0.428571 - 0.000001) * 1000000));
    }

}
