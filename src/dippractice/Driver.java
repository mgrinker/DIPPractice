
package dippractice;

/**
 *
 * @author mgrinker
 */
public class Driver {
    public static void main(String[] args) {
        
        InputStrategy in = new ScannerInput();
                
        OutputStrategy out = new GUIOutputStrategy();
        MessageService service = new MessageService(in,out);
        service.inputMessage();
        service.outputMessage();
        
    }
}
