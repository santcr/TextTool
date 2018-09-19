package UI;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Start {

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {}
        
        new Window().setVisible(true);
        

    }
    
}
