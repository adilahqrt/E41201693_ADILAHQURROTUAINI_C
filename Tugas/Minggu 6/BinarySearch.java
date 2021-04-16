package com.adilah.bubble;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int k, angka;
        System.out.println("==BINARY SEARCH==");
        System.out.println();
        System.out.println("Data Array");

        boolean notFound = true;
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukan angka yang akan dicari : ");
        angka = sc.nextInt();

        int batasA = arr.length-1;
        int batasB = 0;

        while (notFound) {
            int posSekarang = (batasA + batasB) / 2;
            if (arr[posSekarang] == angka) {
                notFound = false;
                System.out.println("Angka " + angka + " ditemukan");
            } else if (batasB > batasA) {
                System.out.println("Angka " + angka + " tidak ditemukan");
                break;
            } else {
                if (arr[posSekarang] < angka) {
                    batasB = posSekarang + 1;
                } else {
                    batasA = posSekarang -1;
                }
            }
        }
    }
}