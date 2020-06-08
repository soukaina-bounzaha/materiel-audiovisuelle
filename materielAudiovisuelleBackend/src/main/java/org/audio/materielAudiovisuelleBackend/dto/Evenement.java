package org.audio.materielAudiovisuelleBackend.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evenement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvenement ;
	private String desigEven;
	private String refeEven;
	private Timestamp dateEven ;
	@Column(name = "is_active")
	private boolean active = true; // admin pt activer ou desactiver la categorie au lieu de la supprimer
	@Column(name = "category_id")
	private int categoryId;
	public int getIdEvenement() {
		return idEvenement;
	}
	public void setIdEvenement(int idEvenement) {
		this.idEvenement = idEvenement;
	}
	public String getDesigEven() {
		return desigEven;
	}
	public void setDesigEven(String desigEven) {
		this.desigEven = desigEven;
	}
	public String getRefeEven() {
		return refeEven;
	}
	public void setRefeEven(String refeEven) {
		this.refeEven = refeEven;
	}
	public Timestamp getDateEven() {
		return dateEven;
	}
	public void setDateEven(Timestamp dateEven) {
		this.dateEven = dateEven;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "Evenement [idEvenement=" + idEvenement + ", desigEven=" + desigEven + ", refeEven=" + refeEven
				+ ", dateEven=" + dateEven + ", active=" + active + ", categoryId=" + categoryId + "]";
	}
	
	
	
	
	
}


	