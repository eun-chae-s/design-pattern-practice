package Java9Later;

public class Main {
    public static void main(String[] args) {
        Celeb bts = new Celeb("BTS", "Kpop boy group", 1000000);
        Celeb txt = new Celeb("TXT", "Kpop boy group", 400000);

        Company bighit = new Company("Big Hit");
        bighit.addNewCeleb(bts);
        bighit.addNewCeleb(txt);

        bts.addObserver(bighit);
        txt.addObserver(bighit);

        bts.addFollower(50000);
        txt.addFollower(1000);
    }
}
