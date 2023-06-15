package gui.project.ex01;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame {
    public MyFrame6() {
        setTitle("GridLayoutTest");
        setSize(300, 150);
        setLayout(new GridLayout(2, 3));

        add(new Button("Button1"));
        add(new Button("Button2"));
        add(new Button("Button3"));
        add(new Button("버튼4"));
        add(new Button("Long Button5"));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new MyFrame6();
    }

}
