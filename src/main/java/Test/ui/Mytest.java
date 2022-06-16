package Test.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Mytest extends JFrame {
    JButton button = new JButton("GUESS");
    JButton button1 = new JButton("CLEAR");
    JButton answer = new JButton("ANSWER");
    JLabel label = new JLabel("Please Enter 1~1000");
    JLabel labela = new JLabel();
    JTextField number = new JTextField(5);
    Random random = new Random();
    int secret =random.nextInt(1000)+1;
    public static void main(String[] args) {
        Mytest Mytest = new Mytest();
    }
    public Mytest(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        System.out.println("Secret:"+secret);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
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
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number.setText("");
            }
        });
        answer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labela.setText("The number is " + secret);
            }
        });
        setLayout(new FlowLayout());
        add(label);
        add(number);
        add(button);
        add(button1);
        add(answer);
        add(labela);
        setVisible(true);
    }
}
