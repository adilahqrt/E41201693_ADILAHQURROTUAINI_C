package com.adilah.tugasm3;

import java.util.Scanner;
import java.util.ArrayList;

public class Tugas4 {

     static ArrayList<Integer> hBItem = new ArrayList<>();

    public static void main(String[] args) {

        String line = new String(new char[55]).replace('\0', '-');
        System.out.println(line);
        System.out.println("            Kharisma Agung Plaza < KAP >      ");
        System.out.println("              Promo Belanja Berhadiah         ");
        System.out.println("           Khusus Pembelian 5 Barang Pertama  ");
        System.out.println("            Dengan Harga Minimum Rp. 10000    ");
        System.out.println(line);

        Scanner textScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Masukkan nama pembeli : ");
        String customerName = textScanner.next();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Masukkan harga barang ke-%d\t: ", i + 1);
            int hargaBrg = numberScanner.nextInt();
            hBItem.add(hargaBrg);
        }

        int totalPrice = hBItem.stream().mapToInt(num -> num).sum();

        System.out.printf("Total harga pembelian atas nama %s adalah Rp %d", customerName, totalPrice);

        if (isGetBonus()) {
            System.out.print("\n\nSelamat...\n");
            System.out.println("Anda mendapat hadiah 1 mug cantik      ");
            System.out.println(line);
            System.out.println("                 Terima Kasih                ");
            System.out.println("Anda sudah berbelanja di Kharisma Agung Plaza");
        } else {
            System.out.println("\n"+line);
            System.out.println("                 Terima Kasih                ");
            System.out.println("Anda sudah berbelanja di Kharisma Agung Plaza");
        }
    }

    static boolean isGetBonus() {
        boolean isBonus = true;

        for (int price : hBItem) {
            if (price < 10000) {
                isBonus = false;
                break;
            }
        }
        return isBonus;
    }
}