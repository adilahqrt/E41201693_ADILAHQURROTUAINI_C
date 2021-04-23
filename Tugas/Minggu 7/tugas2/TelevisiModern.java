package com.adilah.tugas2;

import com.adilah.tugas1.Televisi;

public class TelevisiModern extends Televisi{
    static final String TELETEXT = "Teletext";
    static final String TV = "Televisi";

    private String modusTampilan;
    private String cdPlay;
    private String discTray;

    TelevisiModern(String deskripsi, int maxChannel) {
        super(deskripsi, maxChannel);
    }

    public void setModusTampilan(String modusTampilan) {
        System.out.printf("Modus Tampilan : %s\n", modusTampilan);
        this.modusTampilan = modusTampilan;
    }

    public void setHalamanTeletext(int halTeletext) {
        System.out.printf("Berpindah ke halaman teletext %d\n", halTeletext);
    }

    public void playCD() {
        if (discTray == null) {
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.printf("Memutar Film %s", discTray);
        }
    }

    public void setDiscTray(String discTray) {
        this.discTray = discTray;
    }
}