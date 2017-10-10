/**
 * @author Kevin
 */
public class euler003 extends Euler{

    
    public static void main(String[] args) {
        Start();
        
        long sqrt = (long) Math.sqrt(600851475143l);
        // (long) turns a number type(int, float, double, etc....) to a long.
        //        It's called 'casting' as long.
        
        long curNum = sqrt;
        
        while(curNum > 0){
            
            if(600851475143l % curNum == 0 && Mathk.isPrime((int) curNum)){ // % sign gives the whole-number division's remainder
                break; // 'break' cuts out of loop- completely.
            }
            
            curNum--;
        }
        
        System.out.println("Final Answer: "+curNum);
    }

}
