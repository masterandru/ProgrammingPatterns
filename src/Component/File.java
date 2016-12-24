/* user 24.12.2016 */
/* Паттерн "Компановщик" */
package Component;

public class File extends Component {


    public File(String name) {
        this.name = name;
    }

    @Override
    public void printOut(int level) {
        for (int i = 0; i <= level; i++) System.out.print("-");
        System.out.println("(f) " + name);
    }

    @Override
    public String getLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

}

