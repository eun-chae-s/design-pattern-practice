package Java9Later;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;

public class Company implements PropertyChangeListener{
    private String name;
    private ArrayList<Celeb> allCelebs;

    public Company (String n) {
        this.name = n;
        this.allCelebs = new ArrayList<>();
    }

    public void addNewCeleb (Celeb c) {
        allCelebs.add(c);
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        System.out.println("Hey, " + this.name + ", there's an update in one of your celeb's Instagram followers!");
        System.out.println(e.getPropertyName() + " now has " + e.getNewValue() + " followers, while " +
                "they had " + e.getOldValue() + " followers in last week");
        System.out.println();
    }


    public void removeCeleb (Celeb c) {
        allCelebs.remove(c);
    }
}
