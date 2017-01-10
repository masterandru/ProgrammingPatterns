package FactoryMethod;
/* user 10.01.2017*/

public class CarSelector {
    public static Car getNewCar(RoadConditions roadConditions) {
        switch (roadConditions) {
            case HIGHWAY:
                return new PorshePanamera();
            case LOUNGE:
                return new GolfCar();
            case OFFROAD:
                return new VolvoXC70();
            default:
                return null;
        }
    }
}
