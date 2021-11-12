import java.util.ArrayList;

/*
    A class representing the list of Songs
 */
public class Playlist {
    private String playlistName;
    private ArrayList<Song> allSong;

    public Playlist(String name) {
        this.playlistName = name;
        allSong = new ArrayList<>();
    }

    public void addSong(Song s) {
        this.allSong.add(s);
    }
}
