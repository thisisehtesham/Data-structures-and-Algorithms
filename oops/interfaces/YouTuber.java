package oops.interfaces;

public class interface YouTuber extends VideoEditor {
		
		abstract void makeVideo();
		
		default void uploadVideo() {
			System.out.println("Upload the video");
		}

	}
