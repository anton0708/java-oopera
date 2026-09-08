import java.util.ArrayList;

public class Ballet extends MusicShow {
    protected Person choreographer;

    public Ballet(String title, int duration, Director director,
           Person musicAuthor, String librettoText, Person choreographer) {
        super.title = title;
        super.duration = duration;
        super.director = director;
        super.musicAuthor = musicAuthor;
        super.librettoText = librettoText;
        this.choreographer = choreographer;
    }
}
