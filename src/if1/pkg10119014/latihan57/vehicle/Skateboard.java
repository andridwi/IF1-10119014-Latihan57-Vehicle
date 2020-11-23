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
class Skateboard extends Vehicle {
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("SkateBoard");
    }
    
    public double getBoardLength() {
        return this.myBoardLength;
    }
    
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }   
}
