/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minibattleship2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Sterling
 */
public class Minibattleship extends javax.swing.JFrame {

    /**
     * Creates new form Minibattleship
     */
    public Minibattleship() {
        initComponents();
    }

    public static int[] questionRow0, questionRow1, questionRow2, questionRow3;
    public static int[] solutionRow0, solutionRow1, solutionRow2, solutionRow3;
    public static int[][] questionArray, solutionArray = {solutionRow0, solutionRow1, solutionRow2, solutionRow3};
    public static int[][] shipPoints = {{0, 0}, {0, 0}, {0, 0}};
    public static int counter = 0;
    //initialize resources
    ImageIcon hitIcon = new ImageIcon("red.png");
    ImageIcon missIcon = new ImageIcon("white.png");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button00 = new javax.swing.JButton();
        button03 = new javax.swing.JButton();
        button01 = new javax.swing.JButton();
        button02 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button13 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button23 = new javax.swing.JButton();
        button21 = new javax.swing.JButton();
        button22 = new javax.swing.JButton();
        button31 = new javax.swing.JButton();
        button30 = new javax.swing.JButton();
        buttonReplay = new javax.swing.JButton();
        button32 = new javax.swing.JButton();
        button20 = new javax.swing.JButton();
        button33 = new javax.swing.JButton();
        buttonGiveUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(30, 171, 255));

        button00.setText("(0,0)");
        button00.setMaximumSize(new java.awt.Dimension(100, 100));
        button00.setMinimumSize(new java.awt.Dimension(100, 100));
        button00.setPreferredSize(new java.awt.Dimension(100, 100));
        button00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button00ActionPerformed(evt);
            }
        });

        button03.setText("(0,3)");
        button03.setMaximumSize(new java.awt.Dimension(100, 100));
        button03.setMinimumSize(new java.awt.Dimension(100, 100));
        button03.setPreferredSize(new java.awt.Dimension(100, 100));
        button03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button03ActionPerformed(evt);
            }
        });

        button01.setText("(0,1)");
        button01.setMaximumSize(new java.awt.Dimension(100, 100));
        button01.setMinimumSize(new java.awt.Dimension(100, 100));
        button01.setPreferredSize(new java.awt.Dimension(100, 100));
        button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button01ActionPerformed(evt);
            }
        });

        button02.setText("(0,2)");
        button02.setMaximumSize(new java.awt.Dimension(100, 100));
        button02.setMinimumSize(new java.awt.Dimension(100, 100));
        button02.setPreferredSize(new java.awt.Dimension(100, 100));
        button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button02ActionPerformed(evt);
            }
        });

        button11.setText("(1,1)");
        button11.setMaximumSize(new java.awt.Dimension(100, 100));
        button11.setMinimumSize(new java.awt.Dimension(100, 100));
        button11.setPreferredSize(new java.awt.Dimension(100, 100));
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button10.setText("(1,0)");
        button10.setMaximumSize(new java.awt.Dimension(100, 100));
        button10.setMinimumSize(new java.awt.Dimension(100, 100));
        button10.setPreferredSize(new java.awt.Dimension(100, 100));
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button13.setText("(1,3)");
        button13.setMaximumSize(new java.awt.Dimension(100, 100));
        button13.setMinimumSize(new java.awt.Dimension(100, 100));
        button13.setPreferredSize(new java.awt.Dimension(100, 100));
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button12.setText("(1,2)");
        button12.setMaximumSize(new java.awt.Dimension(100, 100));
        button12.setMinimumSize(new java.awt.Dimension(100, 100));
        button12.setPreferredSize(new java.awt.Dimension(100, 100));
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button23.setText("(2,3)");
        button23.setMaximumSize(new java.awt.Dimension(100, 100));
        button23.setMinimumSize(new java.awt.Dimension(100, 100));
        button23.setPreferredSize(new java.awt.Dimension(100, 100));
        button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23ActionPerformed(evt);
            }
        });

        button21.setText("(2,1)");
        button21.setMaximumSize(new java.awt.Dimension(100, 100));
        button21.setMinimumSize(new java.awt.Dimension(100, 100));
        button21.setPreferredSize(new java.awt.Dimension(100, 100));
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });

        button22.setText("(2,2)");
        button22.setMaximumSize(new java.awt.Dimension(100, 100));
        button22.setMinimumSize(new java.awt.Dimension(100, 100));
        button22.setPreferredSize(new java.awt.Dimension(100, 100));
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });

        button31.setText("(3,1)");
        button31.setMaximumSize(new java.awt.Dimension(100, 100));
        button31.setMinimumSize(new java.awt.Dimension(100, 100));
        button31.setPreferredSize(new java.awt.Dimension(100, 100));
        button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button31ActionPerformed(evt);
            }
        });

        button30.setText("(3,0)");
        button30.setMaximumSize(new java.awt.Dimension(100, 100));
        button30.setMinimumSize(new java.awt.Dimension(100, 100));
        button30.setPreferredSize(new java.awt.Dimension(100, 100));
        button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button30ActionPerformed(evt);
            }
        });

        buttonReplay.setText("Replay");
        buttonReplay.setMaximumSize(new java.awt.Dimension(100, 100));
        buttonReplay.setMinimumSize(new java.awt.Dimension(100, 100));
        buttonReplay.setPreferredSize(new java.awt.Dimension(100, 100));
        buttonReplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReplayActionPerformed(evt);
            }
        });

        button32.setText("(3,2)");
        button32.setMaximumSize(new java.awt.Dimension(100, 100));
        button32.setMinimumSize(new java.awt.Dimension(100, 100));
        button32.setPreferredSize(new java.awt.Dimension(100, 100));
        button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button32ActionPerformed(evt);
            }
        });

        button20.setText("(2,0)");
        button20.setMaximumSize(new java.awt.Dimension(100, 100));
        button20.setMinimumSize(new java.awt.Dimension(100, 100));
        button20.setPreferredSize(new java.awt.Dimension(100, 100));
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });

        button33.setText("(3,3)");
        button33.setMaximumSize(new java.awt.Dimension(100, 100));
        button33.setMinimumSize(new java.awt.Dimension(100, 100));
        button33.setPreferredSize(new java.awt.Dimension(100, 100));
        button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button33ActionPerformed(evt);
            }
        });

        buttonGiveUp.setText("Give up");
        buttonGiveUp.setMaximumSize(new java.awt.Dimension(100, 100));
        buttonGiveUp.setMinimumSize(new java.awt.Dimension(100, 100));
        buttonGiveUp.setPreferredSize(new java.awt.Dimension(100, 100));
        buttonGiveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGiveUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonGiveUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGiveUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button00ActionPerformed
        questionRow0[0] = 1;
        printQuestionArray();
        if (checkIfHit(0, 0) == true) {
            button00.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button00.setIcon(missIcon);
        }

    }//GEN-LAST:event_button00ActionPerformed
    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        questionRow0[1] = 1;
        printQuestionArray();
        if (checkIfHit(1, 0)) {
            button10.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button10.setIcon(missIcon);
        }


    }//GEN-LAST:event_button10ActionPerformed
    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        questionRow0[2] = 1;
        printQuestionArray();

        if (checkIfHit(2, 0)) {
            button20.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button20.setIcon(missIcon);
        }
    }//GEN-LAST:event_button20ActionPerformed
    private void button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button30ActionPerformed
        questionRow0[3] = 1;
        printQuestionArray();

        if (checkIfHit(3, 0)) {
            button30.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button30.setIcon(missIcon);
        }
    }//GEN-LAST:event_button30ActionPerformed
    private void button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button01ActionPerformed
        questionRow1[0] = 1;
        printQuestionArray();
        if (checkIfHit(0, 1)) {
            button01.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button01.setIcon(missIcon);
        }
    }//GEN-LAST:event_button01ActionPerformed
    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        questionRow1[1] = 1;
        printQuestionArray();
        if (checkIfHit(1, 1)) {
            button11.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button11.setIcon(missIcon);
        }
    }//GEN-LAST:event_button11ActionPerformed
    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        questionRow1[2] = 1;
        printQuestionArray();
        checkIfHit(2, 1);
        if (checkIfHit(2, 1)) {
            button21.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button21.setIcon(missIcon);
        }


    }//GEN-LAST:event_button21ActionPerformed
    private void button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button31ActionPerformed
        questionRow1[3] = 1;
        printQuestionArray();
        checkIfHit(3, 1);
        if (checkIfHit(3, 1)) {
            button31.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button31.setIcon(missIcon);
        }
    }//GEN-LAST:event_button31ActionPerformed
    private void button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button02ActionPerformed
        questionRow2[0] = 1;
        printQuestionArray();
        checkIfHit(0, 2);
        if (checkIfHit(0, 2)) {
            button02.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button02.setIcon(missIcon);
        }
    }//GEN-LAST:event_button02ActionPerformed
    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        questionRow2[1] = 1;
        printQuestionArray();
        checkIfHit(1, 2);
        if (checkIfHit(1, 2)) {
            button12.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button12.setIcon(missIcon);
        }
    }//GEN-LAST:event_button12ActionPerformed
    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        questionRow2[2] = 1;
        printQuestionArray();
        checkIfHit(2, 2);
        if (checkIfHit(2, 2)) {
            button22.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button22.setIcon(missIcon);
        }
    }//GEN-LAST:event_button22ActionPerformed
    private void button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button32ActionPerformed
        questionRow2[3] = 1;
        printQuestionArray();
        checkIfHit(3, 2);
        if (checkIfHit(3, 2)) {
            button32.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button32.setIcon(missIcon);
        }
    }//GEN-LAST:event_button32ActionPerformed
    private void button03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button03ActionPerformed
        questionRow3[0] = 1;
        printQuestionArray();
        checkIfHit(0, 3);
        if (checkIfHit(0, 3)) {
            button03.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button03.setIcon(missIcon);
        }
    }//GEN-LAST:event_button03ActionPerformed
    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        questionRow3[1] = 1;
        printQuestionArray();
        checkIfHit(1, 3);
        if (checkIfHit(1, 3)) {
            button13.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button13.setIcon(missIcon);
        }
    }//GEN-LAST:event_button13ActionPerformed
    private void button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button23ActionPerformed
        questionRow3[2] = 1;
        printQuestionArray();
        checkIfHit(2, 3);
        if (checkIfHit(2, 3)) {
            button23.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button23.setIcon(missIcon);
        }
    }//GEN-LAST:event_button23ActionPerformed
    private void button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button33ActionPerformed
        questionRow3[3] = 1;
        printQuestionArray();
        checkIfHit(3, 3);
        if (checkIfHit(3, 3)) {
            button33.setIcon(hitIcon);
            counter++;
            checkIfOver();
        } else {
            button33.setIcon(missIcon);
        }
    }//GEN-LAST:event_button33ActionPerformed
    private void buttonReplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReplayActionPerformed
        resetArrays();
        setBoatRandomly();
        button00.setIcon(null);
        button01.setIcon(null);
        button02.setIcon(null);
        button03.setIcon(null);
        button10.setIcon(null);
        button11.setIcon(null);
        button12.setIcon(null);
        button13.setIcon(null);
        button20.setIcon(null);
        button21.setIcon(null);
        button22.setIcon(null);
        button23.setIcon(null);
        button30.setIcon(null);
        button31.setIcon(null);
        button32.setIcon(null);
        button33.setIcon(null);
    }//GEN-LAST:event_buttonReplayActionPerformed
    public static void resetArrays() {
        //initialize array, it breaks if I declare it all from the same array for some weird reason
        int[] resetArray0 = {0, 0, 0, 0};
        int[] resetArray1 = {0, 0, 0, 0};
        int[] resetArray2 = {0, 0, 0, 0};
        int[] resetArray3 = {0, 0, 0, 0};

        int[] resetArray00 = {0, 0, 0, 0};
        int[] resetArray11 = {0, 0, 0, 0};
        int[] resetArray22 = {0, 0, 0, 0};
        int[] resetArray33 = {0, 0, 0, 0};

        questionRow0 = resetArray0;
        questionRow1 = resetArray1;
        questionRow2 = resetArray2;
        questionRow3 = resetArray3;
        solutionRow0 = resetArray00;
        solutionRow1 = resetArray11;
        solutionRow2 = resetArray22;
        solutionRow3 = resetArray33;
    }
    private void buttonGiveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGiveUpActionPerformed
        button00.setIcon(missIcon);
        button01.setIcon(missIcon);
        button02.setIcon(missIcon);
        button03.setIcon(missIcon);
        button10.setIcon(missIcon);
        button11.setIcon(missIcon);
        button12.setIcon(missIcon);
        button13.setIcon(missIcon);
        button20.setIcon(missIcon);
        button21.setIcon(missIcon);
        button22.setIcon(missIcon);
        button23.setIcon(missIcon);
        button30.setIcon(missIcon);
        button31.setIcon(missIcon);
        button32.setIcon(missIcon);
        button33.setIcon(missIcon);

        if (checkIfHit(0, 0)) {
            button00.setIcon(hitIcon);
        }
        if (checkIfHit(0, 1)) {
            button01.setIcon(hitIcon);
        }
        if (checkIfHit(0, 2)) {
            button02.setIcon(hitIcon);
        }
        if (checkIfHit(0, 3)) {
            button03.setIcon(hitIcon);
        }

        if (checkIfHit(1, 0)) {
            button10.setIcon(hitIcon);
        }
        if (checkIfHit(1, 1)) {
            button11.setIcon(hitIcon);
        }
        if (checkIfHit(1, 2)) {
            button12.setIcon(hitIcon);
        }
        if (checkIfHit(1, 3)) {
            button13.setIcon(hitIcon);
        }

        if (checkIfHit(2, 0)) {
            button20.setIcon(hitIcon);
        }
        if (checkIfHit(2, 1)) {
            button21.setIcon(hitIcon);
        }
        if (checkIfHit(2, 2)) {
            button22.setIcon(hitIcon);
        }
        if (checkIfHit(2, 3)) {
            button23.setIcon(hitIcon);
        }

        if (checkIfHit(3, 0)) {
            button30.setIcon(hitIcon);
        }
        if (checkIfHit(3, 1)) {
            button31.setIcon(hitIcon);
        }
        if (checkIfHit(3, 2)) {
            button32.setIcon(hitIcon);
        }
        if (checkIfHit(3, 3)) {
            button33.setIcon(hitIcon);
        }

    }//GEN-LAST:event_buttonGiveUpActionPerformed

    public void checkIfOver() {
        if (counter == 3) {
            buttonGiveUp.setText("You won :) ");
            System.out.println("You won :) ");
        }
        System.out.println(counter);
    }

    public static void setBoatRandomly() {
        int boundary = 3;
        int ax = (int) (Math.round((Math.random()) * boundary));
        int ay = (int) (Math.round((Math.random()) * boundary));

        //protects against corners = only 1/16 chance that this would cause an exception and code would break
        if (ax == 0) {
            if (ay == 0 || ay == boundary) {
                ax = (int) (Math.round((Math.random()) * boundary));
                ay = (int) (Math.round((Math.random()) * boundary));
            }
        }
        if (ax == boundary) {
            if (ay == 0 || ay == boundary) {
                ax = (int) (Math.round((Math.random()) * boundary));
                ay = (int) (Math.round((Math.random()) * boundary));
            }
        }

        int bx = ax, by = ay, cx = ax, cy = ay;

        //protects against 3,1 and 3,2
        if (ax == boundary) {
            if (ay == 1 || ay == boundary - 1) {
                bx = boundary;
                by = ay - 1;
                cx = boundary;
                cy = ay + 1;
                System.out.println("case 1");
            }
        } //protects against 0,1 and 0,2
        else if (ax == 0) {
            if (ay == 1 || ay == boundary - 1) {
                bx = 0;
                by = ay - 1;
                cx = 0;
                cy = ay + 1;
                System.out.println("case 2");
            }
        } //protects against 1,0 and 2,0
        else if (ay == 0) {
            if (ax == 1 || ax == boundary - 1) {
                bx = ax - 1;
                by = 0;
                cx = ax + 1;
                cy = 0;
                System.out.println("case 3");
            }
        } //protects against 1,3 and 2,3
        else if (ay == boundary) {
            if (ax == 1 || ax == boundary - 1) {
                bx = ax - 1;
                by = boundary;
                cx = ax + 1;
                cy = boundary;
                System.out.println("case 4");
            }
        } else {//treat as not an exception (it is not in the border)
            int directionInt = (int) (Math.round((Math.random()) * 1));
            if (directionInt == 0) {//direction is left and right

                System.out.println("case 5");
                bx = ax - 1;
                by = ay;
                cx = ax + 1;
                cy = ay;
            } else {//direction is up and down
                System.out.println("case 6");
                bx = ax;
                by = ay - 1;
                cx = ax;
                cy = ay + 1;
            }
        }
        System.out.println(" ");
        System.out.println(" ax: " + ax);
        System.out.println(" ay: " + ay);
        System.out.println(" bx: " + bx);
        System.out.println(" by: " + by);
        System.out.println(" cx: " + cx);
        System.out.println(" cy: " + cy);

        int[][] holder1 = {solutionRow0, solutionRow1, solutionRow2, solutionRow3};
        solutionArray = holder1;
        solutionArray[ax][ay] = 1;
        solutionArray[bx][by] = 1;
        solutionArray[cx][cy] = 1;

        shipPoints[0][0] = ax;
        shipPoints[0][1] = ay;
        shipPoints[1][0] = bx;
        shipPoints[1][1] = by;
        shipPoints[2][0] = cx;
        shipPoints[2][1] = cy;
        printSolutionArray();
    }
    //question x is the  x coordinates of the button the user clicked and wants to check.
    //question y is the  y coordinates of the button the user clicked and wants to check.

    public static boolean checkIfHit(int questionX, int questionY) {
        boolean isHit = false;
        System.out.println("question X : " + questionX);
        System.out.println("question Y : " + questionY);

        if (solutionArray[questionY][questionX] == 1) {
            System.out.println("you hit my cat");
            isHit = true;

        }
        System.out.println("\n");
        return isHit;

    }

    public static void printQuestionArray() {
        int[][] holder0 = {questionRow0, questionRow1, questionRow2, questionRow3};
        questionArray = holder0;
        System.out.println("Question Array : ");
        System.out.println(Arrays.toString(questionRow0));
        System.out.println(Arrays.toString(questionRow1));
        System.out.println(Arrays.toString(questionRow2));
        System.out.println(Arrays.toString(questionRow3));
        System.out.println(" ");
    }

    public static void printSolutionArray() {
        System.out.println("Solution Array : ");
        System.out.println(Arrays.toString(solutionRow0));
        System.out.println(Arrays.toString(solutionRow1));
        System.out.println(Arrays.toString(solutionRow2));
        System.out.println(Arrays.toString(solutionRow3));
        System.out.println(" ");
    }

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
            java.util.logging.Logger.getLogger(Minibattleship.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Minibattleship.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Minibattleship.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Minibattleship.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Minibattleship().setVisible(true);
            }
        });

        resetArrays();

        printQuestionArray();
        setBoatRandomly();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button00;
    private javax.swing.JButton button01;
    private javax.swing.JButton button02;
    private javax.swing.JButton button03;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button22;
    private javax.swing.JButton button23;
    private javax.swing.JButton button30;
    private javax.swing.JButton button31;
    private javax.swing.JButton button32;
    private javax.swing.JButton button33;
    private javax.swing.JButton buttonGiveUp;
    private javax.swing.JButton buttonReplay;
    // End of variables declaration//GEN-END:variables
}