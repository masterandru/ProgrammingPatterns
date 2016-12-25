package Observer.MyExperiment;

/**
 * user
 * 25.12.2016
 */
// Observable - наблюдаЕМЫЙ. Объект за которым хочет наблюдать Observer - наблюдаТЕЛЬ.
// Наблюдатель это экземпаляр класса реализующий interface Observer


public class SubscribeKeeper {

    public static void main(String[] args) {

        Notifier notifier = new Notifier();

        // Подписчики
        Subscriber subscriber1 = new Subscriber("Ivan");
        Subscriber subscriber2 = new Subscriber("Stepan");
        Subscriber subscriber3 = new Subscriber("Alexander");

        // Добавляем подписчиков в список оповещения
        notifier.addObserver(subscriber1);
        notifier.addObserver(subscriber2);
        notifier.addObserver(subscriber3);

        // Говорим Observable инстансу что изменения произошли.
        notifier.setChanged();

        // После того как произошли изменения setChanged. Оповещение произойдет
        notifier.notifyObservers();


    }



}
