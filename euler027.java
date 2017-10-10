


/**
 * @author Kevin
 */
public class euler027 {

    public static void main(String[] args) {
        
        int a,b,max;
        a=b=max=0;
        
        for (int i = -999; i < 1000; i++) {  
            for (int j = 1; j < 1000; j+=2) {
                
                if(!Mathk.isPrime(j))
                    continue;
                
                int n = 0;
                
                while(Mathk.isPrime((n*n) + (i*n) + j))
                    n++; 
                             
                if(n > max){
                    max = n;
                    a= i;
                    b = j;
                }
                
            }
        }
        
        System.out.println("Final Answer: "+(a*b) +"\nLength: "+max+"\nA: "+a+"\nB: "+b);
    }

}
