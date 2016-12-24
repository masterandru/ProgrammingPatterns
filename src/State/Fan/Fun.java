/* user 24.12.2016 */
package State.Fan;

public class Fun {
    private FunState state;

    public void stepUp() {
        if (this.state instanceof FunSateOff) {
            state = new FunSateSpeedOne();
            state.update(this);
        } else if (this.state instanceof FunSateSpeedOne) {
            state = new FunSateSpeedTwo();
            state.update(this);
        } else if (this.state instanceof FunSateSpeedTwo) {
            state = new FunSateSpeedThree();
            state.update(this);
        }
    }

    public void stepDown() {
        if (this.state instanceof FunSateSpeedThree) {
            state = new FunSateSpeedTwo();
            state.update(this);
        } else if (this.state instanceof FunSateSpeedTwo) {
            state = new FunSateSpeedOne();
            state.update(this);
        } else if (this.state instanceof FunSateSpeedOne) {
            state = new FunSateOff();
            state.update(this);
        }
    }

    public Fun() {
        this.state = new FunSateOff();
    }

    public Fun(FunState state) {
        this.state = state;
    }


}
