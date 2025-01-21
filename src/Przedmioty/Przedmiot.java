package Przedmioty;

import Observer.Subject;
import Observer.*;

import java.io.Serializable;
import java.util.ArrayList;

public class Przedmiot implements Serializable, Subject {

    private String nazwa;
    private int ECTS, liczbaGodzin;
    private double ocena;
    private boolean czyZagrozenie = false;

    private ArrayList<Observer> ObserverList = new ArrayList<Observer>();

    public Przedmiot(String nazwa, int ECTS,  int liczbaGodzin, double ocena) {
        this.nazwa = nazwa;
        this.ECTS = ECTS;
        this.liczbaGodzin = liczbaGodzin;
        this.ocena = ocena;
        ZagrozenieSetter zagrozenieSetter = new ZagrozenieSetter(this);
    }

    //--------------SubjectMethods-----------------
    public void registerObserver(Observer observer){
        ObserverList.add(observer);
    };
    public void removeObserver(Observer observer){};
    public void notifyObservers(){
        for(Observer observer : ObserverList) {
            this.czyZagrozenie = observer.update(this);
        }
    };
    //---------------------------------------------

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
    public boolean isCzyZagrozenie() {return czyZagrozenie;}

    public void setOcena(double ocena) {
        this.ocena = ocena;
        ocenaChanged();
    }
    public void ocenaChanged(){notifyObservers();}
}
