//wej_66
package Match_Game;

import Facade_Pattern.Facade;
import Memento_Pattern.Caretaker;
import Memento_Pattern.Originator;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//main wej

/**
 *
 * @author reprise
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainMenuForm MainMenu0 =  MainMenuForm.getInstance();
        MainMenu0.call();
        MainMenu0.setVisible(true);
        
    }
}

