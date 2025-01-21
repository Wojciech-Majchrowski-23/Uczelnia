package Osoba;

import Wyplata.ObliczanieWyplaty;

public class PracAdmin extends Pracownik{

    String stanowisko;

    public PracAdmin(String imie, String nazwisko, int wiek, String stanowisko){
        super(imie, nazwisko, wiek);
        this.stanowisko = stanowisko;
    }

    public void info(){
        System.out.println("Pracownik administracyjny, ");
        super.info();
        System.out.println("stanowisko: " + stanowisko);
    }

    public void przywitanie(){
        System.out.println("Dzien dobry, jestem " + imie + " " + nazwisko + ". Pracuje na stanowisku: " + stanowisko + ". Jak moge pomoc?");
    }

    public String getStanowisko(){
        return stanowisko;
    }
    public void setStanowisko(String stanowisko){
        this.stanowisko = stanowisko;
    }
}
