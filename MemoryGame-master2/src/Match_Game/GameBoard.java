package Match_Game;

import State_Pattern.state;
//import Decurator_Pattern.Idecurator;
import Facade_Pattern.Ifacade;
import Memento_Pattern.Caretaker;
import Memento_Pattern.Originator;
//import Facade_Pattern.wipeBoardC;
import State_Pattern.Context;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 * @author reprise
 */
//
public class GameBoard extends JFrame implements  Ifacade {
    

    /**
     * Creates new form GameBoard
     */
    public GameBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tile1 = new javax.swing.JButton();
        Tile14 = new javax.swing.JButton();
        Tile12 = new javax.swing.JButton();
        Tile13 = new javax.swing.JButton();
        Tile22 = new javax.swing.JButton();
        Tile23 = new javax.swing.JButton();
        Tile21 = new javax.swing.JButton();
        Tile24 = new javax.swing.JButton();
        Tile31 = new javax.swing.JButton();
        Tile32 = new javax.swing.JButton();
        Tile41 = new javax.swing.JButton();
        Tile42 = new javax.swing.JButton();
        Tile43 = new javax.swing.JButton();
        Tile44 = new javax.swing.JButton();
        Tile33 = new javax.swing.JButton();
        Tile34 = new javax.swing.JButton();
        startGameButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("4x4 Memory Game");
        setResizable(false);

