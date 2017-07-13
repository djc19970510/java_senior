package chapter22;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dingjiacheng on 2017/7/12.
 */
public class homework22_6 {
    public static void main(String[] args){
        Frame f=new Frame("my awt");
        JLabel l = new JLabel("Enter a number:");
        JTextField jf = new JTextField(10);
        JTextArea numberjl = new JTextArea("123",3,3);
        numberjl.setSize(400, 300);
        numberjl.setLocation(400, 200);
        numberjl.setVisible(true);
        numberjl.setBounds(100,100,100,100);
        Button sort=new Button("sort");
        Button shuffle=new Button("shuffle");
        Button Reverse=new Button("Reverse");
        f.setSize(600,400);
        f.setLocation(300,200);
        f.add(l);//JLabel
        f.add(jf);//JTextField
        f.add(numberjl);
        f.add(sort);//Button
        f.add(shuffle);//Button
        f.add(Reverse);//Button
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        System.out.println("Hello world!");
    }
}
