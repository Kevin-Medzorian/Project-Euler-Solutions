


import java.util.ArrayList;

/**
 * @author Kevin
 */
public class euler023 {

    
    public static void main(String[] args) {
        ArrayList<Integer> abun = new ArrayList<>();
        boolean[] writable = new boolean[28124];
        
        int bigSum = 0;
        for(int i = 1; i < 28123; i++){
            int sum = 0;
            for (int j = 1; j < i; j++)
                if(i%j==0)
                    sum+=i;
             
            if(sum > i)
                abun.add(i);
            
            System.out.println(i);
            
        }
        for (int j = 0; j < abun.size(); j++) {
                for (int k = j; k < abun.size(); k++) {
                    if(abun.get(j) + abun.get(k) > 28123) break;
                    writable[abun.get(j) + abun.get(k)] = true;
                }
        }
        
        for (int i = 1; i < 28124; i++) 
           bigSum += !writable[i] ? i : 0;
        
        
        System.out.println(bigSum);
    }

}
