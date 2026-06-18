/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/

package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public abstract class Karyawan {
   
    protected String nik;
    protected String nama;
    
    public Karyawan(){
    
    }

    public Karyawan(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public void tampilData() {
        System.out.println("NIK  : " + nik);
        System.out.println("Nama : " + nama);
    } 
}
