
import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler065 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();

        final int LIMIT = 100;
        Fraction frac = new Fraction(BigInteger.valueOf(2)).add(Fraction.ONE.divide(Converge(LIMIT, 2)));

        int sum = 0;
        for (char c : frac.num.toString().toCharArray()) 
            sum += Integer.parseInt("" + c);

        System.out.println(sum);
    }

    static Fraction Converge(int max, int i) {
        if (i == max) 
            return i % 3 == 0 ? new Fraction(BigInteger.valueOf(2 * i / 3)) : Fraction.ONE;

        return i % 3 == 0 ? new Fraction(BigInteger.valueOf(2 * i / 3)).add(Fraction.ONE.divide(Converge(max, i + 1))) : Fraction.ONE.add(Fraction.ONE.divide(Converge(max, i + 1)));
    }
}
