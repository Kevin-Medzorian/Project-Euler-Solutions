


/**
 * @author Kevin
 */
public class euler041 {
    
    public static void main(String[] args) {
        String regex = "7654321";
        
        int i = 0;
        for(i = 7654321; i > 1; i-=2){
            if(Mathk.isPrime(i)){
                String num = ""+i;
                
                if(num.contains("0"))
                    continue;
                    
                boolean usesAll = true;
                
                for(char c : regex.toCharArray()){
                    if(!num.contains(""+c)){
                        usesAll = false;
                        break;
                    }
                }
                
                if(usesAll)
                    break;
            }   
        }
          
        System.out.println("Final Answer: "+i);
    }

}
