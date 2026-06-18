/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public class MainKaryawan {
    public static void main(String[] args) {

    System.out.println("=== KARYAWAN TETAP ===");
    
    KaryawanTetap karyawantetap = new KaryawanTetap(3, 0, 0, "12345678", "Rahmi");
   
    karyawantetap.tampilTetap();


    System.out.println("\n=== KARYAWAN KONTRAK ===");
    
   
    KaryawanKontrak karyawankontrak = new KaryawanKontrak(2500000, "200", "Doni");
    karyawankontrak.tampilKontrak();
    
    }
}
