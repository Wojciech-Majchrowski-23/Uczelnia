package Osoba;

import Wyplata.*;

import java.util.Scanner;

public abstract class Pracownik extends Osoba {

    protected ObliczanieWyplaty wyplataStrategy;
    int zarobek;

    public Pracownik(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
        wyplataStrategy = setWyplataStrategy();
        while(zarobek == 0) {
            try {
                zarobek = wyplataStrategy.obliczWyplate(this);
            } catch (WyplataException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("zarobek: " + zarobek);
    }

    public ObliczanieWyplaty setWyplataStrategy(){
        System.out.println("W jaki sposob chcesz obliczac wyplate dla tego pracownika?\n" +
                "1. Na podstawie wieku\n2. Na Podstawie Rodzaju Pracy\nDeaufult - wprowadzanie reczne\nChoice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                wyplataStrategy = new ObliczanieWyplatyNaPodstawieRodzajuPracy();
                break;
            }
            case 2: {
                wyplataStrategy = new ObliczanieWyplatyNaPodstawieWieku();
                break;
            }
            default: {
                wyplataStrategy = new ObliczanieWplatyRecznie();
                break;
            }
        }
        return wyplataStrategy;
    }

    public void info(){
        super.info();
        System.out.println("zarobek" + zarobek + ", ");
    }

    public void przywitanie(){};

    public void setZarobek() {

        try {
            this.zarobek = setWyplataStrategy().obliczWyplate(this);
        } catch (WyplataException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public int getZarobek() {
        return zarobek;
    }
}
