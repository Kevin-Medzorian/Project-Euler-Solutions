

import java.util.ArrayList;

/**
 * @author Kevin
 */
public class euler032 {

    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        for(int i = 0; i < 100; i++){
            for (int j = 0; j < 3000; j++) {
                String regex = ""+i+""+j+""+(i*j);
                
                if(regex.contains("0")||regex.length() != 9)
                    continue;
                
                boolean repeats = false;
                for(char c : regex.toCharArray()){
                    if(regex.indexOf(""+c) != regex.lastIndexOf(""+c)){
                        repeats = true;
                        break;
                    }
                }
                
                if(!repeats && !nums.contains(i*j)){
                    System.out.println(""+i+" x "+j+" = "+(i*j));
                    nums.add(i*j);    
                }
            }
        }
        int sum = 0;
        
        for (Integer num : nums)
            sum += num;
        
        System.out.println("Final Answer: "+sum);
    }

}
