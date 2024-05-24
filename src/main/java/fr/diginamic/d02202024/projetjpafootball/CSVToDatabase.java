package fr.diginamic.d02202024.projetjpafootball;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.diginamic.d02202024.projetjpafootball.entitees.Joueur;
import fr.diginamic.d02202024.projetjpafootball.entitees.Team;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CSVToDatabase {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("football");
		EntityManager em = emf.createEntityManager();

		try {
			List<String[]> records = CSVReaderExample
					.readCSV("C:\\Users\\artno\\OneDrive\\Bureau\\DIGINAMIC\\Projet_JPA_foot\\goalscorers.csv");

			em.getTransaction().begin();

			Map<String, Team> teams = new HashMap<>();
			Map<String, Joueur> players = new HashMap<>();

			Team currentTeam;
			Joueur currentJoueur;
			
			for (String[] record : records) {

				// Récupération ou création de l'équipe de la ligne courante
				String country = record[3].trim().toUpperCase();
				if (teams.containsKey(country)) {
					currentTeam = teams.get(country);
				} else {
					currentTeam = new Team(country);
					teams.put(country, currentTeam);
				}

				// Récupération ou création de l'équipe de la ligne courante
				String playerName = record[4].trim();
				if (players.containsKey(playerName)) {
					currentJoueur = players.get(playerName);
				} else {
					currentJoueur = new Joueur(playerName);
					currentJoueur.setTeam(currentTeam);
					currentTeam.getJoueurs().add(currentJoueur);
					players.put(playerName, currentJoueur);
				}
				

				// Récupération & création de buts dans la bdd
			}
			

			// Parcours de la collection des équipes pour créer l'ensemble des équipes et des joueurs en cascade
			for (Map.Entry<String, Team> entry : teams.entrySet()) {
				em.persist(entry.getValue());
			}
			

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}
}
