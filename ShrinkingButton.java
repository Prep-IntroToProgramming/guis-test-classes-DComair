import javax.swing.*;
import java.awt.event.*;

public class ShrinkingButton implements ActionListener{ 
    JFrame frame;
    JButton button;
    int clicks = 0;
    int dimensions[] = {1000, 800};

    public ShrinkingButton() {
        button = new JButton("click me");
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);

        //Waits to see what the user does, makes an action event when it happens
        button.addActionListener(this);
        frame.setSize(1000, 800);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {        
        dimensions[0] = frame.getWidth();
        dimensions[1] = frame.getHeight();
        dimensions[0] = dimensions[0]/2;
        dimensions[1] = dimensions[1]/2;
        frame.setSize(dimensions[0], dimensions[1]);
    }

    public static void main(String[] args) {
        ShrinkingButton gui = new ShrinkingButton();
    }
} 
