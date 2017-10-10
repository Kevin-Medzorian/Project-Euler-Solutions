

import java.io.File;
import java.util.Scanner;
/**
 * @author Kevin
 */

public class euler059 extends Euler{

    
    public static void main(String[] args) throws Exception {
        Start();
        
        String al = "abcdefghijklmnopqrstuvwxyz", regex = al + " ,.?!;'0123456789()";
        
        String[] vals = new Scanner(new File("59data.txt")).next().split(",");
        
        int index = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    String sskey =""+ al.charAt(i) + al.charAt(j) + al.charAt(k);
                    
                    String sentence = "";
                    boolean isSent = true;
                    for (String val : vals) {
                        char c = (char)(Integer.parseInt(val) ^ Character.valueOf(sskey.charAt(index++)));
                        
                        if(!regex.contains((""+c).toLowerCase()))
                            isSent=false;
                        
                        
                        sentence += c;
                        
                        if(index == 3)
                            index = 0;
                    }
                    
                    if(isSent){
                        System.out.println("Encryption Code: "+sskey);
                        System.out.println("Sentence: "+sentence);
                        
                        int sum = 0;
                        for (char c : sentence.toCharArray()) 
                            sum += c;
                        
                        System.out.println("Final Sum: "+sum);
                        break;
                    }
                }
            }
        }
    }

}
