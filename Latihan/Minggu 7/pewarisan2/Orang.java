package com.adilah.pewarisan2;

public class Orang {
    private String nama;
    private double tinggi;
    private double berat;

    public Orang (String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String toString() {
        return ("Nama\t: " + nama + "\nTinggi\t: " + tinggi + "\nBerat\t: " + berat);
    }
}