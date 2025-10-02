package Exercise1.Structural.Adapter;

public class MediaAdapter implements MediaPlayer {
    private MP4Player mp4Player = new MP4Player();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMP4(fileName);
        }
    }
    
}
