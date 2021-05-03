package beans;

import java.util.HashMap;

public class TrackInfo {
	
	private HashMap<String, String> info;
	
	public TrackInfo() {
		info = new HashMap<>();
	}
	
	public void add(String artist, String title) {
		info.put(artist, title);
	}
	
		
	
	

}
