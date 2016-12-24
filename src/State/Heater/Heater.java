/* user 24.12.2016 */
package State.Heater;

public class Heater {
    private HeaterState state;

    public void switchOff() {
        this.state = new HeaterStateOff();
        state.update(this);
    }

    public HeaterState getState() {
        return state;
    }

    public void switchOn() {
        this.state = new HeaterStateOn();
        state.update(this);
    }

    public Heater() {
        this.state = new HeaterStateOff();
        state.update(this);
    }

    public Heater(HeaterState state) {
        this.state = state;
    }
}
