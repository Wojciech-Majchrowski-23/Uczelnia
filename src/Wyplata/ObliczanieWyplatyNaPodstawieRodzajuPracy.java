package Wyplata;

import Osoba.PracAdmin;
import Osoba.Pracownik;

import java.io.Serializable;

public class ObliczanieWyplatyNaPodstawieRodzajuPracy implements ObliczanieWyplaty, Serializable {

    public int obliczWyplate(Pracownik pracownik) {

        int wyplata;

        if(pracownik instanceof PracAdmin){
            wyplata = 6000;
        }
        else{
            wyplata = 12000;
        }
        return wyplata;
    }

}
