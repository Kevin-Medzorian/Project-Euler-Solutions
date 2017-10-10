

public class euler010 extends Euler{

    public static void main(String[] args) throws Exception{
        Start();
        
        long sum = 0;
        for(Integer i : GetPrimes(2000000))
            sum += i;
        
        System.out.println("Sum: " + sum);
    }
}
