package Observer;

import java.util.List;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void eventHandler(List<String> vacansies) {
        System.out.println("Dear " + name + "\n We have some changes in vacancies: \n" + vacansies +
                "\n==============================================================\n");

    }
}
