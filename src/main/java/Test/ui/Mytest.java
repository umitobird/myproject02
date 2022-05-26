package Test.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mytest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("HA");
//            }
//        });
        MyActionListener listener = new MyActionListener();
        button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Testing"));
        frame.add(button);

        frame.setVisible(true);
        System.out.println("END?");
    }
}
