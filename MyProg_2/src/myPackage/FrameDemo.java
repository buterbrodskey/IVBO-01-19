package myPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameDemo extends JFrame {
    static private int MADRID_COUNT = 0;
    static private int REAL_COUNT = 0;

    FrameDemo() {
        setLocationRelativeTo(null);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gl = new GridLayout(1,3);
        GridLayout gl2 = new GridLayout(3,1);

        JPanel panel = new JPanel();
        panel.setLayout(gl);

        JPanel panel2 = new JPanel();
        panel2.setLayout(gl2);

        JLabel labelScore = new JLabel();
        labelScoreF5(labelScore);

        JLabel labelLastScorer = new JLabel();
        labelLastScorer.setText("Last scorer: ");

        JLabel labelWinner = new JLabel();
        labelWinner.setText("Winner: DRAW");

        JButton bMadrid = new JButton("Madrid"); // Кнопка и все последствия ее нажатия
        bMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MADRID_COUNT++;
                labelScoreF5(labelScore);
                labelLastScorer.setText("Last scorer: " + bMadrid.getText());
                labelWinnerF5(labelWinner);
            }

        });
//________________________________________________________________________________________________________

        JButton bReal = new JButton("Real"); // Кнопка и все последствия ее нажатия
        bReal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                REAL_COUNT++;
                labelScoreF5(labelScore);
                labelLastScorer.setText("Last scorer: " + bReal.getText());
                labelWinnerF5(labelWinner);
            }
        });
//________________________________________________________________________________________________________
        panel.add(bMadrid);
        panel.add(bReal);
        panel2.add(labelScore);
        panel2.add(labelLastScorer);
        panel2.add(labelWinner);
        getContentPane().add(panel);
        panel.add(panel2);
        setVisible(true);
    }
    void labelScoreF5(JLabel labelScore) {

        labelScore.setText("Result: " + MADRID_COUNT + " X " + REAL_COUNT);
    }


    void labelWinnerF5(JLabel labelWinner) {
        if (MADRID_COUNT == REAL_COUNT) {
            labelWinner.setText("Winner: DRAW");
        }
        else if (MADRID_COUNT > REAL_COUNT) {
            labelWinner.setText("Winner: Madrid");
        }
        else labelWinner.setText("Winner: Real");
    }
}