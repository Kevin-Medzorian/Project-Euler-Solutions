
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Kevin
 */
public class euler040 {
    
    
    public static void main(String[] args) {
        String[] nums = new String[543300];
        
        for(int i = 1; i < nums.length; i++)
            nums[i-1] =""+ i;

        int product = 1;
        for(int i = 1; i < 1000001; i *=10){
            int valueIndex = 0, charIndex = 0, allChars = 1;

            while(allChars < i)
                allChars += nums[valueIndex++].length();
            
            if(allChars > i){
                charIndex = nums[valueIndex].length();
                while(allChars > i){
                    allChars--;
                    charIndex--;
                }
            }
            product *= (Integer.parseInt(""+nums[valueIndex].charAt(charIndex)));
        }
        
        System.out.println("Final Answer: "+product);
    }

}
