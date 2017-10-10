
import java.lang.reflect.Field;




/*
 * @author Kevin
 */
public class util_IntegerValueChange {
    
    public static void main(String[] args) throws Exception {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field f = Integer.class.getDeclaredClasses()[0].getDeclaredField("cache");
        
        f.setAccessible(true);
        Integer[] arr = (Integer[]) f.get(cache);
        
        arr[132] = arr[133];
        System.out.print("2 + 2 = ");
        System.out.printf("%d", (2+2));
        System.out.println("");
        
    }

}
