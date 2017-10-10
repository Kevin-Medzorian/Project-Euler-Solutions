

/**
 * @author Kevin
 */
public class euler030 {

    public static void main(String[] args) {
        int sum = 0;
        
        for(int i = 354294; i>2;i--){
            int num = i;
            int[] digits = new int[(""+num).length()];
            
            for (int j = 0; num >= 1; j++) {
                digits[j] = num%10;
                num/=10;
            }
            int summed = 0;
            
            for (int digit : digits) 
                summed += (Math.pow(digit, 5));
            
            sum += (summed==i)? i:0;          
        }
        
        System.out.println("Final Sum: "+sum);    
    }
}
