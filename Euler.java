

/**
 * @author Kevin
 */

public abstract class Euler extends Mathk{
    private static long startTime;
    
    public static void Start() {  
        startTime = System.currentTimeMillis();
        
        Runtime.getRuntime().addShutdownHook(new Thread(){
           @Override()
           public void run(){
               System.out.println("[Completed in " + (System.currentTimeMillis() - startTime) +" ms]");
           } 
        });
        
    }
}

