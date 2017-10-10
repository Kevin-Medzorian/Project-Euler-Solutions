
public class euler206 extends Euler {

    public static void main(String[] args) {
        Start();

        for (long i = 1010101009; i < 1421374992; i++) {
            long temp = i * i;

            for (long j = 0; temp >= 1; temp /= 100, temp -= (temp % 1), j = j == 0 ? 9 : j - 1) {
                if (temp % 10 != j) {
                    break;
                }
            }

            if (temp < 1) {
                System.out.println("Answer: " + i);
                break;
            }
        }

    }
}
