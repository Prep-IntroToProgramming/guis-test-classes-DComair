import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGuiTrio {

    JFrame frame;
    JButton east;
    JButton west;

    Painter myPainter = new Painter();

    SimpleGuiTrio(){
        frame = new JFrame();
        east = new JButton("Foreground Color");
        west = new JButton("Background Color");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        east.addActionListener(new Button1Listener());
        west.addActionListener(new Button2Listener());

        frame.add(BorderLayout.WEST, west);
        frame.add(BorderLayout.EAST, east);

        frame.add(BorderLayout.CENTER, myPainter);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        SimpleGuiTrio sgt = new SimpleGuiTrio();
    }

    class Button1Listener implements ActionListener{
        public void actionPerformed(ActionEvent event) {  
            int red = (int) (Math.random()*255);
            int blue = (int) (Math.random()*255);
            int green = (int) (Math.random()*255);
            
            myPainter.setForeColor(new Color(red, blue, green));
            myPainter.repaint();
        }
    }

    class Button2Listener implements ActionListener{
        public void actionPerformed(ActionEvent event) {  
            int red = (int) (Math.random()*255);
            int blue = (int) (Math.random()*255);
            int green = (int) (Math.random()*255);
            
            myPainter.setBackColor(new Color(red, blue, green));
            myPainter.repaint();
        }
    }

    class Painter extends JPanel {
        Color foreColor = Color.white;
        Color backgColor = Color.black;

        void setForeColor(Color thisColor){
            foreColor = thisColor;
        }

        void setBackColor(Color thisColor){
            backgColor = thisColor;
        }

        @Override
        public void paintComponent(Graphics g){
            g.setColor(backgColor);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(foreColor);
            g.fillOval(70, 70, 120, 120);
        }
    }
}
