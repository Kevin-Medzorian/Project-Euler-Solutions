


/**
 * @author Kevin
 */
public class euler049 {

    public static void main(String[] args) {
        
        String answer = null;
        for (int i = 1001; answer==null; i+=2) {
            if (i != 1487) {
                if(isPrimePermutation(i, i+3330) && isPrimePermutation(i+3330, i+6660))
                    answer = ""+i +(i+3330) + (i+6660);   
            }
        }
        System.out.println("Final Answer: "+answer);
    }
    
    public static boolean isPrimePermutation(int one, int two){   
        if(!Mathk.isPrime(two) || !Mathk.isPrime(one))
            return false;
        
        String regex = ""+one;
        String regex2 = ""+two;
        
        for (int i = 0; i < regex.length(); i++) 
            regex2 = regex2.replaceAll(""+regex.charAt(i), "");
        
        return regex2.equals("");
    }
}
