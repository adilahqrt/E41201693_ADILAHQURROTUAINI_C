package com.adilah.pewarisan;

public class Demo {
    public static void main(String[] args) {
        A superclass = new A();
        B subB = new B();

        System.out.println("SuperClass");
        subB.x = 15;
        subB.y = 25;
        subB.TampilkanNilaiXY();

        System.out.println("SubClass");
        subB.x = 20;
        subB.y = 30;
        subB.TampilkanNilaiXY();

        //member tambahan yg hanya ada pada subclass
        subB.z = 45;
        subB.TampilkanJumlah();

    }
}
