

/**
 * @author Kevin
 */
public class euler036 {

    
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 1000000; i++)
            sum += (isPaladrome(i) && isPaladrome(Integer.toBinaryString(i))) ? i : 0;
            
        System.out.println("Final Answer: "+sum);
    }
    public static boolean isPaladrome(int num){
        return isPaladrome(""+num);
    }
    public static boolean isPaladrome(String num){
        return num.equals(new StringBuilder(num).reverse().toString());
    }

}
