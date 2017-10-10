
/**
 * @author Kevin
 */
public class euler035 {

    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i < 1000000; i++) {
            String num = "" + i;
            boolean circular = true;
            for (int j = 0; j < num.length()+1 && circular; j++) {
                num = ""+num.charAt(num.length()-1)+num;
                num=num.substring(0,num.length()-1);
                
                circular = Mathk.isPrime(Integer.parseInt(num));
            }
            if(circular)
                amount++;
        }
        
        System.out.println("Final Answer: "+amount);
    }

}
