

/**
 * @author Kevin
 */
public class euler002 extends Euler{

    
    public static void main(String[] args) {
        Start();
        
        int sum = 0;
        
        for(int i = 1, one, two = 1; i < 4000000; i = one + two){
            sum += (i % 2 == 0) ? i : 0;
            one = two;
            two = i;
        }
        
        System.out.println(sum);
    }

}
