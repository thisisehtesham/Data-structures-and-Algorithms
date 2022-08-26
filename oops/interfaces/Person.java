package oops.interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		obj.editVideo();

	}

	@Override
	public void study() {
		System.out.println("Person is studying");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making a good video");
		
	}

	@Override
	public void editVideo() {
		System.out.println("Youtuber is editing");
		
	}
	
	public void uploadVideo() {
		
	}
}	
	
	
