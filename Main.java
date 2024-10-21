package week4_2;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Test AudioPlayer
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("Song A");
        audioPlayer.pause();
        audioPlayer.stop();
        
        System.out.println("-----------------------------");
        
        // Test VideoPlayer
        MediaPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play("Movie B");
        videoPlayer.pause();
        videoPlayer.stop();
        
        System.out.println("-----------------------------");
        
        // Test StreamingPlayer
        MediaPlayer streamingPlayer = new StreamingPlayer();
        streamingPlayer.play("Live Stream C");
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
