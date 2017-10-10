
public class euler001 extends Euler{

    public static void main(String[] args) {
        Start();
        
        int sum = 0, i = 2;
        
        for (;i < 999; i++, sum += i % 3 == 0 || i % 5 == 0 ? i:0);
        
        System.out.println("Answer: "+sum);
        
    }
}