        Tile1.setEnabled(false);
        Tile1.setFocusable(false);
        Tile1.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile1.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile1.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile1ActionPerformed(evt);
            }
        });

        Tile14.setEnabled(false);
        Tile14.setFocusable(false);
        Tile14.setName(""); // NOI18N
        Tile14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile14ActionPerformed(evt);
            }
        });

        Tile12.setEnabled(false);
        Tile12.setFocusable(false);
        Tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile12ActionPerformed(evt);
            }
        });

        Tile13.setEnabled(false);
        Tile13.setFocusable(false);
        Tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile13ActionPerformed(evt);
            }
        });

        Tile22.setEnabled(false);
        Tile22.setFocusable(false);
        Tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile22ActionPerformed(evt);
            }
        });

        Tile23.setEnabled(false);
        Tile23.setFocusable(false);
        Tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile23ActionPerformed(evt);
            }
        });

        Tile21.setEnabled(false);
        Tile21.setFocusable(false);
        Tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile21ActionPerformed(evt);
            }
        });

        Tile24.setEnabled(false);
        Tile24.setFocusable(false);
        Tile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile24ActionPerformed(evt);
            }
        });

        Tile31.setEnabled(false);
        Tile31.setFocusable(false);
        Tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile31ActionPerformed(evt);
            }
        });

        Tile32.setEnabled(false);
        Tile32.setFocusable(false);
        Tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile32ActionPerformed(evt);
            }
        });

        Tile41.setEnabled(false);
        Tile41.setFocusable(false);
        Tile41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile41ActionPerformed(evt);
            }
        });

        Tile42.setEnabled(false);
        Tile42.setFocusable(false);
        Tile42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile42ActionPerformed(evt);
            }
        });

        Tile43.setEnabled(false);
        Tile43.setFocusable(false);
        Tile43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile43ActionPerformed(evt);
            }
        });

        Tile44.setEnabled(false);
        Tile44.setFocusable(false);
        Tile44.setVerifyInputWhenFocusTarget(false);
        Tile44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile44ActionPerformed(evt);
            }
        });

        Tile33.setEnabled(false);
        Tile33.setFocusable(false);
        Tile33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile33ActionPerformed(evt);
            }
        });

        Tile34.setEnabled(false);
        Tile34.setFocusable(false);
        Tile34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile34ActionPerformed(evt);
            }
        });

        startGameButton.setText("START");
        startGameButton.setToolTipText("");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        QuitButton.setText("QUIT");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Tile1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tile41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tile34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(startGameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(QuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // = = = = = = = = = = START GAME BUTTON = = = = = = = = = =
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed

        Tile1.setEnabled(true);
        Tile12.setEnabled(true);
        Tile13.setEnabled(true);
        Tile14.setEnabled(true);
        Tile21.setEnabled(true);
        Tile22.setEnabled(true);
        Tile23.setEnabled(true);
        Tile24.setEnabled(true);
        Tile31.setEnabled(true);
        Tile32.setEnabled(true);
        Tile33.setEnabled(true);
        Tile34.setEnabled(true);
        Tile41.setEnabled(true);
        Tile42.setEnabled(true);
        Tile43.setEnabled(true);
        Tile44.setEnabled(true);

        //generate random #'s and assign them to shapes as IDs.
        //G4.play(0);
        //T4.initShuffleTiles();
        initShuffleTiles();
        //let the user see the board for a second.  Then they match by memory.
        flashShapes();
    }//GEN-LAST:event_startGameButtonActionPerformed

    //Tile 1,1 | ID 0 - Press
    private void Tile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile1ActionPerformed
        int ID = 0;
        int type;

//        G4.play(1);
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile1ActionPerformed

    //Tile 1,2 | ID 1 - Press
    private void Tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile12ActionPerformed
        int ID = 1;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile12ActionPerformed

    //Tile 1,3 | ID 2 - Press
    private void Tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile13ActionPerformed
        int ID = 2;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile13ActionPerformed

    //Tile 1,4 | ID 3 - Press
    private void Tile14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile14ActionPerformed
        int ID = 3;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile14ActionPerformed

    //Tile 2,1 | ID 4 - Press
    private void Tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile21ActionPerformed
        int ID = 4;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile21ActionPerformed

    //Tile 2,2 | ID 5 - Press
    private void Tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile22ActionPerformed
        int ID = 5;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile22ActionPerformed

    //Tile 2,3 | ID 6 - Press
    private void Tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile23ActionPerformed
        int ID = 6;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile23ActionPerformed

    //Tile 2,4 | ID 7 - Press
    private void Tile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile24ActionPerformed
        int ID = 7;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile24ActionPerformed

    //Tile 3,1 | ID 8 - Press
    private void Tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile31ActionPerformed
        int ID = 8;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile31ActionPerformed

    //Tile 3,2 | ID 9 - Press
    private void Tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile32ActionPerformed
        int ID = 9;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile32ActionPerformed

    //Tile 3,3 | ID 10 - Press
    private void Tile33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile33ActionPerformed
        int ID = 10;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile33ActionPerformed

    //Tile 3,4 | ID 11 - Press
    private void Tile34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile34ActionPerformed
        int ID = 11;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile34ActionPerformed

    //Tile 4,1 | ID 12 - Press
    private void Tile41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile41ActionPerformed
        int ID = 12;
        int type;
        type =get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile41ActionPerformed

    //Tile 4,2 | ID 13 - Press
    private void Tile42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile42ActionPerformed
        int ID = 13;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile42ActionPerformed

    //Tile 4,3 | ID 14 - Press
    private void Tile43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile43ActionPerformed
        int ID = 14;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile43ActionPerformed

    //Tile 4,4 | ID 15 - Press
    private void Tile44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile44ActionPerformed
        int ID = 15;
        int type;
        type = get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile44ActionPerformed

    //Quit Button, Reset the board as if it had never been opened, and close it.  doesn't quit program.
    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed

        this.dispose();
        //System.exit(0);
        //checkEndGame();//
       // QuitButton.setBackground(Color.yellow);
    }//GEN-LAST:event_QuitButtonActionPerformed

    //===================================OTHER DEFINED SUBROUTINES==================================
    // will display an icon on the button based on the shape_code that the button asks for prior to calling this sub.
    public void showTileShape(int ID, int type) {
        //first define an array list filled with imageicons for tiles. their index is = to their shape code.
        //so to read from it, just pass type to this ArrayList to get the right icon/shape.
        ArrayList<ImageIcon> ArrayOfImages = new ArrayList<ImageIcon>();
        ArrayOfImages.add(Circle);
        ArrayOfImages.add(Cross);
        ArrayOfImages.add(Diamond);
        ArrayOfImages.add(Donut);
        ArrayOfImages.add(Eclipse);
        ArrayOfImages.add(Square);
        ArrayOfImages.add(Star);
        ArrayOfImages.add(X);

        //now based on the ID passed, the tile at that case will search the array using type, and set the icon to the one it matches.
        switch (ID) {
            case 0:
                Tile1.setIcon(ArrayOfImages.get(type));
                break;
            case 1:
                Tile12.setIcon(ArrayOfImages.get(type));
                break;
            case 2:
                Tile13.setIcon(ArrayOfImages.get(type));
                break;
            case 3:
                Tile14.setIcon(ArrayOfImages.get(type));
                break;
            case 4:
                Tile21.setIcon(ArrayOfImages.get(type));
                break;
            case 5:
                Tile22.setIcon(ArrayOfImages.get(type));
                break;
            case 6:
                Tile23.setIcon(ArrayOfImages.get(type));
                break;
            case 7:
                Tile24.setIcon(ArrayOfImages.get(type));
                break;
            case 8:
                Tile31.setIcon(ArrayOfImages.get(type));
                break;
            case 9:
                Tile32.setIcon(ArrayOfImages.get(type));
                break;
            case 10:
                Tile33.setIcon(ArrayOfImages.get(type));
                break;
            case 11:
                Tile34.setIcon(ArrayOfImages.get(type));
                break;
            case 12:
                Tile41.setIcon(ArrayOfImages.get(type));
                break;
            case 13:
                Tile42.setIcon(ArrayOfImages.get(type));
                break;
            case 14:
                Tile43.setIcon(ArrayOfImages.get(type));
                break;
            case 15:
                Tile44.setIcon(ArrayOfImages.get(type));
                break;
        }
    }

    //Sets the icons to all of the buttons to BlankTile.png. Doesn't reset the actual game.
    public void wipeBoard() {
        Tile1.setIcon(Blank);
        Tile12.setIcon(Blank);
        Tile13.setIcon(Blank);
        Tile14.setIcon(Blank);
        Tile21.setIcon(Blank);
        Tile22.setIcon(Blank);
        Tile23.setIcon(Blank);
        Tile24.setIcon(Blank);
        Tile31.setIcon(Blank);
        Tile32.setIcon(Blank);
        Tile33.setIcon(Blank);
        Tile34.setIcon(Blank);
        Tile41.setIcon(Blank);
        Tile42.setIcon(Blank);
        Tile43.setIcon(Blank);
        Tile44.setIcon(Blank);
    }

    //do the 2 buttons chosen have matching shapes?
