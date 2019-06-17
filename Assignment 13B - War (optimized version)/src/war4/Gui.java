/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war4;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Sterling
 */
public class Gui extends javax.swing.JFrame {

    public static ArrayList<String> computerRanksAL = new ArrayList<String>(); //array that holds the computer's current card ranks/values in an array
    public static ArrayList<String> playerRanksAL = new ArrayList<String>();   //array that holds the player's current card ranks/values in an array
    public static ArrayList<String> computerSuitsAL = new ArrayList<String>(); //array that holds the computer's current card suits in an array
    public static ArrayList<String> playerSuitsAL = new ArrayList<String>();   //array that holds the player's current card suits in an array

    public static ArrayList<String> RanksWarHolder = new ArrayList<String>();  //array that holds the ranks of the cards in a war
    public static ArrayList<String> SuitsWarHolder = new ArrayList<String>();  //array that holds the suits of the cards in a war
    public static int distribution; //randomly generated number that distributes cards to a random player if a war happens within a war

    public static int counter = 0;//a counter that raises by 1 everytime the player flips a card (including wars). Number of flips is the score (lower score is better).
    private static boolean iteration = false; //this makes sure that the cards are flipped and the backings are shown after a war happens
    public static int disableDraw = 0;// this checks if there is a war or not (0 is no war, 1 means war)

