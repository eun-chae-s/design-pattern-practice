package Java8Version;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Celeb bts = new Celeb("BTS", "Kpop boy group");
        Celeb txt = new Celeb("TXT", "Kpop boy group");

        Company bighit = new Company("Big Hit");
        bighit.addNewCeleb(bts);
        bighit.addNewCeleb(txt);

        bts.addObserver(bighit);
        txt.addObserver(bighit);

        ArrayList<Celeb> favs = new ArrayList<>();
        favs.add(bts);
        favs.add(txt);
        Fan rach = new Fan ("rach", favs);
        bts.addObserver(rach);
        bts.addObserver(rach);

        bts.addPost("Happy New Year!");
        txt.addPost("How are you doing?");
    }
}
