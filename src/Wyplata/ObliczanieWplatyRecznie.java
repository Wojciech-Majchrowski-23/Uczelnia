package Wyplata;

import Osoba.Pracownik;

import java.io.Serializable;
import java.util.Scanner;

public class ObliczanieWplatyRecznie implements ObliczanieWyplaty, Serializable{

    public int obliczWyplate(Pracownik pracownik) throws WyplataException{
        int wyplata;
        System.out.println("Wprowadz wyplate dla pracownika: ");
        Scanner sc = new Scanner(System.in);
        wyplata = sc.nextInt();
        if (wyplata <= 0){
            throw new WyplataException("Blad zwiazany z pensja mniejsza badz rowna 0");
        }

        return wyplata;
    }

}
