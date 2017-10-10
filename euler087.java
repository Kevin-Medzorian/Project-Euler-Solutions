
/**
 * @author Kevin
 */
public class euler087 extends Euler {

    public static void main(String[] args) {
        Start();
        int amount = 0;
        for (int i = 0; i < 50; i++) {
            if(isPrime(i))
                amount++;
        }
        System.out.println("Answer: "+amount);
    }

}
