package fr.doranco.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import fr.doranco.com.model.enums.TypeVoieEnum;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private long number;
	@NotNull
	private TypeVoieEnum voie;
	@NotNull
	private String rue;
	@NotNull
	private String codePostal;
	@NotNull
	private String ville;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public TypeVoieEnum getVoie() {
		return voie;
	}
	public void setVoie(TypeVoieEnum voie) {
		this.voie = voie;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String adresseComplete() {
		return number+" "+voie+" "+rue+" "+ville+"("+codePostal+")"; 
	}
}
