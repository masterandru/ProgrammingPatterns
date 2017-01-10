package FactoryMethod;
/* user 10.01.2017*/

public class PorshePanamera implements Car {
    @Override
    public void go() {
        System.out.println("PorshePanamera: Speed 280km/h");
    }
}
