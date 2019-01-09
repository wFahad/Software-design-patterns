/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Pattern;

import Memento_Pattern.Memento;

/**
 *
 * @author wejdan
 *///memento
public class Originator {
    
    private String state;

   public void setState(String state){
      System.out.println("Originator: Setting state to " + state);
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento){
      state = memento.getState();
   }

   
}
