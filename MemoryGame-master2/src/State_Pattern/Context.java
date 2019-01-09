/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_Pattern;

/**
 *
 * @author wejdan
 *///state
public  class Context {
    
    private state currentState;
    
    public Context(){
      currentState = null;
   }
    
    public void setState(state WindowState){
        this.currentState = WindowState;
    }
}
