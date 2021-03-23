package com.adilah.tugasm3;
import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        String nama;
        int pilMenu;
        Scanner scanNama = new Scanner(System.in);
        Scanner scanMenu = new Scanner(System.in);

        System.out.println("                  CAFE CERIA   ");
        System.out.println("                ANEKA MINUMAN  ");
        String line = new String(new char[45]).replace('\0', '-');
        System.out.println(line);

        System.out.println("   \t\t\t\tSPECIAL MENU");
        System.out.println(" \t\t\t\t1. Soft Drinks\n \t\t\t\t2. Mix Juice\n \t\t\t\t3. Nescafe\n \t\t\t\t4. Soda Milk\n \t\t\t\t5. Tea");
        System.out.println(line);

        System.out.print("Masukkan Nama Pembeli : ");
        nama = scanNama.nextLine();
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        pilMenu = scanMenu.nextInt();

        switch (pilMenu) {
            case 1 :
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                break;
            case 2 :
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                break;
            case 3 :
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4 :
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                break;
            case 5 :
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Pilihan Anda tidak ada dalam menu");
        }
        if (pilMenu < 5) {
            System.out.println(line);
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terima kasih " +nama+ " telah berkunjung di Cafe Ceria");
        }
    }
}