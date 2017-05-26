/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParqueDeEstacionamento;

import java.util.ArrayList;

/**
 *
 * @author n0ttt
 */
public class Section {
    
    private ArrayList<Lugar> Lugares = new ArrayList<>();
    
    public Section(ArrayList<Lugar> lugares) {
        Lugares = lugares;
    }
    
    public void setLugar(Lugar lugar) 
    {
        Lugares.add(lugar);
    }
    
    public Lugar getLugar(int n) {
        return Lugares.get(n);
    }
}
