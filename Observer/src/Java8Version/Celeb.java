package Java8Version;

import java.util.ArrayList;
import java.util.Observable;

public class Celeb extends Observable {
    private ArrayList<String> posts;
    private String name;
    private String occupation;
    // add their company name

    public Celeb (String n, String o) {
        this.name = n;
        this.occupation = o;
        this.posts = new ArrayList<>();
    }

    public void addPost(String newPost) {
        this.posts.add(newPost);
        setChanged();
        notifyObservers(this.name + " uploaded new post!");
    }
}
