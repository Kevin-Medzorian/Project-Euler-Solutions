

/**
 * @author Kevin
 */
public class euler031 {

    
    public static void main(String[] args) {
        
        int amount = 1;
        
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 5; j++) 
                for (int k = 0; k < 11; k++) 
                    for (int l = 0; l < 21; l++) {
                        if((100 * i) + (50 * j) + (20 * k) + (10 * l) >200 )
                            break;
                        for (int m = 0; m < 41; m++) 
                            for (int n = 0; n < 101; n++) 
                                for (int o = 0; o < 201; o++) 
                                    amount += ((100 * i) + (50 * j) + (20 * k) + (10 * l) + (5 * m) + (2*n) + (o) == 200)? 1 :0;
                    }
        
        System.out.println("Final Answer: "+ amount);    
    }

}
