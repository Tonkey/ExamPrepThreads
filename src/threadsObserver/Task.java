package threadsObserver;

import java.util.logging.Level;
import java.util.logging.Logger;
import randomperson.RandomUser;
import randomperson.RandomUserGenerator;

/**
 *
 * @author Nicklas Molving
 */
public class Task implements Runnable {

    private RandomUserControl ruc;

    public Task(RandomUserControl ruc) {
        this.ruc = ruc;
    }

    @Override
    public void run() {

        RandomUser user = null;
        try {
            user = RandomUserGenerator.getRandomUser();
            System.out.println(user.getFirstName());
        } catch (InterruptedException ex) {
            Logger.getLogger(RandomUserControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        ruc.notifyObservers(user);
    }

}
