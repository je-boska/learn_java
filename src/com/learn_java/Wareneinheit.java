package com.learn_java;

public class Wareneinheit {
    private int aktuelleMenge;
    private int maxMenge;
    private int anzahlTransaktionen;
    private boolean aktivStatus;

    public Wareneinheit() {
        this.aktuelleMenge = 0;
        this.maxMenge = 0;
        this.anzahlTransaktionen = 0;
        this.aktivStatus = false;
    }

    public Wareneinheit(int startMenge) {
        if (startMenge > 0) {
            this.aktuelleMenge = startMenge;
            this.maxMenge = startMenge;
            this.anzahlTransaktionen = 1;
            aktivStatus = true;
        } else {
            this.aktuelleMenge = 0;
            this.maxMenge = 0;
            this.anzahlTransaktionen = 0;
            aktivStatus = false;
        }
    }

    public int getAktuelleMenge() {
        return aktuelleMenge;
    }

    public int getMaxMenge() {
        return maxMenge;
    }

    public int getAnzahlTransaktionen() {
        return anzahlTransaktionen;
    }

    public boolean getAktivStatus() {
        return aktivStatus;
    }

    public void aktualisiereMenge(int neueMenge) {
        anzahlTransaktionen++;
        if (neueMenge > 0) {
            aktuelleMenge = neueMenge;
            if (aktuelleMenge > maxMenge) {
                maxMenge = aktuelleMenge;
            }
            aktivStatus = true;
        } else {
            aktuelleMenge = 0;
            aktivStatus = false;
        }
    }

    public void resetWareneinheit() {
        anzahlTransaktionen = 0;
        aktuelleMenge = 0;
        maxMenge = 0;
        aktivStatus = false;
    }

    public void einheitAusgeben() {
        System.out.print("Aktuelle Menge: " + aktuelleMenge + ", ");
        System.out.print("Maximale Menge: " + maxMenge + ", ");
        System.out.print("Anzahl der Transaktionen: " + anzahlTransaktionen + ", ");
        System.out.print("Aktivstatus: " + aktivStatus);
        System.out.println();
    }
}
