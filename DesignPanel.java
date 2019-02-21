import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DesignPanel {
    JFrame frame;
    Painter myPainter = new Painter();
    int speed = 3;
    int size = 120;
    Color ballColor = Color.green;

    DesignPanel(){
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.CENTER, myPainter);
        frame.setSize(500, 500);
        frame.setVisible(true);

        boolean xDir = true;
        boolean yDir = true;
        
        
        while(true) {
            if (myPainter.x >= frame.getWidth() - size){
                xDir = false;
            }
            else if (myPainter.x <= 0){
                xDir = true;
            }
            if (myPainter.y >= myPainter.getHeight() - size){
                yDir = false;
            }
            else if (myPainter.y <= 0){
                yDir = true;
            }

            if (xDir){
                myPainter.x+= speed;
            }
            else {
                myPainter.x-= speed;
            }
            if (yDir){
                myPainter.y+= speed;
            }
            else {
                myPainter.y-= speed;
            }
            myPainter.repaint();
            try {
                Thread.sleep(17);
            }
            catch (InterruptedException exc){               
            }
        }
    }

    public static void main(String[] args){
        DesignPanel sgt = new DesignPanel();
    }
    
    
    
    class Painter extends JPanel {
        int x = 1;
        int y = 1;
        @Override
        public void paintComponent(Graphics g){
            g.setColor(Color.black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(ballColor);
            g.fillOval(x, y, size, size);
        }
    }
}
