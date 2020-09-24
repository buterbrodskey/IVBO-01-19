package AnimationApp;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() throws InterruptedException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(196,201);
        JLabel label = new JLabel();

        Icon[] icons = new Icon[12];

        for (int i = 0; i < 12; i++) {
            icons[i] = new ImageIcon("C:\\Users\\student\\IdeaProjects\\RunImg\\runImage"+ (i+1) +".jpg");
        }

        add(label);

        setVisible(true);
        int j = 0;
        while (true) {
            label.setIcon(icons[j]);
            j++;
            if (j == 12) j = 0;
            Thread.sleep(100);
        }
    }
}