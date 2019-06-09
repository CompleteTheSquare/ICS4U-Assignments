/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war4;

import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Sterling
 */
public class Gui extends javax.swing.JFrame {

    public static ArrayList<String> computerRanksAL = new ArrayList<String>();
    public static ArrayList<String> playerRanksAL = new ArrayList<String>();
    public static ArrayList<String> computerSuitsAL = new ArrayList<String>();
    public static ArrayList<String> playerSuitsAL = new ArrayList<String>();
    static int disableDraw0 = 0;
    static int disableDraw1 = 0;
    static int disableDraw2 = 0;
    static int disableDraw3 = 0;

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
        TestButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ScoreLabel = new javax.swing.JLabel();
        computerNumberCards = new javax.swing.JLabel();
        playerNumberCards = new javax.swing.JLabel();
        Flip2 = new javax.swing.JButton();
        Flip3 = new javax.swing.JButton();

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

        DrawButton.setText("Draw");
        DrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawButtonActionPerformed(evt);
            }
        });

        computerCard0.setText("computerCard0");
        computerCard0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard0.setMaximumSize(new java.awt.Dimension(200, 250));
        computerCard0.setMinimumSize(new java.awt.Dimension(200, 250));
        computerCard0.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard0.setText("playerCard0");
        playerCard0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard0.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard0.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard0.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard1.setText("playerCard1");
        playerCard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard1.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard1.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard1.setOpaque(true);
        playerCard1.setPreferredSize(new java.awt.Dimension(200, 250));

        computerCard1.setText("computerCard1");
        computerCard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard1.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard3.setText("playerCard3");
        playerCard3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerCard3.setMaximumSize(new java.awt.Dimension(200, 250));
        playerCard3.setMinimumSize(new java.awt.Dimension(200, 250));
        playerCard3.setPreferredSize(new java.awt.Dimension(200, 250));

        computerCard2.setText("computerCard2");
        computerCard2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard2.setMaximumSize(new java.awt.Dimension(200, 250));
        computerCard2.setMinimumSize(new java.awt.Dimension(200, 250));
        computerCard2.setPreferredSize(new java.awt.Dimension(200, 250));

        computerCard3.setText("computerCard3");
        computerCard3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        computerCard3.setMaximumSize(new java.awt.Dimension(200, 250));
        computerCard3.setMinimumSize(new java.awt.Dimension(200, 250));
        computerCard3.setPreferredSize(new java.awt.Dimension(200, 250));

        playerCard2.setText("playerCard2");
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

        TestButton.setText("draw cards Test");
        TestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit Application");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        ScoreLabel.setText("Score:");

        computerNumberCards.setText("26");

        playerNumberCards.setText("26");

        Flip2.setText("Flip second card");
        Flip2.setEnabled(false);
        Flip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flip2ActionPerformed(evt);
            }
        });

        Flip3.setText("Flip last card");
        Flip3.setEnabled(false);
        Flip3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flip3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GiveUpButton)
                            .addComponent(ExitButton))
                        .addGap(4, 4, 4))
                    .addComponent(TestButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScoreLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerNumberCards)
                    .addComponent(playerNumberCards))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrawButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(computerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(computerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(computerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Flip1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Flip2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Flip3)
                            .addComponent(playerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TestButton)
                        .addGap(18, 18, 18)
                        .addComponent(GiveUpButton)
                        .addGap(26, 26, 26)
                        .addComponent(ExitButton)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(computerNumberCards)
                                    .addComponent(computerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(playerCard0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DrawButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(playerNumberCards)
                                        .addGap(157, 157, 157))))
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
                                        .addComponent(playerCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Flip1)
                                    .addComponent(Flip2)
                                    .addComponent(Flip3))))
                        .addGap(80, 80, 80))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //using the playerLastCard and computerLastCard,  we can get the ranks and the values of the card stored at the indexes
    private void DrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawButtonActionPerformed
        String playerFilePath = "src/war4/" + playerRanksAL.get(playerRanksAL.size() - 1) + playerSuitsAL.get(playerSuitsAL.size() - 1) + ".png";
        String computerFilePath = "src/war4/" + computerRanksAL.get(computerRanksAL.size() - 1) + computerSuitsAL.get(computerSuitsAL.size() - 1) + ".png";

        ImageIcon playerIcon = new ImageIcon(playerFilePath);
        ImageIcon computerIcon = new ImageIcon(computerFilePath);
        playerCard0.setIcon(playerIcon);
        computerCard0.setIcon(computerIcon);
        Gameplay.compareValues();
        GameSetup.shuffleDeck();

        if (disableDraw0 == 1) {
            Flip1.setEnabled(true);
            Flip2.setEnabled(true);
            Flip3.setEnabled(true);
            DrawButton.setEnabled(false);
            System.out.println("disableDraw: " + disableDraw0);
        } else if (disableDraw0 == -1) {
            DrawButton.setEnabled(false);
        }

        playerNumberCards.setText(Integer.toString(playerRanksAL.size()));
        computerNumberCards.setText(Integer.toString(computerRanksAL.size()));
    }//GEN-LAST:event_DrawButtonActionPerformed

    private void Flip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flip1ActionPerformed
        String playerFilePath = "src/war4/" + playerRanksAL.get(playerRanksAL.size() - 2) + playerSuitsAL.get(playerSuitsAL.size() - 2) + ".png";
        String computerFilePath = "src/war4/" + computerRanksAL.get(computerRanksAL.size() - 2) + computerSuitsAL.get(computerSuitsAL.size() - 2) + ".png";
        playerRanksAL.remove(playerRanksAL.size() - 1);
        playerSuitsAL.remove(playerRanksAL.size() - 1);
        computerRanksAL.remove(computerRanksAL.size() - 1);
        computerSuitsAL.remove(computerRanksAL.size() - 1);

        ImageIcon playerIcon = new ImageIcon(playerFilePath);
        ImageIcon computerIcon = new ImageIcon(computerFilePath);
        playerCard1.setIcon(playerIcon);
        computerCard1.setIcon(computerIcon);
        Flip1.setEnabled(false);
    }//GEN-LAST:event_Flip1ActionPerformed

    private void GiveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiveUpButtonActionPerformed
        Gameplay.war();

    }//GEN-LAST:event_GiveUpButtonActionPerformed

    private void TestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestButtonActionPerformed

    }//GEN-LAST:event_TestButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        printStuff();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void Flip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flip2ActionPerformed
        String playerFilePath = "src/war4/" + playerRanksAL.get(playerRanksAL.size() - 1) + playerSuitsAL.get(playerSuitsAL.size() - 1) + ".png";
        String computerFilePath = "src/war4/" + computerRanksAL.get(computerRanksAL.size() - 1) + computerSuitsAL.get(computerSuitsAL.size() - 1) + ".png";
        playerRanksAL.remove(playerRanksAL.size() - 1);
        playerSuitsAL.remove(playerRanksAL.size() - 1);
        computerRanksAL.remove(computerRanksAL.size() - 1);
        computerSuitsAL.remove(computerRanksAL.size() - 1);

        ImageIcon playerIcon = new ImageIcon(playerFilePath);
        ImageIcon computerIcon = new ImageIcon(computerFilePath);
        playerCard2.setIcon(playerIcon);
        computerCard2.setIcon(computerIcon);
        Flip2.setEnabled(false);
    }//GEN-LAST:event_Flip2ActionPerformed

    private void Flip3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flip3ActionPerformed
        String playerFilePath = "src/war4/" + playerRanksAL.get(playerRanksAL.size() - 1) + playerSuitsAL.get(playerSuitsAL.size() - 1) + ".png";
        String computerFilePath = "src/war4/" + computerRanksAL.get(computerRanksAL.size() - 1) + computerSuitsAL.get(computerSuitsAL.size() - 1) + ".png";

        playerRanksAL.remove(playerRanksAL.size() - 1);
        playerSuitsAL.remove(playerRanksAL.size() - 1);
        computerRanksAL.remove(computerRanksAL.size() - 1);
        computerSuitsAL.remove(computerRanksAL.size() - 1);
        ImageIcon playerIcon = new ImageIcon(playerFilePath);
        ImageIcon computerIcon = new ImageIcon(computerFilePath);
        playerCard3.setIcon(playerIcon);
        computerCard3.setIcon(computerIcon);
        Flip3.setEnabled(false);
        Gameplay.war();
    }//GEN-LAST:event_Flip3ActionPerformed

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
                GameSetup.initialize();
                GameSetup.shuffleDeck();

            }
        });
    }

    public static void printStuff() {

        String computer = "";
        String player = "";
        for (int i = 0; i < computerRanksAL.size(); i++) {
            computer = computer + "~" + computerRanksAL.get(i) + computerSuitsAL.get(i);
        }
        for (int i = 0; i < playerRanksAL.size(); i++) {
            player = player + "~" + playerRanksAL.get(i) + playerSuitsAL.get(i);
        }
        System.out.println("playerDeck: " + player);
        System.out.println("compDeck:   " + computer);
        System.out.println("---------------------------------------------------------");

    }
//if there is war, war=true


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DrawButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Flip1;
    private javax.swing.JButton Flip2;
    private javax.swing.JButton Flip3;
    private javax.swing.JButton GiveUpButton;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JButton TestButton;
    private javax.swing.JLabel computerCard0;
    private javax.swing.JLabel computerCard1;
    private javax.swing.JLabel computerCard2;
    private javax.swing.JLabel computerCard3;
    private javax.swing.JLabel computerNumberCards;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel playerCard0;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerCard3;
    private javax.swing.JLabel playerNumberCards;
    // End of variables declaration//GEN-END:variables

}
