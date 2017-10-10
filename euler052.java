
/**
 * @author Kevin
 */
public class euler052 {

    public static void main(String[] args) {
        int ans = 1;

        for (;; ans++) 
            if (sameDig(ans, 2) && sameDig(ans, 3) && sameDig(ans, 4))
                break;
        
        System.out.println("Final Answer: " + ans);
    }

    public static boolean sameDig(int one, int two) {
        String compare = "" + one, regex = "" + (one * two);

        for (char c : compare.toCharArray()) 
            regex = regex.replaceFirst("" + c, "");
      
        return regex.equals("");
    }
}
