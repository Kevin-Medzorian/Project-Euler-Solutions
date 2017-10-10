


import java.util.Arrays;

/**
 * @author Kevin
 */
public class euler005 {

    public static void main(String[] args) {
        
        int answer = 20;
        
        for(;; answer += 20){                
            boolean divisible = true;
            
            for(int j = 11; j < 20 && divisible; j++)
                divisible = (answer % j == 0);
                
            if(divisible)
                break;
        }
        
        System.out.println(answer);
    }
}
