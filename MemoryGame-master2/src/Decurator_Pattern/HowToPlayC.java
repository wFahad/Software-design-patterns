/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decurator_Pattern;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import State_Pattern.state;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

/**
 *
 * @author wejdan
 */
public class HowToPlayC extends decurator {

    public HowToPlayC(Idecurator ConsObjDic) {
        super(ConsObjDic);
    }

    

    @Override
    public void HowToPlay() {
        super.HowToPlay();
        setLink();
    }

    public void setLink() {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.youtube.com/watch?v=QsLG-1CbfTQ"));
        } catch (IOException err) {

        } catch (URISyntaxException err) {

        }
    }

//    @Override
//    public void checkEndGame(){
//        super.checkEndGame();
//         JOptionPane.showMessageDialog(null, "                        Congratulations!        \n"
//                    + "You finished the game successfully \n"
//                    + "You Win!\n");
    //setWinWendow(ObjState);
//        JButton quit = new JButton("quit");
//        quit.setBackground(Color.red);
    //quit.addActionListener(new );
}

//
// class HandelarClass implements ActionListener {
//    
//        @Override
//        public void actionPerformed(ActionEvent e){
//            System.exit(0);
//        }
//}
//    public void setWinWendow(state stateObj){
//                  JOptionPane.showMessageDialog(null, "                        Congratulations!        \n"
//                    + "You finished the game successfully \n"
//                    + "You Win!\n");
//    }
//@Override
//    public void operation() {
//ObjState.operation();
//       JOptionPane.showMessageDialog(null, "Welcome To You In Mmory Match Game ...");
//          JOptionPane.showMessageDialog(null, "                        Congratulations!        \n"
//                    + "You finished the game successfully \n"
//                    + "You Win!\n");
//        
//Welcome_Dialog b = new Welcome_Dialog();
//        ObjJFrame.setPreferredSize(new Dimension(500,500)); //need to use this instead of setSize
//        ObjJFrame.setLocation(500, 250);
//        ObjJFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//        ObjJFrame.pack();
//        ObjJFrame.setVisible(true);
//JOptionPane.showMessageDialog(null, "Welcome to you in "+MainMenu0.Start4x4Button.getText()+" ... ");     
//1. Create the frame.
//JFrame frame = new JFrame("FrameDemo");
//
////2. Optional: What happens when the frame closes?
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
////3. Create components and put them in the frame.
////...create emptyLabel...
//frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
//
////4. Size the frame.
//frame.pack();
//
////5. Show it.
//frame.setVisible(true);

