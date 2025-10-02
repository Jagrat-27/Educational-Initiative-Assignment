package Exercise1.Structural.Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MP3Player();
        player.play("mp3", "song1.mp3");

        MediaPlayer adapter = new MediaAdapter();
        adapter.play("mp4", "movie.mp4");
    }
}
