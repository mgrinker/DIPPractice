
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author mgrinker
 */
public class GUIOutputStrategy implements OutputStrategy {
    
    @Override
    public void outputMessage(String msg) {
        JOptionPane.showMessageDialog(null, "You enterd - " + msg);
    }
}