    public Gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        DrawButton = new javax.swing.JButton();
        computerCard0 = new javax.swing.JLabel();
        playerCard0 = new javax.swing.JLabel();
        playerCard1 = new javax.swing.JLabel();
        computerCard1 = new javax.swing.JLabel();
        playerCard3 = new javax.swing.JLabel();
        computerCard2 = new javax.swing.JLabel();
        computerCard3 = new javax.swing.JLabel();
        playerCard2 = new javax.swing.JLabel();
        Flip1 = new javax.swing.JButton();
        GiveUpButton = new javax.swing.JButton();
        InstructionsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        computerNumberCards = new javax.swing.JLabel();
        playerNumberCards = new javax.swing.JLabel();
        Flip2 = new javax.swing.JButton();
        Flip3 = new javax.swing.JButton();
        computerCard4 = new javax.swing.JLabel();
        playerCard4 = new javax.swing.JLabel();
        Flip4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        SaveScoreButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 722));
        setResizable(false);

        DrawButton.setText("Draw");
        DrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawButtonActionPerformed(evt);
            }
        });

        computerCard0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        computerCard0.setText(" ");
        computerCard0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard0.setMaximumSize(new java.awt.Dimension(200, 250));
        computerCard0.setMinimumSize(new java.awt.Dimension(200, 250));
        computerCard0.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        playerCard0.setText(" ");
        playerCard0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard0.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard0.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard0.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        playerCard1.setText(" ");
        playerCard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard1.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard1.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard1.setOpaque(true);
        playerCard1.setPreferredSize(new java.awt.Dimension(200, 250));

        computerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        computerCard1.setText(" ");
        computerCard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard1.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        playerCard3.setText(" ");
        playerCard3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard3.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard3.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard3.setPreferredSize(new java.awt.Dimension(200, 250));

        computerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        computerCard2.setText(" ");
        computerCard2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard2.setMaximumSize(new java.awt.Dimension(200, 250));
        computerCard2.setMinimumSize(new java.awt.Dimension(200, 250));
        computerCard2.setPreferredSize(new java.awt.Dimension(200, 250));

        computerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        computerCard3.setText(" ");
        computerCard3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard3.setMaximumSize(new java.awt.Dimension(200, 250));
        computerCard3.setMinimumSize(new java.awt.Dimension(200, 250));
        computerCard3.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        playerCard2.setText(" ");
        playerCard2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard2.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard2.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard2.setPreferredSize(new java.awt.Dimension(200, 250));

        Flip1.setText("Flip first card");
        Flip1.setEnabled(false);
        Flip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flip1ActionPerformed(evt);
            }
        });

        GiveUpButton.setText("Give up");
        GiveUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiveUpButtonActionPerformed(evt);
            }
        });

        InstructionsButton.setText("Instructions");
        InstructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionsButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit Application");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        scoreLabel.setText("Score:");

        computerNumberCards.setText("26");

        playerNumberCards.setText("26");

        Flip2.setText("Flip second card");
        Flip2.setEnabled(false);
        Flip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flip2ActionPerformed(evt);
            }
        });

        Flip3.setText("Flip third card");
        Flip3.setEnabled(false);
        Flip3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flip3ActionPerformed(evt);
            }
        });

        computerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        computerCard4.setText(" ");
        computerCard4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard4.setMaximumSize(new java.awt.Dimension(200, 250));
        computerCard4.setMinimumSize(new java.awt.Dimension(200, 250));
        computerCard4.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war4/backing.png"))); // NOI18N
        playerCard4.setText(" ");
        playerCard4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard4.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard4.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard4.setPreferredSize(new java.awt.Dimension(200, 250));

        Flip4.setText("Flip last card");
        Flip4.setEnabled(false);
        Flip4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flip4ActionPerformed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setText("Welcome to the card game War.");
        textArea.setWrapStyleWord(true);
        textArea.setMaximumSize(new java.awt.Dimension(196, 94));
        textArea.setMinimumSize(new java.awt.Dimension(196, 94));
        textArea.setSelectionColor(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(textArea);

        SaveScoreButton.setText("Show Leaderboard");
        SaveScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveScoreButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GiveUpButton)
                                    .addComponent(InstructionsButton))
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(scoreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(computerNumberCards)
                            .addComponent(playerNumberCards)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveScoreButton))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DrawButton)
                        .addGap(161, 161, 161)
                        .addComponent(Flip1)
                        .addGap(111, 111, 111)
                        .addComponent(Flip2)
                        .addGap(97, 97, 97)
                        .addComponent(Flip3)
                        .addGap(109, 109, 109)
                        .addComponent(Flip4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(computerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(computerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(computerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(computerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(playerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(computerCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(computerCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(playerCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(computerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(playerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(playerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(computerNumberCards)
                        .addGap(18, 18, 18)
                        .addComponent(playerNumberCards))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(InstructionsButton)
                        .addGap(18, 18, 18)
                        .addComponent(GiveUpButton)
                        .addGap(18, 18, 18)
                        .addComponent(SaveScoreButton)
                        .addGap(24, 24, 24)
                        .addComponent(ExitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(computerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(playerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DrawButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Flip1)
                        .addComponent(Flip2)
                        .addComponent(Flip3))
                    .addComponent(Flip4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    private void DrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawButtonActionPerformed
        if (iteration == true) {
            setBacking();//sets card backing after war
        }
        playerCard0.setIcon(setPlayerCard()); //sets the player card image
        computerCard0.setIcon(setComputerCard());//sets the computer card image
        int holder = Gameplay.compareValues(); //holder variable determines what message will be outputted (0 means player wins draw, 1 means computer wins draw, -1 means war)
        counter++;//game adds 1 to the number of flips 
        if (disableDraw == 1) {//if there is war,
            addToHolderArray();//the player's cards and computer's cards are added to an array temporarily
            removeFromMainArray();//they player's cards and computer's cards are removed from the arrays 
            Flip1.setEnabled(true);//activates button to flip the second card in war
            DrawButton.setEnabled(false);//player can not draw anymore
        } else if (disableDraw == -1) {//if there is a war
            DrawButton.setEnabled(false);//player can not draw anymore
        }
        check0cards(0);//checks that both players have enough cards (they do not have 0) to continue (else, forfeiture)
        if (holder == 0) {
            textArea.setText("The cards go to the player");
        } else if (holder == 1) {
            textArea.setText("The cards go to the computer");
        } else if (holder == -1) {
            textArea.setText("War!!");
        }
        updateScores();//update the scores of the game
    }//GEN-LAST:event_DrawButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private void Flip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flip1ActionPerformed
        playerCard1.setIcon(setPlayerCard());//sets the player card image
        computerCard1.setIcon(setComputerCard());//sets the computer card image
        counter++;//game adds 1 to the number of flips 
        addToHolderArray();//the player's cards and computer's cards are added to an array temporarily
        removeFromMainArray();//they player's cards and computer's cards are removed from the arrays 
        Flip1.setEnabled(false);
        Flip2.setEnabled(true);
        updateScores();//update the scores of the game
        check0cards(0);//checks that both players have enough cards (they do not have 0) to continue (else, forfeiture)
        check1cards();//checks that both players have enough cards (they do not have 1) to continue (else, forfeiture)
    }//GEN-LAST:event_Flip1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void GiveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiveUpButtonActionPerformed
        DrawButton.setEnabled(false);
        Flip1.setEnabled(false);
        Flip2.setEnabled(false);
        Flip3.setEnabled(false);
        Flip4.setEnabled(false);
        textArea.setText("you have forfeited the game");
    }//GEN-LAST:event_GiveUpButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private void InstructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructionsButtonActionPerformed
        Instructions.displayInformation();
    }//GEN-LAST:event_InstructionsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private void Flip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flip2ActionPerformed
        playerCard2.setIcon(setPlayerCard());//sets the player card image
        computerCard2.setIcon(setComputerCard());//sets the computer card image
        addToHolderArray();//the player's cards and computer's cards are added to an array temporarily
        removeFromMainArray();//they player's cards and computer's cards are removed from the arrays 
        counter++;//game adds 1 to the number of flips 
        Flip2.setEnabled(false);
        Flip3.setEnabled(true);
        updateScores();//update the scores of the game
        check0cards(0);//checks that both players have enough cards (they do not have 0) to continue (else, forfeiture)
        check1cards();//checks that both players have enough cards (they do not have 1) to continue (else, forfeiture)
    }//GEN-LAST:event_Flip2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void Flip3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flip3ActionPerformed
        playerCard3.setIcon(setPlayerCard());//sets the player card image
        computerCard3.setIcon(setComputerCard());//sets the computer card image
        addToHolderArray();//the player's cards and computer's cards are added to an array temporarily
        removeFromMainArray();//they player's cards and computer's cards are removed from the arrays 
        Flip3.setEnabled(false);
        Flip4.setEnabled(true);
        updateScores();//update the scores of the game
        check0cards(0);//checks that both players have enough cards (they do not have 0) to continue (else, forfeiture)
        check1cards();//checks that both players have enough cards (they do not have 1) to continue (else, forfeiture)
        counter++;//game adds 1 to the number of flips 
    }//GEN-LAST:event_Flip3ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void Flip4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flip4ActionPerformed
        playerCard4.setIcon(setPlayerCard());//sets the player card image
        computerCard4.setIcon(setComputerCard());//sets the computer card image
        addToHolderArray();//the player's cards and computer's cards are added to an array temporarily
        Gameplay.war();//does the War method
        removeFromMainArray();//they player's cards and computer's cards are removed from the arrays 
        Flip4.setEnabled(false);
        updateScores();//update the scores of the game
        DrawButton.setEnabled(true);
        disableDraw = 0;//resets it so that there is no more war
        counter++;//game adds 1 to the number of flips 
        check0cards(1);//checks that both players have enough cards (they do not have 0) to continue (else, forfeiture)
        distribution();//distibute all 10 cards to either the player or the computer (randomly chose who receives cards)
        iteration = true;//makes sure that card backings are showing after war
    }//GEN-LAST:event_Flip4ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void SaveScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveScoreButtonActionPerformed
        Save.displayLeaderboard();//displays leaderboard dialog
    }//GEN-LAST:event_SaveScoreButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
                try {
                    Save.load();
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                GameSetup.initialize();
                GameSetup.shuffleDeck();
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    private ImageIcon setPlayerCard() {
        String playerFilePath = "src/war4/res/" + playerRanksAL.get(playerRanksAL.size() - 1) + playerSuitsAL.get(playerSuitsAL.size() - 1) + ".png";
        ImageIcon playerIcon = new ImageIcon(playerFilePath);
        return playerIcon;
    }

    /**
     * @param args the command line arguments
     */
    private ImageIcon setComputerCard() {
        String computerFilePath = "src/war4/res/" + computerRanksAL.get(computerRanksAL.size() - 1) + computerSuitsAL.get(computerSuitsAL.size() - 1) + ".png";
        ImageIcon computerIcon = new ImageIcon(computerFilePath);
        return computerIcon;
    }

    /**
     * @param args the command line arguments
     */
    private void distribution() {
        distribution = Gameplay.playerComp();
        if (distribution == 0) {
            textArea.setText("All 10 cards go to the player");
        }
        if (distribution == 1) {
            textArea.setText("All 10 cards go to the computer");
        }
    }

    /**
     * @param args the command line arguments
     */
    private void addToHolderArray() {
        RanksWarHolder.add(computerRanksAL.get(computerRanksAL.size() - 1));
        SuitsWarHolder.add(computerSuitsAL.get(computerSuitsAL.size() - 1));
        RanksWarHolder.add(playerRanksAL.get(playerRanksAL.size() - 1));
        SuitsWarHolder.add(playerSuitsAL.get(playerSuitsAL.size() - 1));
    }

    /**
     * @param args the command line arguments
     */
    private void removeFromMainArray() {
        playerRanksAL.remove(playerRanksAL.size() - 1);
        playerSuitsAL.remove(playerSuitsAL.size() - 1);
        computerRanksAL.remove(computerRanksAL.size() - 1);
        computerSuitsAL.remove(computerSuitsAL.size() - 1);
    }

    /**
     * @param args the command line arguments
     */
    private void updateScores() {
        playerNumberCards.setText(Integer.toString(playerRanksAL.size()));
        computerNumberCards.setText(Integer.toString(computerRanksAL.size()));

    }

    /**
     * @param args the command line arguments
     */
    private void setBacking() {
        String cardBacking = "src/war4/backing.png";
        ImageIcon cardBackingIcon = new ImageIcon(cardBacking);
        playerCard0.setIcon(cardBackingIcon);
        playerCard1.setIcon(cardBackingIcon);
        playerCard2.setIcon(cardBackingIcon);
        playerCard3.setIcon(cardBackingIcon);
        playerCard4.setIcon(cardBackingIcon);
        computerCard0.setIcon(cardBackingIcon);
        computerCard1.setIcon(cardBackingIcon);
        computerCard2.setIcon(cardBackingIcon);
        computerCard3.setIcon(cardBackingIcon);
        computerCard4.setIcon(cardBackingIcon);
    }

    /**
     * @param args the command line arguments
     */
    private void disableGameButtons() {
        DrawButton.setEnabled(false);
        Flip1.setEnabled(false);
        Flip2.setEnabled(false);
        Flip3.setEnabled(false);
        Flip4.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    private void check0cards(int holder) {
        if (playerRanksAL.size() == 0) {//if the computer has no cards left, player wins (impossible for computer to win war)
            disableGameButtons();
            textArea.setText("computer wins!");//display message 
        } else if (computerRanksAL.size() == 0) {//if the computer has no cards left, player wins (impossible for computer to win war)
            disableGameButtons();
            textArea.setText("player wins!");//display message 
            try {
                Save.Save();//if player wins, bring up the save dialog box
            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (holder == 1) {
                disableGameButtons();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    private void check1cards() {
        if (playerRanksAL.size() == 1) {//if the player has 1 last card, computer wins (impossible for player to win war)
            disableGameButtons();
            textArea.setText("computer wins!");//display message 
        } else if (computerRanksAL.size() == 1) {//if the computer has 1 last card, player wins (impossible for computer to win war)
            disableGameButtons();
            textArea.setText("player wins!");//display message 
            try {
                Save.Save();//if player wins, bring up the save dialog box
            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DrawButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Flip1;
    private javax.swing.JButton Flip2;
    private javax.swing.JButton Flip3;
    private javax.swing.JButton Flip4;
    private javax.swing.JButton GiveUpButton;
    private javax.swing.JButton InstructionsButton;
    private javax.swing.JButton SaveScoreButton;
    private javax.swing.JLabel computerCard0;
    private javax.swing.JLabel computerCard1;
    private javax.swing.JLabel computerCard2;
    private javax.swing.JLabel computerCard3;
    private javax.swing.JLabel computerCard4;
    private javax.swing.JLabel computerNumberCards;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel playerCard0;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerCard3;
    private javax.swing.JLabel playerCard4;
    private javax.swing.JLabel playerNumberCards;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

}
