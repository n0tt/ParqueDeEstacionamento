/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParqueDeEstacionamento;

/**
 *
 * @author n0ttt
 */
public class Lugar {
    
    private int lFloor;
    private int lSection;
    private int lStatus; // 0 - Livre | 1- Ocupado
    
    public Lugar(int floor, int section)
    {
        this.lFloor = floor;
        this.lSection = section;
    }
    
    /**
     *
     * @return floor
     */
    public int getFloor()
    {
        return this.lFloor;
    }
    
    /**
     *
     * @param floor
     * @return floor
     */
    public int setFloor(int floor)
    {
        return (this.lFloor = floor);
    }
    
    /**
     *
     * @return section
     */
    public int getSection()
    {
        return this.lSection;
    }
    
    /**
     *
     * @param section
     * @return section
     */
    public int setSection(int section)
    {
        return (this.lSection = section);
    }
    
    /**
     *
     * @return
     */
    public int getStatus()
    {
        return this.lStatus;
    }
    
    /**
     *
     * @param section
     * @return section
     */
    public int setSecion(int section)
    {
        return (this.lSection = section);
    }
}
