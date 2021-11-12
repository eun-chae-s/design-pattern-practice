package Java8Version;

import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;

public class Fan implements Observer {
    private String nickName;
    private ArrayList<Celeb> favs;

    public Fan (String n, ArrayList<Celeb> s) {
        this.nickName = n;
        this.favs = s;
    }

    @Override
    /*
       arg is from Observable's notifyChanged() message
     */
    public void update(Observable o, Object arg) {
        System.out.println(this.nickName + ", you have new notification!");
        System.out.println(arg);
    }

    public void removeCeleb (Celeb c) {
        favs.remove(c);
    }
}
