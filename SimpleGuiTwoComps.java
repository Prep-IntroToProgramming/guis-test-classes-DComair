import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGuiTwoComps implements ActionListener {
    JFrame frame;
    JButton button;
    RandomPanel rp;
    boolean changing = false;

    SimpleGuiTwoComps(){
        frame = new JFrame();
        rp = new RandomPanel();
        frame.add(rp);
        button = new JButton("Change color?");

        frame.add(BorderLayout.NORTH, button);
        button.addActionListener(this);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        SimpleGuiTwoComps s1 = new SimpleGuiTwoComps();
    }

    public void actionPerformed(ActionEvent event) {
        changing = !changing;
        while (changing){
            rp.repaint();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException exc){
            }
        }
    }
}

