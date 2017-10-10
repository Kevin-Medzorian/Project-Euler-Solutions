
/**
 * @author Kevin
 */
public class euler145 extends Euler {

    public static void main(String[] args) {
        Start();

        int amount = 0;
        //1- 1000 = 120
        //1- 10000 = 720
        //1- 100000 = 720
        //1- 1000000 = 18,720
        //1- 10000000 = 68,720
        //1- 100000000 = 608,720
        //1- 1000000000 = 608,720
        
        for (int i = 1, num = 2; i < 100000000; i++) {
            int reverse = quickReverse(i);
            if (i % 10 > 0 && reverse % 10 > 0) {
                num = i + reverse;
                while (num >= 1 && (num % 10) % 2 > 0) {
                    num /= 10;
                }

                if (num < 1) {
                    amount++;
                }

            }
        }
        
        System.out.println("Final Answer: "+amount);
    }

}
