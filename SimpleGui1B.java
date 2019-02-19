import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{ 
    JFrame frame;
    JButton button;
    JPanel panel;
    JLabel label;
    int clicks = 0;

    public SimpleGui1B() {
        button = new JButton("click me");
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(button);
        panel.add(label);
        
        frame.add(panel);

        //Waits to see what the user does, makes an action event when it happens
        button.addActionListener(this);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        clicks ++;
        button.setText("I've been clicked " + clicks + " times.");
        if (clicks == 100){
            label.setText("... Really? 100?");
        }
        else if (clicks == 101){
            label.setText("Swing is pretty cool");
        }
        else if (clicks == 200){
            label.setText("I think you have a problem");
        }
    }

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
    }
} 
