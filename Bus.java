/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
 package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public class Bus extends Kendaraan {
    double biaya = 800000;

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public Bus(String noPolisi) {
        super(noPolisi);
    }
    public void tampilBus(){
        tampilData();
        System.out.println("Biaya Rental Bus : " + biaya);
    
    }
     
    @Override
    public void biayaRental() {
      
    }

}
