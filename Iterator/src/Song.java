public class Song {
    private String title;
    private String singer;
    private int frequency;
    // private String date_added;

    public Song (String t, String s, int f) {
        this.title = t;
        this.singer = s;
        this.frequency = f;
    }

    public String getTitle() {
        return this.title;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void increaseFrequency() {
        this.frequency += 1;
    }
}
