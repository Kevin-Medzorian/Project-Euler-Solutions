import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Robot;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Kevin
 */
public class util_AlwaysDay {

    public static void main(String[] args) throws Exception {
        Robot r = new Robot();
        JFrame frame = new JFrame("Always-Day Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(new Dimension(300,100));
        JLabel lbl = new JLabel("waiting for set-time...");
        frame.add(lbl);
        
        char[] message = ("TIME SET 0").toCharArray();
        while (true) {
            
            for(char c : message){
                r.keyPress(KeyEvent.getKeyCodeForChar(c));
                r.keyRelease(KeyEvent.getKeyCodeForChar(c));
            }
            
            lbl.setText("Time has set! "+System.currentTimeMillis());
            Thread.sleep(600);
        }
    }

}
