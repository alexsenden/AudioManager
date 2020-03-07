package audio;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		AudioManager.initializeAudioManager();
		AudioManager.addToSongQueue("mystery", "mystery2");
		
		Thread.sleep(10000);
		
		AudioManager.stopBackgroundMusic();
		
		Thread.sleep(5000);
		
		AudioManager.addToSongQueue("mystery2");
		
	}
}
