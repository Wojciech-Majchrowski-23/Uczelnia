package UczelniaHandler;

import Osoba.Osoba;
import Osoba.Student;
import Osoba.PracNaukDyd;
import Osoba.PracAdmin;
import Osoba.Pracownik;
import Przedmioty.InvalidMarkException;
import Przedmioty.Przedmiot;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UczelniaHandler {

    public static void printInfo(ArrayList<Osoba> ludzie){
        for(Osoba czlowiek : ludzie) {
            if(czlowiek instanceof PracNaukDyd){
                ((PracNaukDyd)czlowiek).info();
                System.out.println();
            }
            if(czlowiek instanceof Student){
                ((Student)czlowiek).info();
                System.out.println();
            }
            if(czlowiek instanceof PracAdmin){
                ((PracAdmin)czlowiek).info();
                System.out.println();
            }
        }
    }
    public static void printInfoforStudents(ArrayList<Student> studenci){
        for(int i=0; i<studenci.size(); i++) {
            System.out.println("[" + i + "]");
            studenci.get(i).info();
            System.out.println();
        }
    }
    public static void searchByLastname(ArrayList<Osoba> ludzie, String nazwisko){
        for(Osoba czlowiek : ludzie) {
            if(czlowiek.getNazwisko().equals(nazwisko)) {
                czlowiek.info();
                System.out.println();
            }
        }
    }
    public static void searchByID(ArrayList<Osoba> ludzie, String numer){
        for(Osoba czlowiek : ludzie) {
            if(czlowiek instanceof Student && ((Student)czlowiek).getId().equals(numer)) {
                czlowiek.info();
                System.out.println();
            }
        }
    }
    public static void searchByWage(ArrayList<Osoba> ludzie, int dorobek){
        for(Osoba czlowiek : ludzie) {
            if(czlowiek instanceof Pracownik && ((Pracownik)czlowiek).getZarobek() > dorobek) {
                czlowiek.info();
                System.out.println();
            }
        }
    }
    public static void searchByPosition(ArrayList<Osoba> ludzie, String stanowisko){
        for(Osoba czlowiek : ludzie) {
            if(czlowiek instanceof PracAdmin && ((PracAdmin)czlowiek).getStanowisko().equals(stanowisko)) {
                czlowiek.info();
                System.out.println();
            }
        }
    }
    public static void setPrzedmiotyForAllStudents(ArrayList<Osoba> ludzie, Przedmiot[] przedmioty){
        for(Osoba czlowiek : ludzie) {
            for(int i=0; i<przedmioty.length; i++) {
                if(czlowiek instanceof Student) {
                    ((Student)czlowiek).addPrzedmiot(przedmioty[i]);
                }
            }
        }
    }
    public static double setRandomOcena() {
        Random random = new Random();
        double[] possibleValues = {3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
        int randomIndex = random.nextInt(possibleValues.length);
        return possibleValues[randomIndex];
    }
    public static void setPrzedmiotyManually(Student student){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ile przedmiotow chcesz dodac studentowi " + student.getImie() + " " + student.getNazwisko() + ". Ilosc: ");
        int x = sc.nextInt();

        for(int i = 0; i<x; i++){
            System.out.print("Nazwa przedmiotu: ");
            String nazwaPrzedmiotu = sc.next();
            System.out.print("Ilosc ECTS: ");
            int ects = sc.nextInt();
            System.out.print("Ilosc godzin: ");
            int godz = sc.nextInt();
            System.out.print("Ocena: ");
            double ocena = sc.nextDouble();
            student.addPrzedmiot(new Przedmiot(nazwaPrzedmiotu, ects, godz, ocena));
        }
    }
    public static void setPrzedmiotyForOneStudent(Osoba czlowiek, Przedmiot[] przedmioty){
        if(czlowiek instanceof Student) {
            for(int i=0; i<przedmioty.length; i++) {
                ((Student)czlowiek).addPrzedmiot(przedmioty[i]);
            }
        }
    }
    public static ArrayList<Student> initializeStudentArrayList(ArrayList<Osoba> ludzie){
        ArrayList<Student> studenci = new ArrayList<Student>();
        for(Osoba osoba : ludzie) {
            if(osoba instanceof Student) {
                studenci.add((Student)osoba);
            }
        }
        return studenci;
    }
    public static void setOcenyForStudent(ArrayList<Student> studenci) {
        System.out.println("Ktoremu studentowi chcesz zmienic oceny?");
        printInfoforStudents(studenci);
        System.out.print("Wybierz indeks studenta ( [x] ): ");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        double ocena;
        System.out.println("Zmieniasz oceny studentowi: " + studenci.get(choice1).getImie() + " " + studenci.get(choice1).getNazwisko());
        if(!(choice1 >= studenci.size()) && !(choice1 < 0)) {
            for(Przedmiot przedmiot : studenci.get(choice1).getPrzedmioty()) {
                System.out.println("Ocena dla przedmiotu: " + przedmiot.getNazwa() + ": ");
                ocena = sc.nextDouble();
                przedmiot.setOcena(ocena);
            }
            System.out.println("Oceny zostaly zmienione");
        }

    }

    public static void ListOfActions(ArrayList<Osoba> ludzie) throws InterruptedException {

        boolean t = true;
        boolean saved = false;

        while(t) {

            Thread.sleep(10);
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("1. Add a person \n2. Save all of the people\n3. Print all of the people" +
                                "\n4. Save Students to txt file\n5. Read Students from txt File\n6. Set oceny for one student\n7. Quit");

            Scanner sc = new Scanner(System.in);
            System.out.print("choice: ");
            int choice1 = sc.nextInt();


            switch (choice1) {
                case 1: {
                    System.out.println("Who do you want to add: ");
                    System.out.println("1. Student \n2. PracNaukDyd\n3. PracAdmin");

                    System.out.print("choice: ");
                    int choice2 = sc.nextInt();


                    System.out.println("Insert data: ");
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Lastname: ");
                    String lastname = sc.next();
                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    switch (choice2) {
                        case 1: {
                            System.out.print("Kierunek: ");
                            String kierunek = sc.next();
                            System.out.print("Semestr: ");
                            int semestr = sc.nextInt();
                            System.out.print("ID: ");
                            String id = sc.next();

                            Student st = new Student(name, lastname, age, kierunek, semestr, id);
                            setPrzedmiotyManually(st);
                            ludzie.add(st);
                            break;
                        }
                        case 2: {
                            System.out.print("Przemiot nauczany: ");
                            String przedmiotNauczany = sc.next();

                            ludzie.add(new PracNaukDyd(name, lastname, age, przedmiotNauczany));
                            break;
                        }
                        case 3: {
                            System.out.print("Stanowisko: ");
                            String stanowisko = sc.next();

                            ludzie.add(new PracAdmin(name, lastname, age, stanowisko));
                            break;
                        }
                        default: {
                            System.out.println("Invalid choice");
                        }
                    }
                }
                System.out.println("Person has been added! Remember to save before quitting.");
                break;
                case 2: {
                    saveToFile(ludzie);
                    System.out.println("Everyone Saved!!!");
                    break;
                }
                case 3: {
                    printInfo(readFromFile());
                    break;
                }
                case 4: {
                    saveStudentsToTxt(ludzie);
                    System.out.println("Students saved in txt file! Now you can print them!");
                    break;
                }
                case 5: {
                    try{
                        readStudentsFromTxt();
                    }catch(InvalidMarkException e){
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;
                }
                case 6: {
                    setOcenyForStudent(initializeStudentArrayList(ludzie));
                    break;
                }
                case 7: {
                    t = false;
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }

    public static void saveToFile(ArrayList<Osoba> ludzie){

        try(ObjectOutputStream zapis = new ObjectOutputStream(new FileOutputStream("osoby.ser"))){

            zapis.writeObject(ludzie);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Osoba> readFromFile (){

        ArrayList<Osoba> ludzie = new ArrayList<Osoba>();

        try(ObjectInputStream odczyt = new ObjectInputStream(new FileInputStream("osoby.ser"))){

            ludzie = (ArrayList<Osoba>)odczyt.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No one has been saved yet!");
        }
        return ludzie;
    }

    public static void saveStudentsToTxt(ArrayList<Osoba> ludzie){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("studenci.txt"))){

            for(Osoba osoba : ludzie){
                if(osoba instanceof Student){
                    writer.write(((Student)osoba).getId() +";"+((Student)osoba).getImie()+
                                ";"+((Student)osoba).getNazwisko()
                                +";"+((Student)osoba).getKierunek()+";PRZEDMIOTY");
                    for(Przedmiot przedmiot : ((Student)osoba).getPrzedmioty()){
                        writer.write(";"+przedmiot.getNazwa()+";ocena;"+przedmiot.getOcena());
                    }
                }
                writer.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readStudentsFromTxt() throws InvalidMarkException {

        try(BufferedReader reader = new BufferedReader(new FileReader("studenci.txt"))) {

            String studentLine;
            double ocena;

            while ((studentLine = reader.readLine()) != null) {
                String[] parts = studentLine.split(";");

                for (int i = 1; i < parts.length; i++) {
                    if (parts[i - 1].equals("ocena")) {
                        ocena = Double.parseDouble(parts[i]);
                        if (ocena < 2.0 || ocena > 5.5) {
                            System.out.println(parts[1] + " " + parts[2]);
                            throw new InvalidMarkException("Blad w ocenach studenta");
                        }
                    }
                }
                for(String part : parts){
                    System.out.println(part +" ");
                }
                System.out.println("----");
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
