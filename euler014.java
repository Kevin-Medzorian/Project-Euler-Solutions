/**
 * @author Kevin
 */
public class euler014 extends Euler{

    public static void main(String[] args) {
        Start();

        long longestChain = 1, longestNumber = 1;

        for (int i = 1; i < 1000000; i++) {
            long chain = 1, currentNum = i;

            while (currentNum > 1) {
                currentNum = (currentNum % 2 == 0) ? currentNum/2 : (currentNum  * 3) + 1;                
                chain++;
            }

            if (chain > longestChain) {
                longestChain = chain;
                longestNumber = i;
            }

        }
        
        System.out.println(longestNumber);
    }
}
