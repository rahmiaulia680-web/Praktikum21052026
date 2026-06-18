/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public class Mobil extends Kendaraan{
    int  biayaRental = 500000;

    public Mobil(String noPolisi) {
        super(noPolisi);
    }

    public double getBiayaRental() {
        return biayaRental;
    }

    public void setBiayaRental(double biayaRental) {
        this.biayaRental = (int) biayaRental;
    }
    
    public void tampilMobil(){
        tampilData();
        System.out.println("Biaya Rental Mobil : " + biayaRental);
    }

    @Override
    public void biayaRental() {
    }
  
}
