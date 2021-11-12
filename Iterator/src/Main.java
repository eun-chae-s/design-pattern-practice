import java.util.Iterator;

/*
    A class to test the Iterator design pattern
 */
public class Main {

    public static void main(String[] args) {
        Playlist p1 = new Playlist("Christmas");

        Song s1 = new Song ("Coming Home", "NCT U", 1000);
        Song s2 = new Song ("Twinkle", "Lovelyz", 100);
        Song s3 = new Song ("Wish Tree", "Red Velvet", 500);
        Song s4 = new Song ("Lately", "INFINITE", 400);
        Song s5 = new Song ("Candle Light", "NCT Dream", 300);

        p1.addSong(s1);
        p1.addSong(s2);
        p1.addSong(s3);
        p1.addSong(s4);
        p1.addSong(s5);

        Iterator<Song> playIterator = p1.getIterator();

        while (playIterator.hasNext()) {
            Song s = playIterator.next();
            s.increaseFrequency();
            if (s.getFrequency() < 200) {
                p1.removeSong(s);
            }
        }

        Iterator<Song> playIterator2 = p1.getIterator();

        while (playIterator2.hasNext()) {
            System.out.println(playIterator2.next().getTitle());
        }
    }
}
