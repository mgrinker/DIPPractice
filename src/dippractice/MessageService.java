
package dippractice;

/**
 *
 * @author mgrinker
 */
public class MessageService {
    //private static final String MSG = "Hello";
    private InputStrategy in;
    private OutputStrategy out;
    private String input;

    public MessageService(InputStrategy in, OutputStrategy out) {
        this.in = in;
        this.out = out;
    }

      
    public void inputMessage() {
        input =  in.getInput();
    }
    public void outputMessage() {
        out.outputMessage(input);
    }
}
