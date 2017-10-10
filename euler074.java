/**
 * @author Kevin
 */
public class euler074 extends Euler{
    
    public static int[] arr = new int[62];
    public static int index = 0;
    
    public static void main(String[] args) throws Exception{  
        Start();
        
        int amount = 0;

        for(int i = 11; i < 1000000; i++){
            index = 0;
            
            GetLength(i);
            if(index == 60)
                amount++;            
        } 
        
        System.out.println("Answer: "+amount);
    }
    public static int GetLength(int num){
        arr[index++] = num;
        int newNum = 0;
        while(num >= 1){
            newNum += F(num % 10);
            num /= 10;    
        }
        
        if(index > 60)
            return 0;
        
        if(ArrayIndexOf(arr, newNum, index) > -1)
            return 0;
        
        GetLength(newNum); 
        
        return 1;
    }
    
}
