/* user 24.12.2016 */
/* Паттерн "Компановщик" */
package Component;

public abstract class Component {

    protected String name;

    public void printOut(int level) {
        throw new UnsupportedOperationException();
    }

    public String getLevel() {
        throw new UnsupportedOperationException();
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

}

