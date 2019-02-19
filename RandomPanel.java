import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.setColor(randColor());
        g.fillOval(70, 70, 120, 120);

        //Color eyes = randColor();
        g.setColor(randColor());
        g.fillOval(90, 100, 20, 20);
        g.setColor(randColor());
        g.fillOval(150, 100, 20, 20);

        g.setColor(randColor());
        g.drawLine(120, 150, 90, 130);
        g.drawLine(120, 150, 135, 130);
        g.drawLine(135, 130, 150, 150);
        g.drawLine(150, 150, 180, 130);
    }

    Color randColor(){
        int red = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);

        Color randomColor = new Color(red, green, blue);
        return randomColor;
    }
}
