package fr.diginamic.d02202024.projetjpafootball.entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "matchs")
public class Matchs {

	@Id

	@Column(name = "ID_MATCH")
	private String idMatch;
	@Column(name = "DATE_MATCH")
	private String dateMatch;
	@Column(name = "CITY")
	private String city;
	@Column(name = "NEUTRAL")
	private Boolean neutral;
	@Column(name = "HOMESCORE")
	private String homeScore;
	@Column(name = "AWAYSCORE")
	private String awayScore;

	@ManyToOne
	@JoinColumn(name = "country", nullable = false)
	private Team homeTeam;

	@ManyToOne
	@JoinColumn(name = "country_1", nullable = false)
	private Team awayTeam;

	@ManyToOne
	@JoinColumn(name = "nom_tournoi", nullable = false)
	private Tournoi tournoi;

	

	public Matchs() {
		super();
	}

	public Matchs(String idMatch, String dateMatch, String city, Boolean neutral, String homeScore, String awayScore) {

		super();
		this.idMatch = idMatch;
		this.dateMatch = dateMatch;
		this.city = city;
		this.neutral = neutral;
		this.homeScore = homeScore;
		this.awayScore = awayScore;

	}

	public String getIdMatch() {
		return idMatch;
	}

	public void setIdMatch(String idMatch) {
		this.idMatch = idMatch;
	}

	public String getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(String dateMatch) {
		this.dateMatch = dateMatch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getNeutral() {
		return neutral;
	}

	public void setNeutral(Boolean neutral) {
		this.neutral = neutral;
	}

	public String getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(String homeScore) {
		this.homeScore = homeScore;
	}

	public String getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(String awayScore) {
		this.awayScore = awayScore;
	}



}
