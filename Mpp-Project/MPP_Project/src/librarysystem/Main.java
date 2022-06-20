package librarysystem;

import java.awt.*;
import javax.swing.*;

import librarysystem.LibrarySystem;

public class Main {
	//from startup code
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            LibrarySystem.INSTANCE.setTitle("Hamro Library");
            LibrarySystem.INSTANCE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            LibrarySystem.INSTANCE.init();
            centerFrameOnDesktop(LibrarySystem.INSTANCE);
            LibrarySystem.INSTANCE.setVisible(true);
        });
    }

    //from startup code
    public static void centerFrameOnDesktop(Component f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
    }
    
}
