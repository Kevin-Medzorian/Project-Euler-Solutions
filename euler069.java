
import java.util.Arrays;

/**
 * @author Kevin
 */
public class euler069 extends Euler{

    public static void main(String[] args) {
        Start();
        double max = 0, ans = 0;
        for(int i = 0; i < 25; i++){
            System.out.println(i +": " + phi(i));
            if(i % 1000 == 0){

            }
            if(!isPrime(i) && (double)i/phi(i) > max){
                max = (double)i/phi(i);
                ans = i;
            }

        }
        
    }
           
    public static int phi(int n){
        int sum = 0;
        
        for(int k = 1; k <= n; k++)
            sum += gcd(k, n) * Math.cos(2.0 * Math.PI * (k/(double)n));
        
        return sum-1;
    }
}