//    @Override
    public boolean testMatch(int type1, int type2) {
        boolean match = false;
        if (type1 == type2) {
            match = true;
        }
        return match;
    }

    //Hide the shape and set icon to blank a particular button/Tile.
    public void hideSelectedTile(int ID) {
        switch (ID) {
            case 0:
                Tile1.setIcon(Blank);
                break;
            case 1:
                Tile12.setIcon(Blank);
                break;
            case 2:
                Tile13.setIcon(Blank);
                break;
            case 3:
                Tile14.setIcon(Blank);
                break;
            case 4:
                Tile21.setIcon(Blank);
                break;
            case 5:
                Tile22.setIcon(Blank);
                break;
            case 6:
                Tile23.setIcon(Blank);
                break;
            case 7:
                Tile24.setIcon(Blank);
                break;
            case 8:
                Tile31.setIcon(Blank);
                break;
            case 9:
                Tile32.setIcon(Blank);
                break;
            case 10:
                Tile33.setIcon(Blank);
                break;
            case 11:
                Tile34.setIcon(Blank);
                break;
            case 12:
                Tile41.setIcon(Blank);
                break;
            case 13:
                Tile42.setIcon(Blank);
                break;
            case 14:
                Tile43.setIcon(Blank);
                break;
            case 15:
                Tile44.setIcon(Blank);
                break;
        }
    }

    //enable or disable a button. (enable when it's blank [again], & disable when a shape is showing.)
    public void buttonEnabledSwitch(boolean state, int ID) {
        switch (ID) {
            case 0:
                Tile1.setEnabled(state);
                break;
            case 1:
                Tile12.setEnabled(state);
                break;
            case 2:
                Tile13.setEnabled(state);
                break;
            case 3:
                Tile14.setEnabled(state);
                break;
            case 4:
                Tile21.setEnabled(state);
                break;
            case 5:
                Tile22.setEnabled(state);
                break;
            case 6:
                Tile23.setEnabled(state);
                break;
            case 7:
                Tile24.setEnabled(state);
                break;
            case 8:
                Tile31.setEnabled(state);
                break;
            case 9:
                Tile32.setEnabled(state);
                break;
            case 10:
                Tile33.setEnabled(state);
                break;
            case 11:
                Tile34.setEnabled(state);
                break;
            case 12:
                Tile41.setEnabled(state);
                break;
            case 13:
                Tile42.setEnabled(state);
                break;
            case 14:
                Tile43.setEnabled(state);
                break;
            case 15:
                Tile44.setEnabled(state);
                break;
        }
    }

    //Check for a win or loss - if all buttons are pressed, make decision based on score.
    //@Override
    public void checkEndGame() {
        if (!Tile1.isEnabled() && !Tile12.isEnabled() && !Tile13.isEnabled() && !Tile14.isEnabled()
                && !Tile21.isEnabled() && !Tile22.isEnabled() && !Tile23.isEnabled() && !Tile24.isEnabled()
                && !Tile31.isEnabled() && !Tile32.isEnabled() && !Tile33.isEnabled() && !Tile34.isEnabled()
                && !Tile41.isEnabled() && !Tile42.isEnabled() && !Tile43.isEnabled() && !Tile44.isEnabled()) 
{
            JOptionPane.showMessageDialog(rootPane,
                    " Congratulations!        \n"
                    + "You finished the game successfully \n"
                    + "You Win!\n");
                   
        }
    }

    //every tile that is pressed on the board uses this in order to make decisions in the game.
    //    @Override
    public void buttonPress(int ID, int type) {
        if (count == 0) {
            showTileShape(ID, type);//call
            ID_Guess1 = ID;
            type_Guess1 = type;
            count++;
            //supposed to clear the 2 wrong tiles from the time before
            if (!match) {
                hideSelectedTile(PrevID_Guess1);//call
                hideSelectedTile(PrevID_Guess2);//call
            }
        } else if (count == 1) {
            showTileShape(ID, type);//call
            ID_Guess2 = ID;
            type_Guess2 = type;
            PrevID_Guess1 = ID_Guess1;
            PrevID_Guess2 = ID_Guess2;

            //System.out.println("GUESS 2 ** Location2: " + ID + ", Shape_Code: " + type);
            //before matching test if the same tile was pressed twice.  that's cheating.
            if (ID_Guess1 == ID_Guess2) {

                hideSelectedTile(ID_Guess1);//call
                ID_Guess1 = 100;
                ID_Guess2 = 100;
                PrevID_Guess1 = 100;
                PrevID_Guess2 = 100;
                buttonEnabledSwitch(true, ID_Guess1);//call
            } else {
                match = testMatch(type_Guess1, type_Guess2);

                if (match) {
                    buttonEnabledSwitch(false, ID_Guess1);//call
                    buttonEnabledSwitch(false, ID_Guess2);//call
                    checkEndGame();
                }
                count = 0;
            }
            
        }
        
        //checkEndGame();
    }

    //Shows the shapes to the player for a small duration of time, then trturns the buttons to blank again.
    public void flashShapes() {
        Thread thread = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i <= 15; i++) {
                        int type = get4x4TileType(i);
                        showTileShape(i, type);//ماتطلع الصور فقط تطلع الصوره البيضاء 
                    }
                    Thread.sleep(2000);
                    wipeBoard();
                } catch (InterruptedException ex) {
                    Logger.getLogger(GameBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        thread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton QuitButton;
    public javax.swing.JButton Tile1;
    public javax.swing.JButton Tile12;
    public javax.swing.JButton Tile13;
    public javax.swing.JButton Tile14;
    public javax.swing.JButton Tile21;
    public javax.swing.JButton Tile22;
    public javax.swing.JButton Tile23;
    public javax.swing.JButton Tile24;
    public javax.swing.JButton Tile31;
    public javax.swing.JButton Tile32;
    public javax.swing.JButton Tile33;
    public javax.swing.JButton Tile34;
    public javax.swing.JButton Tile41;
    public javax.swing.JButton Tile42;
    public javax.swing.JButton Tile43;
    public javax.swing.JButton Tile44;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables

    
    ImageIcon Circle = new ImageIcon(getClass().getResource("/memorygame/MGshapes/Circle.png"));
    ImageIcon Cross = new ImageIcon(getClass().getResource("/memorygame/MGshapes/Cross.png"));
    ImageIcon Diamond = new ImageIcon(getClass().getResource("/memorygame/MGshapes/Diamond.png"));
    ImageIcon Donut = new ImageIcon(getClass().getResource("/memorygame/MGshapes/Donut.png"));
    ImageIcon Eclipse = new ImageIcon(getClass().getResource("/memorygame/MGshapes/Eclipse.png"));
    ImageIcon Square = new ImageIcon(getClass().getResource("/memorygame/MGshapes/Square.png"));
    ImageIcon Star = new ImageIcon(getClass().getResource("/memorygame/MGshapes/Star.png"));
    ImageIcon X = new ImageIcon(getClass().getResource("/memorygame/MGshapes/X.png"));
    public ImageIcon Blank = new ImageIcon(getClass().getResource("/memorygame/MGshapes/blankTile.png"));



    int count = 0;                              //1 for first tile flipped, 2 for second.  if 2, check match.
    int ID_Guess1 = 100, ID_Guess2 = 100;       //the locations of the 2 tiles the user guessed.  if !match, remove icons at these 2 locations.
    int type_Guess1, type_Guess2;               //the ShapeCodes for the 2 guesses.  used for testing a match. 
    boolean match;                              //catches the result from testMatch sub.
    int PrevID_Guess1;                          //these 2 are used to store the 2 tiles from the LAST matching, to know which (locations) to 
    int PrevID_Guess2;                          //return to blanks when a new matching has started.
        
    
    
    //these hold the positions (ID) of each of the shapes and their pair.
    //this ID is handed out from initShuffleTiles() randomCollection array.
    int circle1, circle2;
    int cross1, cross2;
    int diamond1, diamond2;
    int dice1 , dice2;
    int donut1, donut2;
    int eclipse1, eclipse2;
    int eclipse3, eclipse4;
    int grapes1, grapes2;
    int heart1, heart2;
    int L1, L2;
    int rectangle1, rectangle2;
    int snowflake1, snowflake2;
    int sqdonut1, sqdonut2;
    int square1, square2;
    int star1, star2;
    int tear1, tear2;
    int triangle1, triangle2;
    int X1, X2;
    
    
    //========================================================================================
    //          4X4 GAME BOARD TILE CONTROL
    //========================================================================================
    
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    @Override
    public void initShuffleTiles(){
        int n = 0;

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        //assign each shape their locations
        circle1 = randomCollection.get(n);
        n++;
        circle2 = randomCollection.get(n);
        n++;
        cross1 = randomCollection.get(n);
        n++;       
        cross2 = randomCollection.get(n);
        n++   ;   
        diamond1 = randomCollection.get(n);
        n++;
        diamond2 = randomCollection.get(n);
        n++; 
        donut1 = randomCollection.get(n);
        n++;
        donut2 = randomCollection.get(n);
        n++;
        eclipse1 = randomCollection.get(n);
        n++;
        eclipse2 = randomCollection.get(n);
        n++; 
        square1 = randomCollection.get(n);
        n++;
        square2 = randomCollection.get(n);
        n++;
        star1 = randomCollection.get(n);
        n++;
        star2 = randomCollection.get(n);
        n++;
        X1 = randomCollection.get(n);
        n++;
        X2 = randomCollection.get(n);
        n++; 
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get4x4TileType(int ID){
        int type = 100;
        
        if (ID == circle1 || ID == circle2){
            type = 0;
        }
        else if (ID == cross1 || ID == cross2){
            type = 1;
        }
        else if (ID == diamond1 || ID == diamond2){
            type = 2;
        }
        else if (ID == donut1 || ID == donut2){
            type = 3;
        }
        else if (ID == eclipse1 || ID == eclipse2){
            type = 4;
        }
        else if (ID == square1 || ID == square2){
            type = 5;      
        }
        else if (ID == star1 || ID == star2){
            type = 6;
        }
        else if (ID == X1 || ID == X2){
            type = 7;
        }
        System.out.println();
        
        return type;
    }
}
