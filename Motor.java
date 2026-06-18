/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public class Motor extends Kendaraan{
    double biaya = 250000;

    public Motor(String noPolisi) {
        super(noPolisi);
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
   public void tampilMotor(){
        System.out.println("Biaya Rental Motor : " + biaya);
    }

   @Override
   public  void biayaRental() {
    }
}
