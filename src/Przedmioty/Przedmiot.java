package Przedmioty;

import java.io.Serializable;

public class Przedmiot implements Serializable {

    private String nazwa;
    private int ECTS, liczbaGodzin;
    private double ocena;

    public Przedmiot(String nazwa,  int ECTS,  int liczbaGodzin, int ocena) {
        this.nazwa = nazwa;
        this.ECTS = ECTS;
        this.liczbaGodzin = liczbaGodzin;
        this.ocena = ocena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getECTS() {
        return ECTS;
    }

    public int getLiczbaGodzin() {
        return liczbaGodzin;
    }

    public double getOcena() {return ocena;}


}
