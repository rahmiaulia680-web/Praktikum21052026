/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/

package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public class KaryawanKontrak extends Karyawan{
    double honorKontrak;
    double uangMakan = 300000;

    public KaryawanKontrak(double honorKontrak, String nik, String nama) {
        super(nik, nama);
        this.honorKontrak = honorKontrak;
    }

   public void tampilKontrak() {
        tampilData();

        System.out.println("Honor Kontrak : " + honorKontrak);
        System.out.println("Uang Makan    : " + uangMakan);
        System.out.println("Total Gaji    : " + (honorKontrak + uangMakan));
    }
}
