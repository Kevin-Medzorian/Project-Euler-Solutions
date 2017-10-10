/**
 * @author Kevin
 */
public class euler387 extends Euler {

    public static void main(String[] args) {
        Start();
        long sum = 0;
        
        for(long i = 11; i < 10000; i+=2){
            
            if(isPrime(i) && H(i/10)){
                long num = i / 10;
                
                if(isPrime(num / DigitSum(num)))
                    sum += i;
            }
        }
        
        System.out.println("Anwser: "+sum);
    }

    private static boolean H(long num){
        if(num == 0)
            return true;
        
        if(num % DigitSum(num) == 0)
            return H(num/10);
        
        return false;
    }
}
