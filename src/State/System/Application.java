/* user 24.12.2016 */
package State.System;

public class Application {
    public static void main(String[] args) {
        VentilationBlock ventilationBlock = new VentilationBlock();

        ventilationBlock.fun.stepUp();
        ventilationBlock.heater.switchOn();

    }

}
