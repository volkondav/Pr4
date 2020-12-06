package ru.mirea.inbo0219;

import javax.swing.*;
import java.awt.*;

class Border extends JFrame{

        JPanel[] pnl = new JPanel[5];
        int milanScore = 0;
        int madridScore = 0;

    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JButton buttonEnd = new JButton("End of the game");

    JLabel textRes = new JLabel("Result: 0 X 0");
    JLabel textLast = new JLabel("Result: N/A");
    JLabel textWin = new JLabel("Result: N/A");

    void printResult(){
        textRes.setText("Result "+milanScore+" X "+ madridScore);
    }

    void whoWin(){
        if (milanScore > madridScore) textWin.setText("Winner: AC Milan");
        else textWin.setText("Winner: Real Madrid");
    }

        public Border(){
            super("Score");
            setLayout(new GridLayout(5,1));

            for (int i = 0; i < pnl.length; i++) {
                pnl[i] = new JPanel();
                add(pnl[i]);
            }

            pnl[0].setLayout(new BorderLayout());
            pnl[0].add(button1, BorderLayout.WEST);
            pnl[0].add(button2, BorderLayout.EAST);
            pnl[1].add((textRes));
            pnl[2].add((textLast));
            pnl[3].add(buttonEnd);
            pnl[4].add((textWin));

            //pnl[1].add(new JLabel("One"));

            button1.addActionListener(ae -> {
                milanScore++;
                textLast.setText("Last Scorer: AC Milan");

                printResult();
            });

            button2.addActionListener(actionEvent ->{
                madridScore++;
                textLast.setText("Last Scorer: Madrid");

                printResult();
            });

            buttonEnd.addActionListener(ae ->{
                whoWin();
            });

            setSize(500,500);
        }
}
