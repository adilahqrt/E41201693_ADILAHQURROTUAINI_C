package com.adilah.tugasm4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        ArrayList<Integer> dataNilai = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan banyaknya data nilai = ");

        int banyakData = scan.nextInt();
        int inpNilai;

        for (int x = 0; x < banyakData; x++) {
            System.out.printf("Masukkan data nilai ke-%d = ", x + 1);

            inpNilai = scan.nextInt();
            dataNilai.add(inpNilai);
        }

        int minValue = Collections.min(dataNilai);
        int maxValue = Collections.max(dataNilai);

        System.out.println("\nNilai minimum = " + minValue);
        System.out.println("Nilai maksimum = " + maxValue);

        int total = dataNilai.stream().mapToInt(num -> num).sum();
        int average = total / banyakData;
        System.out.println("Nilai rata ratanya adalah = " + average);
    }
}