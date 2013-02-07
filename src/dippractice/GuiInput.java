
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author mgrinker
 */
public class GuiInput implements InputStrategy{
    @Override
     public String getInput(){
        
         return JOptionPane.showInputDialog("Enter some text: ", "");
    }
}
