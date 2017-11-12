
/**
 * @author Kevin
 */
public class euler587 extends Euler {

    public static void main(String[] args) {
        Start();
        
        double l_section = 1.0 - (Math.PI / 4.0);     //integrate quater circle equation from 0 to 1
        int amount = 2;

        //important to assume r = 1
        
        //equation for the linear line is x/amount
        //equation for a half-circle (adjusted to origin) is 1 - Math.sqrt(1-(x-1)^2) or 1 - Math.sqrt(r^2-(x-1)^2)
        
        for (;;) {
            
            //calculate intersection by setting linear eq to half-circle eq
            double i = ((amount * amount) + amount - (Math.sqrt(2.0) * Math.pow(amount, 1.5))) / (1.0 + (amount * amount)),
            
            //calculate area under curved portion from intersection to 1 using integration
            curved_area = 0.25 * ((-4 * i) - (2 * Math.asin(1 - i)) - Math.sin((2 * Math.asin(1.0 - i))) + 4),

            //calculate area under linear from 0 to intersection using integration
            linear_area = (i * i) / (2 * ++amount),

            //add both to get area of triangle
            triangle_area = curved_area + linear_area;

            if (triangle_area / l_section < 0.001) 
                break;
            
        }

        System.out.println(amount);
    }
}
