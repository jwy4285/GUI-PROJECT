package gui.project.ex01;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame7 extends JFrame {
    JButton 버튼1, 버튼2, 버튼3;
    Container cPane;
    CardLayout layoutm;

    public MyFrame7() {
        setTitle("BoarderLayoutTest");
        setSize(300, 150);
        cPane = getContentPane();
        layoutm = new CardLayout();
        setLayout(layoutm);

        JButton 버튼1 = new JButton("Card #1");
        JButton 버튼2 = new JButton("Card #2");
        JButton 버튼3 = new JButton("Card #3");

        add(버튼1);
        add(버튼2);
        add(버튼3);
        버튼1.addActionListener(e -> layoutm.next(cPane));
        버튼2.addActionListener(e -> layoutm.next(cPane));
        버튼3.addActionListener(e -> layoutm.next(cPane));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MyFrame7();
    }

}
