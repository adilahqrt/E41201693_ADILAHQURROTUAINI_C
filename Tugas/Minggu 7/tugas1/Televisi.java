package com.adilah.tugas1;

import java.util.Arrays;

public class Televisi {
    private String deskripsi;
    private int maxChannel;

    private String[] channels;

    public Televisi() {

    }

    public Televisi(String name, int maxChannel) {
        this.deskripsi = name;
        this.maxChannel = maxChannel;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setChannelAktif(int activeChannel) {
        if (activeChannel >= maxChannel) {
            System.out.println("Channel yang Anda inginkan belum diset ");
        } else {
            System.out.printf("Pindah channel ke : %s\n", channels[activeChannel]);
        }
    }

    public void setVolume(int volume) {
        System.out.printf("Intensitas volume yang sekarang : %d\n", volume);
    }

    public void getChannels() {
        if (channels == null) {
            System.out.println("Belum ada channel yang diset!");
        } else {
            System.out.println(Arrays.toString(channels));
        }
    }

    public void setChannels(String[] channels) {
        if (channels.length > maxChannel) {
            System.out.printf("Maaf Tv ini hanya dapat menyimpan %d channel\n", maxChannel);
        } else {
            System.out.println("Informasi channel berhasil diupdate!");
            this.channels = channels;
        }
    }
}