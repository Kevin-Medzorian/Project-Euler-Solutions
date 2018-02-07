/**
 * @author Kevin
 */
public class euler017 extends Euler{

    public static final String[] WORDS = {"one","two","three","four","five","six","seven", "eight", "nine", "ten", "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen", "eighteen","nineteen", "twenty", "thirty","fourty","fifty","sixty","seventy","eighty", "ninety"};

    public static void main(String[] args) {
        Start();
        
        long letters = 0;
        for(int i = 1; i <= 1000; i++){
            int num = i;
            if(i < 20){
                letters += WORDS[num-1].replaceAll(" ", "").length();
            }else{
                if(num < 100){
                    
                    if(num % 10 != 0)
                        letters += cVal(WORDS[num % 10 -1]);
                    num/= 10;
                    letters += cVal(WORDS[num + 17]);
                        
                }else if(num == 100){
                    letters += cVal("one hundred");
                }else if(num > 100 && num != 1000){
                    if(num % 10 != 0){
                        letters += cVal(WORDS[num %10  -1]);
                        letters += cVal("and");
                    }
                    num/= 10;
                    if(num % 10 != 0)
                        letters += cVal(WORDS[(num % 10) + 17]);
                    num/=10;
                    letters += cVal(WORDS[num -1]);
                    letters += cVal("hundred");
                }else{
                    letters += cVal("one thousand");
                }
                            
            }
        }
        System.out.println(letters);
    }
    public static int cVal(String let){
        return let.replaceAll(" ","").length();
        
    }

}
