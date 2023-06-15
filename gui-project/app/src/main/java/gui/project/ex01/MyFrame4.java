package gui.project.ex01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {

    public MyFrame4() {
        setTitle("FlowLayoutTest");
        setSize(300, 150);
        setLayout(new FlowLayout());

        add(new JButton("버튼1"));
        add(new JButton("버튼2"));
        add(new JButton("버튼3"));
        add(new JButton("버튼4"));
        add(new JButton("버튼5"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        MyFrame4 s = new MyFrame4();
    }

}
