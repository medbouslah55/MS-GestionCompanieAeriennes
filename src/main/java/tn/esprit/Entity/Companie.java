package tn.esprit.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Companie implements Serializable{
	private static final long serialVersionUID = 6;
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String adresse;
	private int telephone;
	private String pays;
	private String nomPDG;
	private int nbrAvion;
	private int nbrEmployes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getNomPDG() {
		return nomPDG;
	}
	public void setNomPDG(String nomPDG) {
		this.nomPDG = nomPDG;
	}
	public int getNbrAvion() {
		return nbrAvion;
	}
	public void setNbrAvion(int nbrAvion) {
		this.nbrAvion = nbrAvion;
	}
	public int getNbrEmployes() {
		return nbrEmployes;
	}
	public void setNbrEmployes(int nbrEmployes) {
		this.nbrEmployes = nbrEmployes;
	}
	@Override
	public String toString() {
		return "Companie [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone + ", pays="
				+ pays + ", nomPDG=" + nomPDG + ", nbrAvion=" + nbrAvion + ", nbrEmployes=" + nbrEmployes + "]";
	}
	

	




	

	


}
