package threadsObserver;

import java.util.Observable;

public class RandomUserControl extends Observable {

    public void fetchRandomUser() {

        Task t1 = new Task(this);
        setChanged();
        new Thread(t1).start();
    }
}
