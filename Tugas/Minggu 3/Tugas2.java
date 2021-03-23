package com.adilah.tugasm3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Random randNumber = new Random();
        ArrayList<Integer> arrNumber = new ArrayList<>();

        System.out.print("Masukkan panjang array : ");

        int arrSize = new Scanner(System.in).nextInt();

        for (int i = 0; i < arrSize; i++) {
            int number = randNumber.nextInt(10) + 1;
            arrNumber.add(number);
        }
        System.out.println(arrNumber);
    }
}