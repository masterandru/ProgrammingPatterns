/* user 24.12.2016 */
package State.System;

import State.Fan.Fun;
import State.Heater.Heater;

public class VentilationBlock {
    public Fun fun;
    public Heater heater;

    public VentilationBlock() {
        this.fun = new Fun();
        this.heater = new Heater();
    }


}
