package _4pr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    int score1 = 0;
    int score2 = 0;
    JPanel[] jPanel = new JPanel[4];
    JButton jButton1 = new JButton("AC Milan");
    JButton jButton2 = new JButton("Real Madrid");
    JLabel jLabel1 = new JLabel("Result 0 X 0");
    JLabel jLabel2 = new JLabel("Last Scorer");
    JLabel jLabel3 = new JLabel("Winner: Draw");
    public void CheckScores(){
        if (score1==score2){
            jLabel3.setText("Winner: Draw");
        }
        if (score1>score2){
            jLabel3.setText("Winner: AC Milan");
        }
        if (score1<score2){
            jLabel3.setText("Winner: Real Madrid");
        }
    }
    Main(){
        super("_4pr");
        setSize(500,250);
        setLayout(new GridLayout(2,2));
        for (int i =0; i<jPanel.length; i++){
            jPanel[i]=new JPanel();
            add(jPanel[i]);
        }

        jPanel[0].add(jLabel1);
        jPanel[0].add(jLabel2);
        jPanel[1].add(jLabel3);
        jPanel[2].add(jButton1);
        jPanel[3].add(jButton2);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1++;
                CheckScores();
                jLabel1.setText("Result "+score1+" X "+score2);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score2++;
                CheckScores();
                jLabel1.setText("Result "+score1+" X "+score2);
            }
        });
    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}