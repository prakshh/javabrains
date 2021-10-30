package work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {

        //window : object JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        //create button and add jframe
        JButton button = new JButton("Click me...!!");

        //implementing ActionListener interface using anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button click");
                JOptionPane.showMessageDialog(null, "Hey Button Click");
            }
        });

        //implementing ActionListener interface using Lambda
        button.addActionListener((ActionEvent e) -> {
                System.out.println("Button click");
                JOptionPane.showMessageDialog(null, "Hey Button Click using Lambda 1");
            }
        );

        // shortening Lambda
        button.addActionListener(e -> {
                    System.out.println("Button click");
                    JOptionPane.showMessageDialog(null, "Hey Button Click using Lambda 2");
                }
        );

        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
A window appears, saying Click me...!!
when clicked, three windows will appear one by one as in below order-
Hey Button Click using Lambda 2
Hey Button Click using Lambda 1
Hey Button Click

in main method, execution takes place from below
 */