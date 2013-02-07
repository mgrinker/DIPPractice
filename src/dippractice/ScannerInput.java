
package dippractice;
import java.util.Scanner;
/**
 *
 * @author mgrinker
 */
public class ScannerInput implements InputStrategy {
    
    private String input;
    
    //Object for input
    Scanner keyboard = new Scanner(System.in);
    
    @Override
    public String getInput(){
        System.out.println("Please enter some text: ");
        return input = keyboard.nextLine(); 
    }
}
