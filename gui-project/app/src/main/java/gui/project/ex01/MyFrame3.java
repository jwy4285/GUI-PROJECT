package gui.project.ex01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame {
    public MyFrame3() {
        JPanel pane1 = new JPanel();
        pane1.setBackground(Color.orange);

        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button 2");
        b1.setBackground(Color.green);

        pane1.add(b1);
        pane1.add(b2);
        add(pane1);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame3 a = new MyFrame3();
    }
}
