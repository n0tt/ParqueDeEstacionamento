/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParqueDeEstacionamento;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author n0ttt
 */
public class main extends JFrame {
    
    public static final int nLugares = 10;
    public static final int nSections = 10;
    public static final int nFloors = 10;
    
    public static ArrayList<Floor> Floor = new ArrayList<Floor>();

    public static void main(String[] args) {
        
        for(int f = 0; f < nFloors; f++) {
            
            for(int s = 0; s < nSections; s++) {
                
                for(int l = 0; l < nLugares; l++) {
                    
                }
                
                
            }
        }
        System.out.println("Hello");
    }
    
}
