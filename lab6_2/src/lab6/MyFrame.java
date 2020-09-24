package lab6;

import javax.swing.*;
import javax.swing.event.MenuDragMouseListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    MyFrame() {
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setName("Смена шрифта и цвета текста в JTextField");

        Font font1 = new Font("Times new roman",Font.ITALIC,20);
        Font font2 = new Font("Courier new",Font.ITALIC,20);
        Font font3 = new Font("MS Sans Serif",Font.ITALIC,20);

        JMenuBar menu = new JMenuBar();
        JMenu menuFont = new JMenu("Fonts");
        JMenu menuColorText = new JMenu("Text Color");

        menu.add(menuFont);
        menu.add(menuColorText);


        JTextField textField = new JTextField();
        textField.setText("Это мой двойной в небеса кувырок");
        textField.setFont(font1);


        JMenuItem fontItem1 = new JMenuItem(font1.getName());
        JMenuItem fontItem2 = new JMenuItem(font2.getName());
        JMenuItem fontItem3 = new JMenuItem(font3.getName());

        JMenuItem colorItem1 = new JMenuItem("Black");
        JMenuItem colorItem2 = new JMenuItem("Blue");
        JMenuItem colorItem3 = new JMenuItem("Red");


        ActionListener actionListenerFont1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setFont(font1);
            }
        };
        fontItem1.addActionListener(actionListenerFont1);


        ActionListener actionListenerFont2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setFont(font2);
            }
        };
        fontItem2.addActionListener(actionListenerFont2);


        ActionListener actionListenerFont3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setFont(font3);
            }
        };
        fontItem3.addActionListener(actionListenerFont3);



        ActionListener actionListenerColor1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.BLACK);
            }
        };
        colorItem1.addActionListener(actionListenerColor1);

        ActionListener actionListenerColor2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.BLUE);
            }
        };
        colorItem2.addActionListener(actionListenerColor2);

        ActionListener actionListenerColor3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.RED);
            }
        };
        colorItem3.addActionListener(actionListenerColor3);


        menuFont.add(fontItem1);
        menuFont.add(fontItem2);
        menuFont.add(fontItem3);

        menuColorText.add(colorItem1);
        menuColorText.add(colorItem2);
        menuColorText.add(colorItem3);

        setJMenuBar(menu);



        getContentPane().add(textField);

        setVisible(true);
    }
}