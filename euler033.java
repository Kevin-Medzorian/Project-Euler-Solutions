


/**
 * @author Kevin
 */
public class euler033 {

    
    public static void main(String[] args) {

        double product = 0;
        for(int i = 10, amount = 0; amount < 4; i++){
            for (int j = 10; j < i; j++) {
                double value = (double) j/i;
                
                String[] vals = {""+i, ""+j};
                
                for(char c : vals[0].toCharArray()){
                    if(c=='0')
                        continue;
                    if(vals[1].equals(vals[0]))
                        break;
                    if(vals[1].contains(""+c)){
                        vals[1] = vals[1].replaceFirst(""+c, "");
                        vals[0] = vals[0].replaceFirst(""+c, "");
                        if(Matches(value, vals[1], vals[0])){
                            product = (product == 0)? value : product * value;
                            amount++;
                        }
                    }
                }
            }
        }
        System.out.println("Final Answer: "+product+" (the denominator) ");
    }
    public static boolean Matches(double val, String one, String two){
        return ((double) Integer.parseInt(one)/Integer.parseInt(two) == val);    
    }
}
