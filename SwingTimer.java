import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingTimer{ 
    JLabel label;
    int time = 0;
    public SwingTimer() {
        //Creates the JFrame object
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        label = new JLabel("0");

        //Allows the program to be exitted
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(label);
        frame.add(panel);
        //Sets the size
        frame.setSize(300, 300);
        
        Timer myTimer = new Timer(1000, new TimerListener());
        myTimer.start();
        
       
        //Allows the user to see the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingTimer gui = new SwingTimer();
    }
    
    class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            time++;
            label.setText("" + time);
        }
    }
} 
