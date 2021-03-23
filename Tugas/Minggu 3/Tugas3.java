package com.adilah.tugasm3;

public class Tugas3 {
    public static void main(String[] args) {
        int[][] number = {{5,6,1,7}, {8,1,2,9}, {5,4,7,1}, {8,3,7,5}};

        for (int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(number[baris][kolom] + " ");
            }
            System.out.println(" ");
        }
    }
}