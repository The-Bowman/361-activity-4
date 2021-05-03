package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.Album;
import business.MusicManager;

@ManagedBean @ViewScoped
public class AlbumController {
	
	MusicManager manager = new MusicManager();
	
	public String onSubmit(Album album) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		album = context.getApplication().evaluateExpressionGet(context, "#{album}", Album.class);
		
		System.out.println("you clicked the button");
		
		manager.addAlbum(album);
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("album", album);	
		
		return "AddAlbumResponse.xhtml";
	}

}
