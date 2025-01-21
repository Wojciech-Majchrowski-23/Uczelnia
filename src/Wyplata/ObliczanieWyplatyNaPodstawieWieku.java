package Wyplata;

import Osoba.Pracownik;

import java.io.Serializable;

public class ObliczanieWyplatyNaPodstawieWieku implements ObliczanieWyplaty, Serializable {

    public int obliczWyplate(Pracownik pracownik){

        int wyplata;

        wyplata = pracownik.getWiek() * 200;

        return wyplata;
    }
}
