/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
*/
package com.mycompany.praktikum21052026;

import java.util.Scanner;

/**
 *
 * @author Rahmi Aulia
 */
public class MainPembayaran {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Pembayaran pembayaran = null;
        
        System.out.println("Sistem Pembayaran Toko Rahmi");
        System.out.println("----------------------------");
        System.out.print("Masukkan Id Transaksi:");
        String id  = input.nextLine();
        
        System.out.print("Masukkan Total Pembayaran:");
        double jumlah = input.nextDouble();
        input.nextLine();//clear buffer
        
        System.out.println("\n Pilihan Metode Pembayaran");
        System.out.println("1. Pembayaran secara tunai");
        System.out.println("2. pembayaran secara transfer");
        System.out.println("3. Pembayaan Menggunakan kartu kredit");
        System.out.println("4. Penmbayaran menggunakan E-Wallet");
        System.out.print("Pilihan aAnda(1-4):");
        int pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1: System.out.print("Inputkan jumlah uang:");
                    double uang = input.nextDouble();
                    pembayaran = new PembayaranTunai(uang,jumlah,id);
                    break;
                    
            case 2: System.out.print("Masukkan nama bank:");
                    String nama = input.nextLine();
                    pembayaran = new PembayaranTransfer(nama,jumlah,id);
                      break;
                   
                  
            case 3: System.out.print("Masukkan nama kartu(Mastercard,Visacard:");
                    String namaKartu = input.nextLine();
                    System.out.print("Masukkan no Kartu:");
                    String no = input.nextLine();
                    pembayaran = new PembayaranKartuKredit(no,namaKartu,jumlah,id);
                      break;
                    
            case 4: System.out.print("Masukkan nama E-Wallet(Ovo,Dana,ShoopeePay):");
                    String ewallet = input.nextLine();
                    pembayaran = new PembayaranTransfer(ewallet,jumlah,id);
                      break;
        }

         System.out.println("Kondirmasi pembayaran");
         pembayaran.prosesPembayaran();  
         
    }
}
