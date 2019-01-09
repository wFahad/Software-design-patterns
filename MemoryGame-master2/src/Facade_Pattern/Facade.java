/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade_Pattern;

import Match_Game.GameBoard;
import Match_Game.GameBoard2;
import State_Pattern.state;

/**
 *
 * @author wejdan
 */
public class Facade {
    private Ifacade board;
    private Ifacade board2; 
    
    public Facade(){
        board = new GameBoard();
        board2 = new GameBoard2();
        
    }
    
    public void Shuffle4x4(){
        board.initShuffleTiles();
    }
    
    public void Shuffle6x6(){
        board2.initShuffleTiles();
    }
    
}
