

/**
 * @author Kevin
 */
public class euler038 {

    
    public static void main(String[] args) {
        
        int largest = 0;
        
        for(int i = 192; i < 20000; i++){
            
            String con = "";
            String storage = "";
            
            for(int k = 1; con.length() < 9;)
                con += ""+(i * k++);
            
            if(con.length() == 9){
                storage = con;
                int j = 1;
                while(j < 10){
                    if(!con.contains(""+j))
                        break;
                    con = con.replaceAll(""+j++, "");              
                }
                if(j==10 && Integer.parseInt(storage) > largest)
                    largest = Integer.parseInt(storage);
            }  
        }
        
        System.out.println("Final Answer: "+largest);

    }

}
