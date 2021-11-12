import java.util.ArrayList;
import java.util.Iterator;

/*
    A class representing the list of Songs
 */
public class Playlist{
    private String playlistName;
    private ArrayList<Song> allSong;

    public Playlist(String name) {
        this.playlistName = name;
        allSong = new ArrayList<>();
    }

    public void addSong(Song s) {
        this.allSong.add(s);
    }

    public int getSize() {
        return allSong.size();
    }

    public void removeSong(Song e) {
        allSong.remove(e);
    }

    public Iterator<Song> getIterator() {
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements Iterator<Song> {
        private int current = 0;
        @Override
        public boolean hasNext() {
            return current < allSong.size();
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                return null;
            } else {
                Song n = allSong.get(current);
                this.current += 1;
                return n;
            }
        }
    }


}
