package Java9Later;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class Celeb{
    private int follower;
    private String name;
    private String occupation;
    // add their company name
    // making this class as an observable
    private final PropertyChangeSupport observable;

    public Celeb (String n, String o, int f) {
        this.name = n;
        this.occupation = o;
        this.follower = f;
        this.observable = new PropertyChangeSupport(this);
    }

    public void addObserver (PropertyChangeListener o) {
        observable.addPropertyChangeListener(this.name, o);
    }

    public void addFollower(int newFollower) {
        int oldFollower = this.follower;
        this.follower = this.follower + newFollower;
        observable.firePropertyChange(this.name, oldFollower, newFollower + oldFollower);
    }
}

