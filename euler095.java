import java.util.ArrayList;

/**
 * @author Kevin
 */
public class euler095 extends Euler{
    
    public static void main(String[] args) {
        Start();
        
        final int MAX = 1_000_000;
        
        int[] pairs = new int[MAX],
                data = {0, MAX};        // index 0 = Current largest chain length; index 1 = the chain's smallest member.
                
        for(int i = 1; i < MAX; pairs[i] -= i++)
            for(int j = i ; j < MAX; j += i)
                pairs[j] += i;
        
        for (int i = 1; i < MAX; i++) {
            
            ArrayList chain = new ArrayList();
            
            int next = pairs[i],
                    length = 0,
                    smallestMember = i;
                        
            for(; next < MAX && next != i && !chain.contains(next); length++, chain.add(next), next = pairs[next])
                if(next < smallestMember)
                    smallestMember = next;      
                
            if(next == i && length > data[0])
                data = new int[]{length, smallestMember};
            
        }
        
        
        System.out.println(data[1]);
    }
}
