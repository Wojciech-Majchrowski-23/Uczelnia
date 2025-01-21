package Observer;

import Przedmioty.Przedmiot;

import java.io.Serializable;

public class ZagrozenieSetter implements Serializable, Observer {

    private double ocena;

    private Subject przedmiot;

    public ZagrozenieSetter(Subject przedmiot) {
        this.przedmiot = przedmiot;
        this.przedmiot.registerObserver(this);
    }

    public boolean update(Przedmiot p) {
        if(p.getOcena()<3.0){
            return true;
        }
        return false;
    }
}
