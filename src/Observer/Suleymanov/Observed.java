/* user 25.12.2016 */
package Observer.Suleymanov;



public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();


}
