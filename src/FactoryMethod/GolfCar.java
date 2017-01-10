package FactoryMethod;
/* user 10.01.2017*/

public class GolfCar implements Car {
    @Override
    public void go() {
        System.out.println("GolfCar: I'm very slowly - Speed 10km/h");
    }
}
