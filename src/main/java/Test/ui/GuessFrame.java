package Test.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class GuessFrame extends JFrame {
    //Fields屬性
    JButton button = new JButton("GUESS");
    JLabel label = new JLabel("Please Enter 1~100");
    JTextField number = new JTextField(5);
    Random random = new Random();
    int secret =random.nextInt(100)+1;
    //Constructors建構子
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        System.out.println("Secret:"+secret);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
//                System.out.println(num);
                if (num > secret){
                    label.setText("Smaller");
                }else if(num < secret) {
                    label.setText("Bigger");
                }else {
                    label.setText("Bingo,the number is " + secret);
                    System.out.println("END");
                }
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }
    // Methods方法
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,400);
//        guessFrame.setVisible(true);
    }
}
