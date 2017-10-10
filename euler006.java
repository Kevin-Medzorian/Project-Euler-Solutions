

/**
 * @author Kevin
 */
public class euler006 extends Euler{

    
    public static void main(String[] args) {  
        Start();
        
        int sumSquare = 0, squareSum = 0;
        
        for(int i = 1; i <= 100; i ++){
            sumSquare += Math.pow(i, 2);
            squareSum += i;
        }
           
        squareSum = (int) Math.pow(squareSum, 2);    
        
        System.out.println("Difference: "+(squareSum - sumSquare));
    }

}
