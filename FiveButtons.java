import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FiveButtons implements ActionListener{ 
    JFrame frame;

    JButton center;
    JButton west;

    int clicks = 0;
    int dimensions[] = {300, 300};

    public FiveButtons() {
        center = new JButton("Center");
        west = new JButton("West");
        JButton east = new JButton("East");
        JButton north = new JButton("North");
        JButton south = new JButton("South");

        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(BorderLayout.CENTER, center);
        frame.add(BorderLayout.NORTH, north);
        frame.add(BorderLayout.SOUTH, south);
        frame.add(BorderLayout.WEST, west);
        frame.add(BorderLayout.EAST, east);

        center.addActionListener(this);
        west.addActionListener(this);
        east.addActionListener(this);
        north.addActionListener(this);
        south.addActionListener(this);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {  

        if (event.getSource().equals(center)){
            System.out.println("You clicked center");
            center.setText("Middle");
        }
        else if (event.getSource().equals(west)){
            System.out.println("You clicked west");
            west.setText("Left");
        }
        else {
            System.out.println("You didn't click center");
        }        
    }

    public static void main(String[] args) {
        FiveButtons gui = new FiveButtons();
    }
} 
