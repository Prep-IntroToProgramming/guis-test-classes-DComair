import javax.swing.*;

public class SimpleGui1{ 
    public SimpleGui1() {
        //Creates the JFrame object
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        
        //Makes a button and sets it's text
        JButton button = new JButton("click me");
        JLabel label = new JLabel("Swing is pretty cool");

        //Allows the program to be exitted
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Adds the button onto the JFrame
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        //Sets the size
        frame.setSize(200, 200);
        //Allows the user to see the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
    }
} 
