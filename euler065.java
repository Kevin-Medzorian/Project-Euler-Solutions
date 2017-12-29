import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler065 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();

        final int LIMIT = 100;
        Fraction frac = new Fraction(new BigInteger("2")).add(Fraction.ONE().divide(findConvergent(LIMIT, 2)));
                
        int sum = 0;
        for (char c : frac.num.toString().toCharArray()) 
            sum +=  Integer.parseInt(""+c);
        
        System.out.println(sum);
    }

    static Fraction findConvergent(int max, int index) {
        if (index == max) 
            return (index % 3 == 0) ? new Fraction(Kn(index)) : Fraction.ONE();
        
        return (index % 3 == 0) ? new Fraction(Kn(index)).add(Fraction.ONE().divide(findConvergent(max, index + 1))) : Fraction.ONE().add(Fraction.ONE().divide(findConvergent(max, index + 1)));
    }
    
    static BigInteger Kn(int n){
        return new BigInteger("2").multiply(new BigInteger(""+(n/3)));
    }
}
