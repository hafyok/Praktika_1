package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Board extends JFrame{
    int rm = 0;
    int ac = 0;
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonMadrid = new JButton("JJJJ");
    JLabel results = new JLabel("Results: " + rm + " X " + ac);
    JLabel scorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    public Board(){
        super("Begin");
        setLayout(new GridLayout(2, 3));
        JPanel[] pnl = new JPanel[6];
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[5].add(buttonMilan);//Кнопка клуба AC Milan
        pnl[3].add(buttonMadrid);//Кнопка клуба Real Madrid
        pnl[1].add(results, BorderLayout.NORTH);//результаты наверху
        pnl[2].add(scorer, BorderLayout.NORTH);//игрок
        pnl[0].add(winner, BorderLayout.NORTH);//победитель

        ActionListener actionListener = new ButtonActionListener();
        ActionListener actionListener1 = new ButtonActionListener_2();

        buttonMadrid.addActionListener(actionListener);//задаём кнопкам действия при нажатии
        buttonMilan.addActionListener(actionListener1);

        setSize(500, 400);//устанавливаем размер

    }
    //класс действий кнопки Real Madrid
    public class ButtonActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            rm++;
            results.setText("Results: " + (rm) + " X " + (ac));
            if(ac > rm){
                winner.setText("Winner: AC Milan");
            }else if(ac < rm){
                winner.setText("Winner: Real Madrid");
            }else{
                winner.setText("Winner: DRAW");
            }
            scorer.setText("Last Scorer: Real Madrid");

        }
    }
    //класс действий кнопки AC Milan
    public class ButtonActionListener_2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            ac++;
            results.setText("Results: " + (rm) + " X " + (ac));
            if(ac > rm){
                winner.setText("Winner: AC Milan");
            }else if(ac < rm){
                winner.setText("Winner: Real Madrid");
            }else{
                winner.setText("Winner: DRAW");
            }
            scorer.setText("Last Scorer: AC Milan");
        }
    }
    public static void main(String[]args){
        new Board().setVisible(true);
    }
}
