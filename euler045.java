/**
 * @author Kevin
 */
public class euler045 {

    public static void main(String[] args) {
        
        for (long i = 1; i < 100000; i+=2) {
            if(isPent(Tri(i)) && isHex(Tri(i))){
                System.out.println(Tri(i));
            }
        }
    }
    public static boolean isPent(long i) {
        return ((Math.sqrt(24 * i + 1) + 1) / 6) % 1 == 0;
    }
    public static boolean isHex(long i) {
        return ((Math.sqrt(8 * i + 1) + 1) / 4) % 1 == 0;
    }
    public static long Tri(long i) {
        return (i * (i + 1) / 2);
    }
}
