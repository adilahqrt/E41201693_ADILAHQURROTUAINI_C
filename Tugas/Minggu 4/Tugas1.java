package com.adilah.tugasm4;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.print("Masukkan batas akhir bilangan genap : ");
        input = scan.nextInt();

        for (int a = 0; a <= input; a++){
            if (a % 2 == 0) {
                System.out.print(a + "\t");
            }
        }
    }
}