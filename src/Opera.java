import java.util.ArrayList;

public class Opera extends MusicShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor,
           String librettoText, int choirSize) {
        super.title = title;
        super.duration = duration;
        super.director = director;
        super.musicAuthor = musicAuthor;
        super.librettoText = librettoText;
        this.choirSize = choirSize;
    }
}

