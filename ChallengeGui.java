import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ChallengeGui { 
    JFrame frame;

    JButton left;
    JButton right;
    JButton up;
    JButton down;
    JButton funky;

    JLabel combo;

    String name = "Hot Dog";
    int dimensions[] = {300, 300};

    int leftSide = 0;
    int rightSide = 0;
    String[] leftNames = {"Hot", "French", "Up", "Side to", "Cotton"};
    String[] rightNames = {"Dog", "Fries", "Down", "Side", "Eye", "Candy"};

    public ChallengeGui() {
        right = new JButton("Right");
        left = new JButton("Left");

        combo = new JLabel(name);

        frame = new JFrame();

        frame.add(BorderLayout.WEST, left);
        frame.add(BorderLayout.EAST, right);
        frame.add(BorderLayout.CENTER, combo);
        /*
        frame.add(BorderLayout.NORTH, up);
        frame.add(BorderLayout.SOUTH, down);
        frame.add(BorderLayout.CENTER, funky);
         */

        left.addActionListener(new Button1Listener());
        right.addActionListener(new Button2Listener());

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ChallengeGui gui = new ChallengeGui();
    }

    class Button1Listener implements ActionListener{
        public void actionPerformed(ActionEvent event) {  
            leftSide++;
            if (leftSide > leftNames.length - 1){
                leftSide = 0;
            }
            name = leftNames[leftSide] + " " + rightNames[rightSide];
            combo.setText(name);
        }
    }

    class Button2Listener implements ActionListener{
        public void actionPerformed(ActionEvent event) {  
            rightSide++;
            if (rightSide > rightNames.length - 1){
                rightSide = 0;
            }
            name = leftNames[leftSide] + " " + rightNames[rightSide];
            combo.setText(name);
        }
    }
} 
