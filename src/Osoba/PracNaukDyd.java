package Osoba;

import Wyplata.ObliczanieWyplaty;

public class PracNaukDyd extends Pracownik{

    private String przedmiotNauczany;

    public PracNaukDyd(String imie, String nazwisko, int wiek, String przedmiotNauczany) {
        super(imie, nazwisko, wiek);
        this.przedmiotNauczany = przedmiotNauczany;
    }

    public void info(){
        System.out.println("Pracownik naukowo-dydaktyczny, ");
        super.info();
        System.out.println("zarobek" + zarobek + "zl");
        System.out.println("uczy: " + przedmiotNauczany);
    }

    public void przywitanie(){
        System.out.println("Witam serdecznie, jestem Prof. Dr. inz. " + imie + " " + nazwisko + ". Milo mi Pana/Pania poznac.");
    }

    public String getPrzedmiotNauczany() {
        return przedmiotNauczany;
    }

    public void setPrzedmiotNauczany(String przedmiotNauczany) {
        this.przedmiotNauczany = przedmiotNauczany;
    }

}
