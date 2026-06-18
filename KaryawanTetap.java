/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public class KaryawanTetap extends Karyawan {
    int golongan;
    double gajiPokok;
    double tunjangan;

    public KaryawanTetap(int golongan, double gajiPokok, double tunjangan, String nik, String nama) {
        super(nik, nama);
        this.golongan = golongan;
       
        if (this.golongan == 1) {
            this.gajiPokok = 3000000;
        } else if (this.golongan == 2) {
            this.gajiPokok = 5000000;
        } else if (this.golongan == 3) {
            this.gajiPokok = 7000000;
        } else {
            this.gajiPokok = gajiPokok; 
        }
        
        this.tunjangan = 0.12 * this.gajiPokok;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void tampilTetap() {
        tampilData(); 
        
        System.out.println("Golongan     : " + this.golongan);
        System.out.println("Gaji Pokok   : " + this.gajiPokok);
        System.out.println("Tunjangan    : " + this.tunjangan);
        System.out.println("Total Gaji   : " + (this.gajiPokok + this.tunjangan));
    }
}
