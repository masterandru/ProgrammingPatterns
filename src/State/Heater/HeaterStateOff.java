/* user 24.12.2016 */
package State.Heater;

public class HeaterStateOff implements HeaterState {
    @Override
    public void update(Heater heater) {
        System.out.println("Heater is Off");
    }
}
