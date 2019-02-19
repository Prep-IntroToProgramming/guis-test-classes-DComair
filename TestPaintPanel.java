import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestPaintPanel {
    JFrame frame;

    TestPaintPanel(){
        frame = new JFrame();
        PaintedPanel pp = new PaintedPanel();
        frame.add(pp);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        TestPaintPanel t1 = new TestPaintPanel();
    }
}
