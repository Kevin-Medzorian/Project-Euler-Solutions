
/**
 * @author Kevin
 */
public class euler007 extends Euler{
    
    public static void main(String[] args) {
        Start();
        
        int answer = 1;
        for(int prime = 0; prime < 10000; answer+=2, prime += ((isPrime(answer) ? 1 : 0)));
        
        System.out.println(answer);
        
    }

}
