package entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "buts")
public class Buts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BUT")
	private String idBut;
	@Column(name = "MINUTE_BUT_MARQUE")
	private String minuteButMarque;
	@Column(name = "IS_PENALTY")
	private Boolean isPenalty;
	@Column(name = "OWN_GOAL")
	private Boolean ownGoal;
	
    @ManyToOne
    @JoinColumn(name = "id_joueur", nullable = false)
    private Joueur joueur;

    @ManyToOne
    @JoinColumn(name = "id_match", nullable = false)
    private Matchs match;

	public Buts(String idBut, String minuteButMarque, Boolean isPenalty, Boolean ownGoal) {
		super();
		this.idBut = idBut;
		this.minuteButMarque = minuteButMarque;
		this.isPenalty = isPenalty;
		this.ownGoal = ownGoal;
	}

	public String getIdBut() {
		return idBut;
	}

	public void setIdBut(String idBut) {
		this.idBut = idBut;
	}

	public String getMinuteButMarque() {
		return minuteButMarque;
	}

	public void setMinuteButMarque(String minuteButMarque) {
		this.minuteButMarque = minuteButMarque;
	}

	public Boolean getIsPenalty() {
		return isPenalty;
	}

	public void setIsPenalty(Boolean isPenalty) {
		this.isPenalty = isPenalty;
	}

	public Boolean getOwnGoal() {
		return ownGoal;
	}

	public void setOwnGoal(Boolean ownGoal) {
		this.ownGoal = ownGoal;
	}
}
