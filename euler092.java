

/**
 * @author Kevin
 */

public class euler092 {

    
    public static void main(String[] args) {
        
        int amount = 0;
        for (int i = 1; i < 10000000; i++) {
            boolean has1 = false, has8 = false;
            
            int num = i;
            //System.out.println(i);
            while(true){
                int nextNum = 0;
                
                while(num >= 1){
                    nextNum += (int) Math.pow(num % 10, 2);
                    num /= 10;
                }
                
                if(nextNum == 1)
                    if(has1)
                        break;
                    else
                        has1 = true;
                
                if(nextNum == 89){
                    if(has8){
                        amount++;
                        break;
                    }else{
                        has8 = true;
                    }
                }
                num = nextNum;
            }     
        }
        
        System.out.println("Final Answer: "+amount);
    }
    
}
