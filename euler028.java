/**
 * @author Kevin
 */
public class euler028 extends Euler {

    static int nextNum = 1002001;
    static int[][] numbers = new int[1001][1001];
    static int[] pos = {0,1001};
    
    public static void main(String[] args) { 
        Start();
        
        int sum = 0;
         
        while(nextNum > 0){
            while(pos[1] - 1 > -1 && numbers[pos[0]][pos[1] - 1] == 0)
                Move(pos[0], pos[1]-1);
            while(pos[0] + 1 < 1001 && numbers[pos[0] + 1][pos[1]] == 0)
                Move(pos[0]+1, pos[1]);
            while(pos[1] + 1 < 1001 && numbers[pos[0]][pos[1] +1] == 0)
                Move(pos[0], pos[1]+1);
            while(pos[0] -1 < 1001 && numbers[pos[0] - 1][pos[1]] == 0)
                Move(pos[0]-1, pos[1]);
        }
        
        pos[0] = pos[1] = 0;
        
        while(pos[0] < 1001)
            sum += numbers[pos[0]++][pos[1]++];
        
        pos[0] = 0;
        pos[1] = 1000;
        
        while(pos[0] < 1001)
            sum += numbers[pos[0]++][pos[1]--];
        
        System.out.println(--sum);
    }
    static void Move(int x, int y){
        numbers[x][y] = nextNum--;
        pos[0] = x;
        pos[1] = y;
    }

}
