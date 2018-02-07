/**
 * @author Kevin
 */
public class euler004 {

    
    public static void main(String[] args) {
        int product, largest = 0;
        
        
        for(int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                product = i * j;
                if(isPaladrome(product) && product > largest) largest = product;
            }
        }
        
        System.out.println(largest);
    }
    
    public static boolean isPaladrome(int num){
        return num == Integer.parseInt(new StringBuilder(""+num).reverse().toString());
    }
}
