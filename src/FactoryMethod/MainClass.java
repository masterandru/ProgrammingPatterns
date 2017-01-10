package FactoryMethod;
/* user 10.01.2017*/

public class MainClass {
    public static void main(String[] args) {

        System.out.println("\n********* Run *********");
        Car carBrakeSpeedLimit = CarSelector.getNewCar(RoadConditions.HIGHWAY);
        carBrakeSpeedLimit.go();

        System.out.println("\n********* Forest *********");

        Car carForPleasure = CarSelector.getNewCar(RoadConditions.OFFROAD);
        carForPleasure.go();

        System.out.println("\n********* Lets play Golf *********");
        Car carLetsPlaygolf = CarSelector.getNewCar(RoadConditions.LOUNGE);
        carLetsPlaygolf.go();


    }
}
