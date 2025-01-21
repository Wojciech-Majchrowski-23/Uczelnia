package Osoba;

import java.io.Serializable;

public abstract class Osoba implements Serializable{

    protected String imie, nazwisko;
    protected int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void info(){
        System.out.println(imie + ", " + nazwisko + ", " + wiek + " lat, ");
    }

    public void przywitanie(){};

    //gettery i settery
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

}
