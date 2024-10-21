package week4_2;

// StreamingPlayer.java
public class StreamingPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("Streaming media: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Streaming player paused.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming player stopped.");
    }
}
