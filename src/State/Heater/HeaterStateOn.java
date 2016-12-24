
package State.Heater;

public class HeaterStateOn implements HeaterState {
    @Override
    public void update(Heater heater) {
        System.out.println("Heater is On");
    }
}

