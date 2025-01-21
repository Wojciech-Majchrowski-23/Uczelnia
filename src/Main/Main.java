package Main;

import Osoba.*;
import Przedmioty.Przedmiot;
import UczelniaHandler.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Osoba> ludzie = new ArrayList<>();

        /*ludzie.add(new PracNaukDyd("Adam", "Kowalski", 48,"Matematyka Stosowana"));
        ludzie.add(new PracNaukDyd("Jacek", "Nowak", 42, "Zarzadzanie"));
        ludzie.add(new PracNaukDyd("Edward", "Bialy", 75, "Programowanie"));
        ludzie.add(new Student("Wojtek", "Majchrowski", 19, "Informatyka Stosowana", 1, "284336"));
        ludzie.add(new Student("Rafal", "Konopia", 18, "Matematyka Stosowana", 3, "341883"));
        ludzie.add(new Student("Karol", "Jakubowski", 20, "Zarzadzania", 2, "885324"));
        ludzie.add(new PracAdmin("Jozek", "Lopatowicz", 50, "Portier"));
        ludzie.add(new PracAdmin("Seba", "Niszczyciel", 30, "Ochroniarz"));
        ludzie.add(new PracAdmin("Bozena", "Strachowska", 69, "Pani od kurtek"));


        Przedmiot[] przedmioty = new Przedmiot[6];
        przedmioty[0] = new Przedmiot("Fizyka", 2, 15);
        przedmioty[1] = new Przedmiot("Algebra", 6, 30);
        przedmioty[2] = new Przedmiot("Logika", 4, 3);
        przedmioty[3] = new Przedmiot("Zarzadzanie", 4, 20);
        przedmioty[4] = new Przedmiot("OSK", 3, 20);
        przedmioty[5] = new Przedmiot("Analiza", 4, 20);*/

        try{
            UczelniaHandler.ListOfActions(ludzie);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
