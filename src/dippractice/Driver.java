
package dippractice;
import javax.swing.JOptionPane;
/**
 *
 * @author mgrinker
 */
public class Driver {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello World");

        InputStrategy in = new ScannerInput();
        OutputStrategy out = new GUIOutputStrategy();
        MessageService service = new MessageService(in,out);
        service.inputMessage();
        service.outputMessage();
        
    }
}
