package com.adilah.tugasm4;

import java.util.ArrayList;

public class Tugas2 {
    public static void main(String[] args) {
        ArrayList<Integer> saveNum = new ArrayList<>();

        /*
            MAX_NUMBER ini angka maksimal, bersifat final karena dia konstanta
         */
        final int MAX_NUMBER = 100;

        /*
            currentNumber ini angka awal / terkecilnya
         */
        int currentNumber = 1;

        /*
            disini make do-while
            do-while akan melakukan suatu statement paling tidak 1x
            meskipun kondisinya sudah tidak terpenuhi
         */
        do {
            /*
                pertama simpan terlebih dahulu nilai awal dari currentNumber
             */
            saveNum.add(currentNumber);

            /*
                kemudian tambahkan currentNumber dengan diri sendiri
                misal:
                currentNumber = 1;
                berarti:
                currentNumber += currentNumber
                atau
                currentNumber = currentNumber + currentNumber;

                itu berarti currentNumber = 1 + 1;

                dan nilai currentNumber akan berubah sesuai dengan hasil penjumlahan
                currentNumber = 2;

                habis itu ditambah lagi

                currentNumber += currentNumber;
                berarti 2 + 2;
                begitu terus
             */
            currentNumber += currentNumber;
        } while(currentNumber < MAX_NUMBER); // ini kondisi yg akan menjadi batas looping

        System.out.println("\t\tDo__While\nBilangan kelipatan 2 (1-100)");
        String line = new String(new char[27]).replace('\0', '=');
        System.out.println(line);
        System.out.println(saveNum.toString());
    }
}
