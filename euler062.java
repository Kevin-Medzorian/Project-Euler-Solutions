
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Kevin
 */
public class euler062 extends Euler{

    public static void main(String[] args) {
        Start();
        //1290 is the cube-root of the max integer value
        final long MAX = 10000;

        long[][] arr = new long[(int) MAX][10];
        HashMap<String, ArrayList<Long>> hm = new HashMap();

        for (long i = 2; i < MAX; i++) {
            for (long cube = i * i * i; cube > 0; cube /= 10l) 
                arr[(int) i][(int) (cube % 10l)]++;
            
            String str = Arrays.toString(arr[(int) i]);

            if (!hm.containsKey(str)) 
                hm.put(str, new ArrayList());
            
            ArrayList<Long> curSet = hm.get(str);
            curSet.add(i);
            hm.replace(str, curSet);
        }
        
        long lowest = Long.MAX_VALUE;
        
        for (ArrayList<Long> hs : hm.values()) 
            if (hs.size() == 5) 
                for (long next : hs) 
                    if (next < lowest) 
                        lowest = next;
                            
        System.out.println("Answer: "+ (long) Math.pow(lowest,3));
    }
    
}
