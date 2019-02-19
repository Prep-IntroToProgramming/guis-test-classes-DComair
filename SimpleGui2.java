import javax.swing.*;
import java.awt.*;

public class SimpleGui2{ 
    public SimpleGui2() {
        JFrame frame = new JFrame();
        ImagePanel panel = new ImagePanel();
        int x = panel.icon.getIconWidth();
        int y = panel.icon.getIconHeight();
        
 
        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        //frame.add(panel2);
        //frame.add(label);
        frame.setSize(x, y+20);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
    }
} 
