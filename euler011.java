
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class euler011 {

    static ArrayList<int[]> numbers = new ArrayList<int[]>();
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(new File("11data.txt"));
        
        while(scan.hasNextLine()){
            String[] nums = scan.nextLine().split(" ");
            int[] newRow = new int[nums.length];
            
            for(int i = 0; i < nums.length; i++)
                newRow[i] = Integer.parseInt(nums[i]);
                
            numbers.add(newRow);
        }
        
        
        int[] bigNumbers = new int[4];
        int greatestSum = 0;
        
        for(int r = 0; r < numbers.size(); r++){
            for(int c = 0; c < numbers.size(); c++){
               if(getLeft(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : getLeft(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = getLeft(r,c);
                   } 
               }
               if(getRight(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : getRight(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = getRight(r,c);
                   } 
               }
               if(getUp(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : getUp(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = getUp(r,c);
                   } 
               }
               if(getDown(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : getDown(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = getDown(r,c);
                   } 
               }
               if(topLeft(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : topLeft(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = getLeft(r,c);
                   } 
               }
               if(topRight(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : topRight(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = topRight(r,c);
                   } 
               }
               if(bottomLeft(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : bottomLeft(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = bottomLeft(r,c);
                   } 
               }
               if(bottomRight(r, c)[0] != -5){
                   int sum = 1;
                   
                   for(int num : bottomRight(r, c))
                       sum *= num;
                   
                   if(sum > greatestSum){
                       greatestSum = sum;
                       bigNumbers = bottomRight(r,c);
                   } 
               }
            }  
        }
        
        System.out.println(Arrays.toString(bigNumbers));
        System.out.println("Greatest Sum: "+greatestSum);
    }
    
    
    
    public static int[] getLeft(int row, int col){   
        if(col >= 3)
            return new int[]{numbers.get(row)[col-3], numbers.get(row)[col-2], numbers.get(row)[col-1],numbers.get(row)[col]};
            
        return new int[]{-5};
    }
    
    public static int[] getRight(int row, int col){   
        if(col <= numbers.get(row).length - 4)
            return new int[]{numbers.get(row)[col+3], numbers.get(row)[col+2], numbers.get(row)[col+1],numbers.get(row)[col]};
            
        return new int[]{-5};
    }
    public static int[] getUp(int row, int col){   
        if(row >= 3)
            return new int[]{numbers.get(row)[col], numbers.get(row-1)[col], numbers.get(row-2)[col],numbers.get(row-3)[col]};
            
        return new int[]{-5};
    }
    
    public static int[] getDown(int row, int col){   
        if(row <= numbers.size() - 4)
            return new int[]{numbers.get(row+1)[col], numbers.get(row+2)[col], numbers.get(row+3)[col],numbers.get(row)[col]};
            
        return new int[]{-5};
    }
    
    
    public static int[] topLeft(int row, int col){   
        if(row >= 3 && col > 3)
            return new int[]{numbers.get(row-1)[col-1], numbers.get(row-2)[col-2], numbers.get(row-3)[col-3],numbers.get(row)[col]};
            
        return new int[]{-5};
    }
    
    public static int[] topRight(int row, int col){   
        if(row >= 3 && col <= numbers.size() - 4)
            return new int[]{numbers.get(row-1)[col+1], numbers.get(row-2)[col+2], numbers.get(row-3)[col+3],numbers.get(row)[col]};
            
        return new int[]{-5};
    }
    public static int[] bottomLeft(int row, int col){   
        if(row <= numbers.size() - 4 && col >= 3)
            return new int[]{numbers.get(row+1)[col-1], numbers.get(row+2)[col-2], numbers.get(row+3)[col-3],numbers.get(row)[col]};
            
        return new int[]{-5};
    }
    public static int[] bottomRight(int row, int col){   
        if(row <= numbers.size() - 4 && col <= numbers.get(row).length - 4)
            return new int[]{numbers.get(row+1)[col+1], numbers.get(row+2)[col+2], numbers.get(row+3)[col+3],numbers.get(row)[col]};
            
        return new int[]{-5};
    }
    
}
