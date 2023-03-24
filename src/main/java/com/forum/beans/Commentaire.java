package com.forum.beans;

public class Commentaire {
	private String auteur;
	private String contenu;
	
	public Commentaire(String auteur, String contenu) {
		this.auteur = auteur;
		this.contenu = contenu;
	}

	public String getAuteur() {
		return auteur;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String getCommentaire() {
		return contenu;
	}
	
	public void setCommentaire(String contenu) {
		this.contenu = contenu;
	}

}
