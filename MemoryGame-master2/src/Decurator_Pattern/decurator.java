/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decurator_Pattern;

import State_Pattern.Context;
import java.awt.Color;
import javax.swing.JOptionPane;
import State_Pattern.state;


/**
 *
 * @author wejdan
 */
public abstract class decurator implements Idecurator{
    protected Idecurator ObjDec;

    public decurator(Idecurator ConsObjDec){
      this.ObjDec = ConsObjDec;
      
   }
     
    @Override
     public void HowToPlay(){
         ObjDec.HowToPlay();
     }
    
}
