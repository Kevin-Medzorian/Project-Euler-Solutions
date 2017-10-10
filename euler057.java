


import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler057 {

    
    public static void main(String[] args) {
           
        int times = 0, answer = 0;
        
        BigInteger num = new BigInteger("1");
        BigInteger den = new BigInteger("2");
        
        while(times < 1000){
            times++;
            
            
            BigInteger nNum = new BigInteger("2");
            BigInteger nDen = new BigInteger("1");
            
            BigInteger multi = Mathk.lcm(nDen, den).divide(nDen);
            
            nNum = nNum.multiply(multi);
            nDen = nDen.multiply(multi);
            
            nNum = nNum.add(num);
            
            num = nDen;
            den = nNum;
            
            
            if(num.add(den).toString().length() > den.toString().length())
                answer++;
        }
        System.out.println("Final Answer: "+answer);
    }

}
