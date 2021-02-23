package fr.doranco.com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity(name="rdv")
public class RendezVous {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private Date date;
	
	@NotNull
	private Integer duree;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur medecin;
	
	@NotNull 
	@OneToOne
	private Utilisateur utilisateur;
	
	
	
	public RendezVous() {
		
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Integer getDuree() {
		return duree;
	}
	
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	
	public Utilisateur getMedecin() {
		return medecin;
	}
	
	public void setMedecin(Utilisateur medecin) {
		this.medecin = medecin;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "RendezVous [id=" + id + ", date=" + date + ", duree=" + duree + ", medecin=" + medecin
				+ ", utilisateur=" + utilisateur + "]";
	}
	
	
	
}