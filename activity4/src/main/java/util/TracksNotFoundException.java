package util;

public class TracksNotFoundException extends RuntimeException {
	
	public TracksNotFoundException() {
		
	}
	
	public void message() {
		System.out.println("No tracks found!!");
	}

}
