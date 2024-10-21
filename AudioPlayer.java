package week4_2;
    // AudioPlayer.java
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing audio: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Audio player paused.");
    }

    @Override
    public void stop() {
        System.out.println("Audio player stopped.");
    }
}

