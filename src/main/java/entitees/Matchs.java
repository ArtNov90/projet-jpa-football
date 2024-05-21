package entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matchs")
public class Matchs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
