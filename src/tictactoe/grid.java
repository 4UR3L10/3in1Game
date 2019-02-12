/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JOptionPane;

/**
 *
 * @author aurel
 */
public class grid extends javax.swing.JFrame {

    /**
     * Creates new form grid
     */
    public grid() {
        initComponents();        
    }
    
    public void checkingForVictory(){
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        // 1st Horizontal
        if (b1 == b2 && b2 == b3 && b1 == b3 && b1 != "" && b2 != "" && b3 != "") {
            JOptionPane.showMessageDialog(null, "Player " + b1 + " Wins!!!");
            if (b1 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
            clear();
        }
        
        // 2nd Horizontal
        else if(b4 == b5 && b5 == b6 && b4 == b6 && b4 != "" && b5 != "" && b6 != ""){
         JOptionPane.showMessageDialog(null, "Player " + b4 + " Wins!!!");
         if (b4 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
         clear();
        }
        
        // 3rd Horizontal
        else if(b7 == b8 && b8 == b9 && b7 == b9 && b7 != "" && b8 != "" && b8 != ""){
         JOptionPane.showMessageDialog(null, "Player " + b7 + " Wins!!!"); 
         if (b7 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
         clear();
        }
        
        // 1st Vertical
        else if(b1 == b4 && b4 == b7 && b1 == b7 && b1 != "" && b4 != "" && b7 != ""){
         JOptionPane.showMessageDialog(null, "Player " + b1 + " Wins!!!");
         if (b4 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
         clear();
        }
        
        // 2nd Vertical
        else if(b2 == b5 && b5 == b8 && b2 == b8 && b2 != "" && b5 != "" && b8 != ""){
         JOptionPane.showMessageDialog(null, "Player " + b2 + " Wins!!!");
         if (b2 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
         clear();
        }
        
        // 3rd Vertical
        else if(b3 == b6 && b6 == b9 && b3 == b9 && b3 != "" && b6 != "" && b9 != ""){
         JOptionPane.showMessageDialog(null, "Player " + b3 + " Wins!!!");
         if (b3 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
         clear();
        }
        
        // 1st Diagonal
        else if(b1 == b5 && b5 == b9 && b1 == b9 && b1 != "" && b5 != "" && b9 != ""){
         JOptionPane.showMessageDialog(null, "Player " + b1 + " Wins!!!");
         if (b1 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
         clear();
        }
        
        // 2nd Diagonal
        else if(b3 == b5 && b5 == b7 && b3 == b7 && b3 != "" && b5 != "" && b7 != ""){
         JOptionPane.showMessageDialog(null, "Player " + b3 + " Wins!!!");
         if (b3 == "X") {
                int counter = Integer.parseInt(jPlayerOneWinLabel.getText()) + 1;
                jPlayerOneWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerTwoLoseLabel.getText()) + 1;
                jPlayerTwoLoseLabel.setText(String.valueOf(counterTwo));
            } else {
                int counter = Integer.parseInt(jPlayerTwoWinLabel.getText()) + 1;
                jPlayerTwoWinLabel.setText(String.valueOf(counter)); 
                int counterTwo = Integer.parseInt(jPlayerOneLoseLabel.getText()) + 1;
                jPlayerOneLoseLabel.setText(String.valueOf(counterTwo));
            }
         clear();
        }
        
        // Draw
        else {
            int counter = 0;
            if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != "") {
                JOptionPane.showMessageDialog(null, "DRAW");
                counter = Integer.parseInt(jPlayerOneDrawLabel.getText()) + 1;
                jPlayerOneDrawLabel.setText(String.valueOf(counter));
                jPlayerTwoDrawLabel.setText(String.valueOf(counter));
                clear();
            }
        }                
    }
    
    public void clear(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);        
    }            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonPlayerOne = new javax.swing.JButton();
        jButtonPlayerTwo = new javax.swing.JButton();
        jPlayerOneReportPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPlayerOneWinLabel = new javax.swing.JLabel();
        jPlayerOneLoseLabel = new javax.swing.JLabel();
        jPlayerOneDrawLabel = new javax.swing.JLabel();
        jPlayerTwoReportPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPlayerTwoWinLabel = new javax.swing.JLabel();
        jPlayerTwoLoseLabel = new javax.swing.JLabel();
        jPlayerTwoDrawLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setResizable(false);

        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonPlayerOne.setText("Player 1 - X");

        jButtonPlayerTwo.setText("Player 2 - O");
        jButtonPlayerTwo.setEnabled(false);

        jPlayerOneReportPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 1"));

        jLabel1.setText("Win:");

        jLabel2.setText("Lose:");

        jLabel3.setText("Draw:");

        jPlayerOneWinLabel.setText("0");
        jPlayerOneWinLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPlayerOneLoseLabel.setText("0");
        jPlayerOneLoseLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPlayerOneDrawLabel.setText("0");
        jPlayerOneDrawLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPlayerOneReportPanelLayout = new javax.swing.GroupLayout(jPlayerOneReportPanel);
        jPlayerOneReportPanel.setLayout(jPlayerOneReportPanelLayout);
        jPlayerOneReportPanelLayout.setHorizontalGroup(
            jPlayerOneReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayerOneReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPlayerOneDrawLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(jPlayerOneReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPlayerOneWinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPlayerOneReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jPlayerOneLoseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPlayerOneReportPanelLayout.setVerticalGroup(
            jPlayerOneReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayerOneReportPanelLayout.createSequentialGroup()
                .addGroup(jPlayerOneReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPlayerOneReportPanelLayout.createSequentialGroup()
                        .addGroup(jPlayerOneReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPlayerOneWinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jPlayerOneLoseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPlayerOneReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPlayerOneDrawLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPlayerTwoReportPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 2"));

        jLabel4.setText("Win:");

        jLabel5.setText("Lose:");

        jLabel6.setText("Draw:");

        jPlayerTwoWinLabel.setText("0");
        jPlayerTwoWinLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPlayerTwoLoseLabel.setText("0");
        jPlayerTwoLoseLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPlayerTwoDrawLabel.setText("0");
        jPlayerTwoDrawLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPlayerTwoReportPanelLayout = new javax.swing.GroupLayout(jPlayerTwoReportPanel);
        jPlayerTwoReportPanel.setLayout(jPlayerTwoReportPanelLayout);
        jPlayerTwoReportPanelLayout.setHorizontalGroup(
            jPlayerTwoReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayerTwoReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPlayerTwoDrawLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(jPlayerTwoReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPlayerTwoWinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPlayerTwoReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(jPlayerTwoLoseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPlayerTwoReportPanelLayout.setVerticalGroup(
            jPlayerTwoReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlayerTwoReportPanelLayout.createSequentialGroup()
                .addGroup(jPlayerTwoReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPlayerTwoReportPanelLayout.createSequentialGroup()
                        .addGroup(jPlayerTwoReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPlayerTwoWinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jPlayerTwoLoseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPlayerTwoReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPlayerTwoDrawLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPlayerOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPlayerTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jPlayerOneReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPlayerTwoReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPlayerOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPlayerTwo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPlayerOneReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPlayerTwoReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPlayerOneReportPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton2.setEnabled(false);
            jButton2.setText("X");            
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true);
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton2.setEnabled(false);
            jButton2.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton1.setEnabled(false);
            jButton1.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true); 
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton1.setEnabled(false);
            jButton1.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton3.setEnabled(false);
            jButton3.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true);
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton3.setEnabled(false);
            jButton3.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton4.setEnabled(false);
            jButton4.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true); 
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton4.setEnabled(false);
            jButton4.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton5.setEnabled(false);
            jButton5.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true);
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton5.setEnabled(false);
            jButton5.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton6.setEnabled(false);
            jButton6.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true);
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton6.setEnabled(false);
            jButton6.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton7.setEnabled(false);
            jButton7.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true);
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton7.setEnabled(false);
            jButton7.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton8.setEnabled(false);
            jButton8.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true);
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton8.setEnabled(false);
            jButton8.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // If it is the turn of player 1.
        if (jButtonPlayerOne.isEnabled() == true) {
            jButton9.setEnabled(false);
            jButton9.setText("X");
            checkingForVictory();            
            jButtonPlayerOne.setEnabled(false);
            jButtonPlayerTwo.setEnabled(true);
            return;
        }
        
        // If it is the turn of player 2.
        if (jButtonPlayerTwo.isEnabled() == true) {
            jButton9.setEnabled(false);
            jButton9.setText("O");
            checkingForVictory();            
            jButtonPlayerTwo.setEnabled(false);
            jButtonPlayerOne.setEnabled(true);                    
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             // new grid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonPlayerOne;
    private javax.swing.JButton jButtonPlayerTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jPlayerOneDrawLabel;
    private javax.swing.JLabel jPlayerOneLoseLabel;
    private javax.swing.JPanel jPlayerOneReportPanel;
    private javax.swing.JLabel jPlayerOneWinLabel;
    private javax.swing.JLabel jPlayerTwoDrawLabel;
    private javax.swing.JLabel jPlayerTwoLoseLabel;
    private javax.swing.JPanel jPlayerTwoReportPanel;
    private javax.swing.JLabel jPlayerTwoWinLabel;
    // End of variables declaration//GEN-END:variables

    private String toString(int counter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
