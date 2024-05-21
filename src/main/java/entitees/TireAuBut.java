package entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
