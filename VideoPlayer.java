package week4_2;

// VideoPlayer.java
public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing video: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Video player paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video player stopped.");
    }
}

