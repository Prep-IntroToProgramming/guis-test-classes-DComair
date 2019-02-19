import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PaintedPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        /*
        g.setColor(Color.blue);
        g.fillRect(20,50,100,100);
        g.setColor(Color.red);
        g.fillRect(30,60,80,80);
        */
        
        for (int i = 0; i <= 255; i++){
            g.setColor(new Color(255-i,i,122));
            g.fillRect(20 + i, 20, 1, 50);
        }
    }
}
