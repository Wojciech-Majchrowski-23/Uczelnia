package Wyplata;

public class WyplataException extends Exception {

    public WyplataException(String message) {
        super(message);
    }
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("Podaj poprawna pensje:");
    }
    public String getMessage(){

        return ("Blednie wprowadzona pensja");
    }
}
