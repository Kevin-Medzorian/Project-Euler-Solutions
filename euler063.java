
/**
 * @author Kevin
 */
public class euler063 {

    public static void main(String[] args) {
        int amount = 0;

        for (int i = 0; i <= 10; i++) 
            for (int j = 0; j <= 25; j++) 
                if ((int) Math.log10(Math.pow(i, j)) == j - 1) 
                    amount++;
            
        System.out.println("Answer: "+amount);
    }

}
