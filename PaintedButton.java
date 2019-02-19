import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintedButton extends JButton {
    @Override
    public void paintComponent(Graphics g){

        for (int i = 0; i <= 255; i++){
            g.setColor(new Color(255-i,i,i));
            g.fillRect(20 + i, 20, 1, 50);
        }

    }
}
