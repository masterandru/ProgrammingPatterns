package Observer.MyExperiment;

import java.util.Observable;

/**
 * user
 * 25.12.2016
 */
public class Notifier extends Observable {

    // Унаследовал для получения доступа к setChanged()
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
