package Java8Version;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class Company implements Observer {
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
    /*
       arg is from Observable's notifyChanged() message
     */
    public void update(Observable o, Object arg) {
        System.out.println(this.name + ", you have new update from one of your celeb!");
        System.out.println(arg);
    }

    public void removeCeleb (Celeb c) {
        allCelebs.remove(c);
    }
}
