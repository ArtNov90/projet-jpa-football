package fr.diginamic.d02202024.projetjpafootball.entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tournoi")
public class Tournoi {
	@Id

	@Column(name = "NOM_TOURNOI")
    private String nomTournoi;

	public Tournoi(String nomTournoi) {
		super();
		this.nomTournoi = nomTournoi;
	}

	public Tournoi() {
		super();
	}

	public String getNomTournoi() {
		return nomTournoi;
	}

	public void setNomTournoi(String nomTournoi) {
		this.nomTournoi = nomTournoi;
	}
}
