package com.adilah.pewarisan;

public class B extends A { //mendeklarasikan class B yg diturunkan dr class A
    int z;

    void TampilkanJumlah() {
        //subclass mengakses member dari superclass
        System.out.println("Jumlah : " + (x + y + z));
    }
}
