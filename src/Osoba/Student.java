package Osoba;

import Przedmioty.Przedmiot;

import java.util.ArrayList;
import java.util.Observer;
import Observer.Subject;

public class Student extends Osoba {

    private String kierunek;
    private int semestr;
    private String id;

    private ArrayList<Przedmiot> przedmioty;

    public Student(String imie, String nazwisko, int wiek, String kierunek, int semestr, String id) {
        super(imie, nazwisko, wiek);
        this.kierunek = kierunek;
        this.semestr = semestr;
        this.id = id;

        przedmioty = new ArrayList<>();
    }

    public void info(){
        System.out.println("Student");
        super.info();
        System.out.println(kierunek + " " + semestr + " semestr " + semestr + " id: " + id);

        if(!przedmioty.isEmpty()){
            System.out.println("Przedmioty Studenta: ");
            for(Przedmiot p : przedmioty){
                System.out.println(p.getNazwa() + ", liczba ECTS: " + p.getECTS() + ", liczba godzin: "
                        + p.getLiczbaGodzin() + ", ocena: " + p.getOcena()+ ", zagrozenie: " +p.isCzyZagrozenie());
            }
        }
    }

    public void przywitanie(){
        System.out.println("Siema, jestem " + imie + " " + nazwisko + ". Jak leci?");
    }


    public String getKierunek() {
        return kierunek;
    }
    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }
    public int getSemestr() {
        return semestr;
    }
    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public ArrayList<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }
    public void addPrzedmiot(Przedmiot przedmiot) {
        przedmioty.add(przedmiot);
    }
}
