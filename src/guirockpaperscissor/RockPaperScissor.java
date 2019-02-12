/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guirockpaperscissor;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aurel
 */
public class RockPaperScissor extends javax.swing.JFrame {
    Random rand = new Random();
    int pcChoice = 0;
    int humanChoice = 0;
    int winCounter = 0;
    int loseCounter = 0;
    int drawCounter = 0;
    int roundCounter = 0;
    /**
     * Creates new form RockPaperScissor
     */
    public RockPaperScissor() {
        initComponents();
    }
    
    int computerEasyChoice() {
        return rand.nextInt(2) + 1;       
    }
    
    int computerNormalChoice() {
        return rand.nextInt(3) + 1;       
    }    
    
    
    void pcChoice(){
        if (pcChoice == 1) {
            jComputerChoiceLabel.setIcon(new ImageIcon("src/guirockpaperscissor/RRock.jpg"));
        }
        if (pcChoice == 2) {
            jComputerChoiceLabel.setIcon(new ImageIcon("src/guirockpaperscissor/RPaper.jpg"));
        }
        if (pcChoice == 3) {
            jComputerChoiceLabel.setIcon(new ImageIcon("src/guirockpaperscissor/RScissor.jpg"));
        }
    }
    
    void report(){
        // 1 - Rock      2 - Paper      3 - Scissor
        if(humanChoice == 1 && pcChoice == 1){
            JOptionPane.showMessageDialog(null, "Draw!!!");
            drawCounter = Integer.parseInt(jDrawCounterReportLabel.getText()) + 1;
            jDrawCounterReportLabel.setText(Integer.toString(drawCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>Draw<br/>You are not at my level<br/>it's just luck for you</html>");
            
        }
        if(humanChoice == 1 && pcChoice == 2){
            JOptionPane.showMessageDialog(null, "You Lose!!!");  
            loseCounter = Integer.parseInt(jLoseCounterReportLabel.getText()) + 1;
            jLoseCounterReportLabel.setText(Integer.toString(loseCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>Dou yo know<br/>how to play right?<br/>You Lose!!!!!! hahahahah</html>");
        }
        if(humanChoice == 1 && pcChoice == 3){
            JOptionPane.showMessageDialog(null, "You Win!!!");
            winCounter = Integer.parseInt(jWinCounterReportLabel.getText()) + 1;
            jWinCounterReportLabel.setText(Integer.toString(winCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>This time<br/>I let you win<br/>so you can feel better hahahahah</html>");
        }
        if(humanChoice == 2 && pcChoice == 1){
            JOptionPane.showMessageDialog(null, "You Win!!!");
            winCounter = Integer.parseInt(jWinCounterReportLabel.getText()) + 1;
            jWinCounterReportLabel.setText(Integer.toString(winCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>This time<br/>I let you win<br/>so you can feel better hahahahah</html>");
        }
        if(humanChoice == 2 && pcChoice == 2){
            JOptionPane.showMessageDialog(null, "Draw!!!");
            drawCounter = Integer.parseInt(jDrawCounterReportLabel.getText()) + 1;
            jDrawCounterReportLabel.setText(Integer.toString(drawCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>Draw<br/>You are not at my level<br/>it's just luck for you</html>");
        }
        if(humanChoice == 2 && pcChoice == 3){
            JOptionPane.showMessageDialog(null, "You Lose!!!");
            loseCounter = Integer.parseInt(jLoseCounterReportLabel.getText()) + 1;
            jLoseCounterReportLabel.setText(Integer.toString(loseCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>Dou yo know<br/>how to play right?<br/>You Lose!!!!!! hahahahah</html>");
        }
        if(humanChoice == 3 && pcChoice == 1){
            JOptionPane.showMessageDialog(null, "You Lose!!!");
            loseCounter = Integer.parseInt(jLoseCounterReportLabel.getText()) + 1;
            jLoseCounterReportLabel.setText(Integer.toString(loseCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>Dou yo know<br/>how to play right?<br/>You Lose!!!!!! hahahahah</html>");
        }
        if(humanChoice == 3 && pcChoice == 2){
            JOptionPane.showMessageDialog(null, "You Win!!!");
            winCounter = Integer.parseInt(jWinCounterReportLabel.getText()) + 1;
            jWinCounterReportLabel.setText(Integer.toString(winCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>This time<br/>I let you win<br/>so you can feel better hahahahah</html>");
        }
        if(humanChoice == 3 && pcChoice == 3){
            JOptionPane.showMessageDialog(null, "Draw!!!");
            drawCounter = Integer.parseInt(jDrawCounterReportLabel.getText()) + 1;
            jDrawCounterReportLabel.setText(Integer.toString(drawCounter));
            roundCounter = Integer.parseInt(jRoundCounterLabel.getText()) + 1;
            jRoundCounterLabel.setText(Integer.toString(roundCounter));
            jHumanChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerChoiceLabel.setIcon(new ImageIcon("none"));
            jComputerCommentLabel.setText("<html>Draw<br/>You are not at my level<br/>it's just luck for you</html>");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDifficultButtonGroup = new javax.swing.ButtonGroup();
        jMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jWinCounterLabel = new javax.swing.JLabel();
        jLoseCounterLabel = new javax.swing.JLabel();
        jDrawCounterLabel = new javax.swing.JLabel();
        jWinCounterReportLabel = new javax.swing.JLabel();
        jLoseCounterReportLabel = new javax.swing.JLabel();
        jDrawCounterReportLabel = new javax.swing.JLabel();
        jRoundLabel = new javax.swing.JLabel();
        jRoundCounterLabel = new javax.swing.JLabel();
        jComputerPanel = new javax.swing.JPanel();
        jComputerPictureLabel = new javax.swing.JLabel();
        jComputerCommentLabel = new javax.swing.JLabel();
        jComputerChoicePanel = new javax.swing.JPanel();
        jComputerChoiceLabel = new javax.swing.JLabel();
        jHumanPanel = new javax.swing.JPanel();
        jHumanChoicePanel = new javax.swing.JPanel();
        jHumanPaperButton = new javax.swing.JButton();
        jHumanRockButton = new javax.swing.JButton();
        jHumanScissorButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jHumanChoiceLabel = new javax.swing.JLabel();
        jDifficultPanel = new javax.swing.JPanel();
        jEasyRadioButton = new javax.swing.JRadioButton();
        jNormalRadioButton = new javax.swing.JRadioButton();
        jImpossibleRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rock Paper Scissor !!!");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Counter"));

        jWinCounterLabel.setText("Win");

        jLoseCounterLabel.setText("Lose");

        jDrawCounterLabel.setText("Draw");

        jWinCounterReportLabel.setText("0");
        jWinCounterReportLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLoseCounterReportLabel.setText("0");
        jLoseCounterReportLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jDrawCounterReportLabel.setText("0");
        jDrawCounterReportLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRoundLabel.setText("Round:");

        jRoundCounterLabel.setText("1");
        jRoundCounterLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jWinCounterReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLoseCounterReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jDrawCounterReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jWinCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRoundLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLoseCounterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jRoundCounterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDrawCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRoundLabel)
                    .addComponent(jRoundCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jWinCounterLabel)
                    .addComponent(jLoseCounterLabel)
                    .addComponent(jDrawCounterLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jWinCounterReportLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoseCounterReportLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDrawCounterReportLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jComputerPanel.setBackground(new java.awt.Color(255, 255, 255));
        jComputerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Computer"));

        jComputerPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirockpaperscissor/ComputerIcon.jpg"))); // NOI18N

        jComputerCommentLabel.setBackground(new java.awt.Color(255, 255, 255));
        jComputerCommentLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComputerChoicePanel.setBackground(new java.awt.Color(255, 255, 255));
        jComputerChoicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Computer Choice"));

        javax.swing.GroupLayout jComputerChoicePanelLayout = new javax.swing.GroupLayout(jComputerChoicePanel);
        jComputerChoicePanel.setLayout(jComputerChoicePanelLayout);
        jComputerChoicePanelLayout.setHorizontalGroup(
            jComputerChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jComputerChoicePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComputerChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jComputerChoicePanelLayout.setVerticalGroup(
            jComputerChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jComputerChoicePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jComputerChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jComputerPanelLayout = new javax.swing.GroupLayout(jComputerPanel);
        jComputerPanel.setLayout(jComputerPanelLayout);
        jComputerPanelLayout.setHorizontalGroup(
            jComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jComputerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComputerChoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jComputerPanelLayout.createSequentialGroup()
                        .addComponent(jComputerPictureLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComputerCommentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jComputerPanelLayout.setVerticalGroup(
            jComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jComputerPanelLayout.createSequentialGroup()
                .addGroup(jComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComputerPictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComputerCommentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(jComputerChoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jHumanPanel.setBackground(new java.awt.Color(255, 255, 255));
        jHumanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Human"));

        jHumanChoicePanel.setBackground(new java.awt.Color(255, 255, 255));
        jHumanChoicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Your Choice:"));

        jHumanPaperButton.setText("Paper");
        jHumanPaperButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jHumanPaperButton.setEnabled(false);
        jHumanPaperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHumanPaperButtonActionPerformed(evt);
            }
        });

        jHumanRockButton.setText("Rock");
        jHumanRockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jHumanRockButton.setEnabled(false);
        jHumanRockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHumanRockButtonActionPerformed(evt);
            }
        });

        jHumanScissorButton.setText("Scissor");
        jHumanScissorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jHumanScissorButton.setEnabled(false);
        jHumanScissorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHumanScissorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jHumanChoicePanelLayout = new javax.swing.GroupLayout(jHumanChoicePanel);
        jHumanChoicePanel.setLayout(jHumanChoicePanelLayout);
        jHumanChoicePanelLayout.setHorizontalGroup(
            jHumanChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHumanChoicePanelLayout.createSequentialGroup()
                .addComponent(jHumanRockButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jHumanPaperButton)
                .addGap(28, 28, 28)
                .addComponent(jHumanScissorButton))
        );
        jHumanChoicePanelLayout.setVerticalGroup(
            jHumanChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHumanChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jHumanRockButton)
                .addComponent(jHumanPaperButton)
                .addComponent(jHumanScissorButton))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Human Choice"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jHumanChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jHumanChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jHumanPanelLayout = new javax.swing.GroupLayout(jHumanPanel);
        jHumanPanel.setLayout(jHumanPanelLayout);
        jHumanPanelLayout.setHorizontalGroup(
            jHumanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHumanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jHumanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jHumanChoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jHumanPanelLayout.setVerticalGroup(
            jHumanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHumanPanelLayout.createSequentialGroup()
                .addComponent(jHumanChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDifficultPanel.setBackground(new java.awt.Color(255, 255, 255));
        jDifficultPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Select your difficult:"));

        jEasyRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        jDifficultButtonGroup.add(jEasyRadioButton);
        jEasyRadioButton.setText("Easy");
        jEasyRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEasyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEasyRadioButtonActionPerformed(evt);
            }
        });

        jNormalRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        jDifficultButtonGroup.add(jNormalRadioButton);
        jNormalRadioButton.setText("Normal");
        jNormalRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNormalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNormalRadioButtonActionPerformed(evt);
            }
        });

        jImpossibleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        jDifficultButtonGroup.add(jImpossibleRadioButton);
        jImpossibleRadioButton.setText("Impossible");
        jImpossibleRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jImpossibleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImpossibleRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDifficultPanelLayout = new javax.swing.GroupLayout(jDifficultPanel);
        jDifficultPanel.setLayout(jDifficultPanelLayout);
        jDifficultPanelLayout.setHorizontalGroup(
            jDifficultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDifficultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDifficultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEasyRadioButton)
                    .addComponent(jNormalRadioButton)
                    .addComponent(jImpossibleRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDifficultPanelLayout.setVerticalGroup(
            jDifficultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDifficultPanelLayout.createSequentialGroup()
                .addComponent(jEasyRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNormalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jImpossibleRadioButton))
        );

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addComponent(jHumanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDifficultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jComputerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComputerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jHumanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDifficultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHumanRockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHumanRockButtonActionPerformed
        jHumanChoiceLabel.setIcon(new ImageIcon("src/guirockpaperscissor/HRock.jpg"));
        
        if (jEasyRadioButton.isSelected()) {
            pcChoice = computerEasyChoice();
        }
        
        if (jNormalRadioButton.isSelected()) {
            pcChoice = computerNormalChoice();
        }        
        
        if (jImpossibleRadioButton.isSelected() && jRoundCounterLabel.getText().equals("99")) {
            pcChoice = 3;
            jComputerCommentLabel.setText("<html>Perseverance<br/>It's the key<br/>to achieve victory</html>");
        } else {
            if (jImpossibleRadioButton.isSelected()) {
                pcChoice = 2;
            }                     
        }               
        
        pcChoice();
        humanChoice = 1;
        report();
    }//GEN-LAST:event_jHumanRockButtonActionPerformed

    private void jEasyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEasyRadioButtonActionPerformed
        // TODO add your handling code here:
        jHumanRockButton.setEnabled(true);
        jHumanPaperButton.setEnabled(true);
        jHumanScissorButton.setEnabled(true);
        jComputerCommentLabel.setText("<html>Easy right?<br/>You can't beat me<br/>choosing impossible XD</html>");
    }//GEN-LAST:event_jEasyRadioButtonActionPerformed

    private void jNormalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNormalRadioButtonActionPerformed
        // TODO add your handling code here:
        jHumanRockButton.setEnabled(true);
        jHumanPaperButton.setEnabled(true);
        jHumanScissorButton.setEnabled(true);
        jComputerCommentLabel.setText("<html>Normal is that<br/>the kind of person you are?<br/>You can't beat me<br/>choosing impossible XD</html>");
    }//GEN-LAST:event_jNormalRadioButtonActionPerformed

    private void jImpossibleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImpossibleRadioButtonActionPerformed
        // TODO add your handling code here:
        jHumanRockButton.setEnabled(true);
        jHumanPaperButton.setEnabled(true);
        jHumanScissorButton.setEnabled(true);
        jComputerCommentLabel.setText("<html>You have guts<br/>You can't beat me<br/>99 times</html>");
    }//GEN-LAST:event_jImpossibleRadioButtonActionPerformed

    private void jHumanPaperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHumanPaperButtonActionPerformed
        jHumanChoiceLabel.setIcon(new ImageIcon("src/guirockpaperscissor/HPaper.jpg"));
        
        if (jEasyRadioButton.isSelected()) {
            pcChoice = computerEasyChoice();
        }
        
        if (jNormalRadioButton.isSelected()) {
            pcChoice = computerNormalChoice();
        }        
        
        if (jImpossibleRadioButton.isSelected() && jRoundCounterLabel.getText().equals("99")) {
            pcChoice = 1;
            jComputerCommentLabel.setText("<html>Perseverance<br/>It's the key<br/>to achieve victory</html>");
        } else {           
            if (jImpossibleRadioButton.isSelected()) {
                pcChoice = 3;
            }          
        }               
        
        pcChoice();
        humanChoice = 2;
        report();
    }//GEN-LAST:event_jHumanPaperButtonActionPerformed

    private void jHumanScissorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHumanScissorButtonActionPerformed
        jHumanChoiceLabel.setIcon(new ImageIcon("src/guirockpaperscissor/HScissor.jpg"));
        
        if (jEasyRadioButton.isSelected()) {
            pcChoice = computerEasyChoice();
        }
        
        if (jNormalRadioButton.isSelected()) {
            pcChoice = computerNormalChoice();
        }        
        
        if (jImpossibleRadioButton.isSelected() && jRoundCounterLabel.getText().equals("99")) {
            pcChoice = 2;
            jComputerCommentLabel.setText("<html>Perseverance<br/>It's the key<br/>to achieve victory</html>");
        } else {           
            if (jImpossibleRadioButton.isSelected()) {
                pcChoice = 1;
            }          
        }               
        
        pcChoice();
        humanChoice = 3;
        report();
    }//GEN-LAST:event_jHumanScissorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RockPaperScissor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new RockPaperScissor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jComputerChoiceLabel;
    private javax.swing.JPanel jComputerChoicePanel;
    private javax.swing.JLabel jComputerCommentLabel;
    private javax.swing.JPanel jComputerPanel;
    private javax.swing.JLabel jComputerPictureLabel;
    private javax.swing.ButtonGroup jDifficultButtonGroup;
    private javax.swing.JPanel jDifficultPanel;
    private javax.swing.JLabel jDrawCounterLabel;
    private javax.swing.JLabel jDrawCounterReportLabel;
    private javax.swing.JRadioButton jEasyRadioButton;
    private javax.swing.JLabel jHumanChoiceLabel;
    private javax.swing.JPanel jHumanChoicePanel;
    private javax.swing.JPanel jHumanPanel;
    private javax.swing.JButton jHumanPaperButton;
    private javax.swing.JButton jHumanRockButton;
    private javax.swing.JButton jHumanScissorButton;
    private javax.swing.JRadioButton jImpossibleRadioButton;
    private javax.swing.JLabel jLoseCounterLabel;
    private javax.swing.JLabel jLoseCounterReportLabel;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JRadioButton jNormalRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jRoundCounterLabel;
    private javax.swing.JLabel jRoundLabel;
    private javax.swing.JLabel jWinCounterLabel;
    private javax.swing.JLabel jWinCounterReportLabel;
    // End of variables declaration//GEN-END:variables
}
