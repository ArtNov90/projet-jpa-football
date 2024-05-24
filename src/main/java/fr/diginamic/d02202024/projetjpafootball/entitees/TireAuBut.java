package fr.diginamic.d02202024.projetjpafootball.entitees;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tir_au_but")
public class TireAuBut {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIR_AU_BUT")
	private String idTirAuBut;
	@Column(name = "WINNER_COUNTRY")
	private Boolean winnerCountry;
	@Column(name = "FIRST_SHOOTER")
	private String firstShooter;

	@ManyToOne
	@JoinColumn(name = "id_match", nullable = false)
	private Matchs match;

	@ManyToOne
	@JoinColumn(name = "country", nullable = false)
	private Team team;

	public TireAuBut() {
		super();
	}

	public TireAuBut(String idTirAuBut, Boolean winnerCountry, String firstShooter) {
		super();
		this.idTirAuBut = idTirAuBut;
		this.winnerCountry = winnerCountry;
		this.firstShooter = firstShooter;
	}

	public String getIdTirAuBut() {
		return idTirAuBut;
	}

	public void setIdTirAuBut(String idTirAuBut) {
		this.idTirAuBut = idTirAuBut;
	}

	public Boolean getWinnerCountry() {
		return winnerCountry;
	}

	public void setWinnerCountry(Boolean winnerCountry) {
		this.winnerCountry = winnerCountry;
	}

	public String getFirstShooter() {
		return firstShooter;
	}

	public void setFirstShooter(String firstShooter) {
		this.firstShooter = firstShooter;
	}

	public void setWinner(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setIdMatch(String id) {
		// TODO Auto-generated method stub
		
	}

	
}
