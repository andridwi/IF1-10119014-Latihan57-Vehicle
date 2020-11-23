/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan57.vehicle;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
class Bicycle extends Vehicle{
  private int myGearCount;
    
    public Bicycle() {
        super();
        System.out.println("Bicycle");
    }
    
    public int getGearCount() {
        return this.myGearCount;
    }
    
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }   
}
