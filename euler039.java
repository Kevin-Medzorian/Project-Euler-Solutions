


/**
 * @author Kevin
 */
public class euler039 {

    
    public static void main(String[] args) {
       
        
        int num = 0;
        int max = 0;
        for(int i = 5; i < 1001; i++){
            if(Mathk.isPrime(i))
                continue;
            
            int amount = 0;
            
            for (int j = i/3-1; j < i; j++) 
                for (int k = j/2-1; k < j; k++) 
                    for (int l = k/2-1; l < k; l++) 
                        if(Math.pow(k, 2) + Math.pow(l, 2) == Math.pow(j, 2) && j+k+l == i)
                            amount++;
            
            if(amount > max){
                num = i;
                max = amount;
            }
            System.out.println(i);
        }
        
        System.out.println("Final Answer: "+num);
    }

}
