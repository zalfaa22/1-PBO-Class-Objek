/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1.pkgnew;

/**
 *
 * @author Fafa
 */
public class Modul1New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat object
        Mobil mobil1 = new Mobil();
        mobil1.mogok();
        
        Mobil mobil2 = new Mobil("Pertamax", 6, 100);
        mobil2.berjalan();
    }
    
}
