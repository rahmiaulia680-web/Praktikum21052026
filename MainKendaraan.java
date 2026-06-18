/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum21052026;

/**
 *
 * @author Rahmi Aulia
 */
public class MainKendaraan {
     public static void main(String[] args) {
        // TODO code application logic here
  
        System.out.println("=== DATA MOBIL Rahmi ===");

        Mobil mobil = new Mobil("BR 1369 CKA");
         mobil.tampilMobil();

        System.out.println("\n=== DATA MOTOR Rahmi ===");

        Motor motor = new Motor("BS 6789 DNA");
         motor.tampilMotor();

        System.out.println("\n=== DATA BUS Rahmi ===");

        Bus bus = new Bus("BP 09876 AU");
        bus.tampilBus();
    }
}
