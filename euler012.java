
/**
 * @author Kevin
 */
public class euler012 extends Euler{

    
    public static void main(String[] args) {
        Start();
        
        int num = 0;
        
        for(int i = 0;; i ++){
            num += i;
            int divisors = 0, j;
            
            for(j = 1; j *j < num; j++)
                divisors += (num % j == 0) ? 2: 0;
            
            divisors -= (j * j == num) ? 1 : 0;
            
            if(divisors > 500) break;  
        }
        
        System.out.println(num);
    }

}
