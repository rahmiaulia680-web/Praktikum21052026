/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public abstract class Kendaraan {
    protected String noPolisi;

    public Kendaraan(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }
    

    public void tampilData() {
        System.out.println("No Polisi : " + noPolisi);
    }
  
    public abstract void biayaRental();

}
