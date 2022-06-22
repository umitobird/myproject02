package Test.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calendar extends JFrame {
    JButton button1 = new JButton("<<");
    JButton button2 = new JButton("<");
    JLabel Year = new JLabel("2022年 6月");
    JButton button3 = new JButton(">");
    JButton button4 = new JButton(">>");
    JPanel week = new JPanel(new GridLayout(1,7));//網格布局
    JLabel weeks[] = new JLabel[7];
    JPanel date = new JPanel(new GridLayout(5,7));
    JLabel dates[] = new JLabel[35];
    JPanel date5 = new JPanel(new GridLayout(5,7));
    JLabel dates5[] = new JLabel[35];
    Color color = new Color(211,211,211);
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
    }
    public Calendar(){
        super();
        setSize(400,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        //列出星期幾
        weeks[0] = new JLabel("Sun",JLabel.CENTER);
        weeks[1] = new JLabel("Mon",JLabel.CENTER);
        weeks[2] = new JLabel("Tue",JLabel.CENTER);
        weeks[3] = new JLabel("Wed",JLabel.CENTER);
        weeks[4] = new JLabel("Thu",JLabel.CENTER);
        weeks[5] = new JLabel("Fri",JLabel.CENTER);
        weeks[6] = new JLabel("Sat",JLabel.CENTER);
        for(int i=0; i<7; i++) {
            weeks[i].setPreferredSize(new Dimension(50,50));
            weeks[i].setBorder(BorderFactory.createLineBorder(Color.gray));//邊框樣式
            weeks[i].setOpaque(true);//背景預設透明，因此要設定為不透明才能調整背景色
            weeks[i].setBackground(color);
            week.add(weeks[i]);
        }
        //列出上個月末日期
        for(int i=0;i<3;i++) {
            String num = ""+(i+29);
            dates[i] = new JLabel(num,JLabel.CENTER);
            dates[i].setPreferredSize(new Dimension(50,50));
            dates[i].setForeground(color);//文字顏色
            date.add(dates[i]);
        }
        //列出這個月日期
        for(int i=0;i<30;i++) {
            String num = ""+(i+1);
            dates[i] = new JLabel(num,JLabel.CENTER);
            dates[i].setPreferredSize(new Dimension(50,50));
            dates[i].setBorder(BorderFactory.createEtchedBorder());
            date.add(dates[i]);
        }
        //列出下個月初日期
        for(int i=0;i<2;i++) {
            String num = ""+(i+1);
            dates[i] = new JLabel(num,JLabel.CENTER);
            dates[i].setPreferredSize(new Dimension(50,50));
            dates[i].setForeground(color);
            date.add(dates[i]);
        }
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Year.setText("只能按一次(´;ω;`)");
                remove(date);
                for(int i=0;i<31;i++) {
                    String num = ""+(i+1);
                    dates5[i] = new JLabel(num,JLabel.CENTER);
                    dates5[i].setPreferredSize(new Dimension(50,50));
                    dates5[i].setBorder(BorderFactory.createEtchedBorder());
                    date5.add(dates5[i]);
                }
                for(int i=0;i<4;i++) {
                    String num = ""+(i+1);
                    dates5[i] = new JLabel(num,JLabel.CENTER);
                    dates5[i].setPreferredSize(new Dimension(50,50));
                    dates5[i].setForeground(color);
                    date5.add(dates5[i]);
                }
                add(date5);
                //重新生成
                revalidate();
                repaint();
            }
        });
        button1.setContentAreaFilled(false);//移除背景
        button3.setContentAreaFilled(false);
        button4.setContentAreaFilled(false);
        add(button1);
        add(button2);
        add(Year);
        add(button3);
        add(button4);
        add(week);
        add(date);
        setVisible(true);
    }
}