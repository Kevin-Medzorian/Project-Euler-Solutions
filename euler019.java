
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * @author Kevin
 */
public class euler019 extends Euler{

    public static void main(String[] args) {
        Start();
        
        int sundays = 0;
        
        for(int i = 1901; i < 2000; i++)
            for(int j = 1; j <= 12; j++)
                if(LocalDate.of(i, Month.of(j), 5).getDayOfWeek() == DayOfWeek.SUNDAY)
                    sundays++;
            
        
        
        System.out.println(sundays);
    }

}
