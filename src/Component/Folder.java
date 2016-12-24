/* user 24.12.2016 */
/* Паттерн "Компановщик" */
package Component;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    protected static final int SHIFT_LEVEL = 3;

    protected List<Component> childen;
    int level;

    public Folder(String name, int level) {
        this.childen = new ArrayList<Component>();
        this.level = level + SHIFT_LEVEL;
        this.name = name;
    }

    @Override
    public void printOut(int level) {
        for (int i = 0; i <= level; i++) System.out.print("-");

        System.out.println("(F)" + name);
        for (Component includedComponent : childen) {
            includedComponent.printOut(level + SHIFT_LEVEL);
        }
    }

    @Override
    public String getLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(Component component) {
        childen.add(component);
    }

    @Override
    public void remove(Component component) {
        childen.remove(component);
    }


}

