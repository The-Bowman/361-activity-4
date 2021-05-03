package business;

import java.util.List;

import javax.ejb.*;

import beans.Album;
import beans.Track;
import util.TracksNotFoundException;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class MusicManager implements MusicManagerInterface {
	
	public Album addAlbum(Album model) {
		List<Track> tracks = getTracks(model);
		if (tracks == null) {
			TracksNotFoundException error = new TracksNotFoundException();
			error.message();
			return model;
		} else {
			System.out.println("Success!!");
			return model;
		}
		
	}
	
	private List<Track> getTracks(Album album){
		return album.getTracks();
	}
	

}
