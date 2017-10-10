
public class euler009 extends Euler{

    public static void main(String[] args){    
        Start();
        for(int one = 0; one < 500; one ++)
            for(int two = one; two < 500; two++)
                for(int three = two; three < 500; three++)
                    if(Math.pow(one, 2) + Math.pow(two, 2) == Math.pow(three, 2) && one + two +  three == 1000)
                            System.out.println(one +"   "+two +"   "+three +"\n"+"Product: "+(long)one * (long) two * (long) three);              
    }
    
}
