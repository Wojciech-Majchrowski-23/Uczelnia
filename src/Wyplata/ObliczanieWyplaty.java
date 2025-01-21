package Wyplata;

import Osoba.Pracownik;

import java.io.Serializable;

public interface ObliczanieWyplaty {
    int obliczWyplate(Pracownik pracownik) throws WyplataException;
}
