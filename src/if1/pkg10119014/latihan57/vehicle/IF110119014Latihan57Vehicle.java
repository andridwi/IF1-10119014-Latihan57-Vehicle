/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan57.vehicle;

/**
 *
 * @author Andri
 * Nama : ANdri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bicycle;
        Skateboard skateboard;
        
        bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        System.out.println("Brand : " + bicycle.getBrand());
        System.out.println("Model : " + bicycle.getModel());
        bicycle.setGearCount(23);
        System.out.println("Jumlah Gear : " + bicycle.getGearCount());
      
        System.out.println();
      
        skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        System.out.println("Brand : " + skateboard.getBrand());
        System.out.println("Model : " + skateboard.getModel());
        skateboard.setBoardLength(54.5);
        System.out.println("Jumlah Gear : " + skateboard.getBoardLength());
    }
    
}
