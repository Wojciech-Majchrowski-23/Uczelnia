package Przedmioty;

public class InvalidMarkException extends Exception {

    public InvalidMarkException(String message) {
        super(message);
    }
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("wprowadz korekte oceny");
    }
    public String getMessage(){
        return ("Nieprawidlowa ocena wsrod ocen studenta");
    }
}
