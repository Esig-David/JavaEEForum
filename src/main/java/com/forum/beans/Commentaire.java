package com.forum.beans;

public class Commentaire {
	private String nom;
	private String commentaire;
	
	public Commentaire(String nom, String commentaire) {
		this.nom = nom;
		this.commentaire = commentaire;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;;
	}
	
	public String getCommentaire() {
		return commentaire;
	}
	
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;;
	}

}
