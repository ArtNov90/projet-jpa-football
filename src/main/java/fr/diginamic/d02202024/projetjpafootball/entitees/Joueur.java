package fr.diginamic.d02202024.projetjpafootball.entitees;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur")
public class Joueur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_JOUEUR")
	private String idJoueur;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "NOM")
	private String nom;

	@ManyToOne
	@JoinColumn(name = "country", nullable = false)
	private Team team;

	@OneToMany(mappedBy = "joueur", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Buts> buts;
	
	{
		buts = new HashSet<>();
	}

	public Joueur() {
		super();
	}
	
	

	public Joueur(String nom) {
		super();
		this.nom = nom;
	}



	public Joueur(String idJoueur, String prenom, String nom) {
		super();
		this.idJoueur = idJoueur;
		this.prenom = prenom;
		this.nom = nom;
	}

	public String getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(String idJoueur) {
		this.idJoueur = idJoueur;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Set<Buts> getButs() {
		return buts;
	}

	public void setButs(Set<Buts> buts) {
		this.buts = buts;
	}
	
	

}
