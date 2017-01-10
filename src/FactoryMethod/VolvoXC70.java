package FactoryMethod;
/* user 10.01.2017*/

public class VolvoXC70 implements Car {
    @Override
    public void go() {
        System.out.println("VolvoXC70: Speed 60km/h");
    }
}
