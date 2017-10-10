import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Kevin
 */

class Word {

    public int[] alphabet = new int[26];
    public String name;

    public Word(String n) {
        name = n;
    }

}

public class euler098 extends Euler {

    private static final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws Exception {
        Start();
        System.out.println("Takes about 3m to compute...");
        
        String[] data = new Scanner(new File("src/euler098.dat")).next().replaceAll("\"", "").split(",");
        Word[] words = new Word[data.length];

        int largest = 0;

        for (int i = 0; i < data.length; i++) {
            Word word = new Word(data[i]);

            for (int j = 0; j < word.name.length(); j++) {
                if (ABC.contains("" + data[i].charAt(j))) {
                    word.alphabet[ABC.indexOf(data[i].charAt(j))]++;
                }
            }

            words[i] = word;
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length - 1; j++) {

                if (Arrays.equals(words[i].alphabet, words[j].alphabet)) {
                    Word one = words[i],
                            two = words[j];
                    
                    int uNums = 0;
                    for (int k = 0; k < 26; k++) 
                        if (one.alphabet[k] > 0) 
                            uNums++;
                    
                    int max = (int) Math.pow(10, uNums) - 1;
                    
                    for (int k = max, temp = k; k > 0; k--) {
                        HashMap<Character, Integer> map = new HashMap();

                        int l = 0;
                        
                        for (; l < 26; l++){
                            if (one.alphabet[l] > 0){
                                if(map.containsValue(temp % 10)){
                                    break;
                                }else{
                                    map.put(ABC.charAt(l), temp % 10);
                                    temp /= 10;
                                }
                            }
                        }
                        
                        if(l == 26 && map.get(one.name.charAt(0)) != 0 && map.get(two.name.charAt(0)) != 0){
                            int n1, n2 = n1 = 0;

                            for (int m = 0; m < one.name.length(); m++) {
                                int power = (int) Math.pow(10, one.name.length() - m - 1) ;

                                n1 += map.get(one.name.charAt(m)) * power;
                                n2 += map.get(two.name.charAt(m)) * power;
                            }

                            if (isSquare(n1) && isSquare(n2)) {                       
                                if (n1 > largest) 
                                    largest = n1;

                                if (n2 > largest) 
                                    largest = n2;
                            }
                        }
                    }
                }
            }
        }
        
        
        System.out.println(largest);
    }
}
