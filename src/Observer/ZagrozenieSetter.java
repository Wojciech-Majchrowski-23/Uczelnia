package Observer;

import Przedmioty.Przedmiot;

import java.io.Serializable;

public class ZagrozenieSetter implements Serializable, Observer {

    private Subject subject;
    private Przedmiot przedmiot;

    public ZagrozenieSetter(Subject subject, Przedmiot przedmiot) {
        this.subject = przedmiot;
        this.subject.registerObserver(this);
        this.przedmiot = przedmiot;
    }

    public void update(Przedmiot przedmiot) {
        setZagro();
    }
    private void setZagro() {
        if(przedmiot.getOcena() < 3.0){
            przedmiot.setCzyZagrozenie(true);
        }
    }
}
