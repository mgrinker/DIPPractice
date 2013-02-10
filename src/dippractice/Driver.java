
package dippractice;
/**
 *
 * @author mgrinker
 */
public class Driver {
    public static void main(String[] args) {



        // Get input from scanner output to GUI
        InputStrategy in = new ScannerInput();
        OutputStrategy out = new GUIOutputStrategy();
        MessageService service = new MessageService(in,out);
        service.inputMessage();
        service.outputMessage();
        
        // Get input from scanner output to console
        InputStrategy in2 = new ScannerInput();
        OutputStrategy out2 = new ConsoleOutputStrategy();
        MessageService service2 = new MessageService(in2,out2);
        service2.inputMessage();
        service2.outputMessage();
        
        // Get input from GUI output to console
        InputStrategy in3 = new GuiInput();
        OutputStrategy out3 = new ConsoleOutputStrategy();
        MessageService service3 = new MessageService(in3,out3);
        service3.inputMessage();
        service3.outputMessage();
        
        // Get input from GUI output to GUI
        InputStrategy in4 = new GuiInput();
        OutputStrategy out4 = new GUIOutputStrategy();
        MessageService service4 = new MessageService(in4,out4);
        service4.inputMessage();
        service4.outputMessage();
        
    }
}
