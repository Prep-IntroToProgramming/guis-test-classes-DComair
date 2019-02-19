import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestRandPanel {
    JFrame frame;

    TestRandPanel(){
        frame = new JFrame();
        RandomPanel rp = new RandomPanel();
        frame.add(rp);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        TestRandPanel t1 = new TestRandPanel();
    }
}
