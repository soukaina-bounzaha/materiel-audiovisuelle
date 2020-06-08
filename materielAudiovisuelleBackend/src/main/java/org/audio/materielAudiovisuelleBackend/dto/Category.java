package org.audio.materielAudiovisuelleBackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategorie;
	private String nomCategorie;
	private String desigCat;
	@Column(name = "image_url")
	private String imageUrl;
	private boolean active = true; // admin pt activer ou desactiver la categorie au lieu de la supprimer
	
	
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDesigCat() {
		return desigCat;
	}
	public void setDesigCat(String desigCat) {
		this.desigCat = desigCat;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Category [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", desigCat=" + desigCat
				+ ", imageUrl=" + imageUrl + ", active=" + active + "]";
	}
}
