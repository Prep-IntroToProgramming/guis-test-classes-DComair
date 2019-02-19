import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestPaintButton {
    JFrame frame;

    TestPaintButton(){
        frame = new JFrame();
        PaintedButton pb = new PaintedButton();
        frame.add(pb);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        TestPaintButton t1 = new TestPaintButton();
    }
}
