package com.adilah.tugasm4;

public class Tugas2 {
    public static void main(String[] args) {

        System.out.println("\t\tDo__While\nBilangan Perkalian 2 (1-100)");
        String line = new String(new char[27]).replace('\0', '=');
        System.out.println(line);

        int a = 2;
        int b = 2;

        do {
            a++;
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        } while (a <= 100);

        System.out.println("\n\n\t\tDo__While\nBilangan Kelipatan 2 (1-100)");
        System.out.println(line);

        do {
            System.out.print(b + " ");
            b += b;
        } while (b < 100);
    }
}