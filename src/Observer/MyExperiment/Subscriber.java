package Observer.MyExperiment;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println();
        System.out.println("Receive message from system...\n" +
                "Hey "+ this.name +" redraw yourself\n+" +
                "===========================================================");

    }
}
