package fr.diginamic.d02202024.projetjpafootball.entitees;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
	@Id	
	@Column(name = "COUNTRY")
	private String country;
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	private Set<Joueur> joueurs;
	
	
	{
		joueurs = new HashSet<>();
	}

	public Team() {
		super();
	}

	public Team(String country) {
		super();
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(Set<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
	
}
