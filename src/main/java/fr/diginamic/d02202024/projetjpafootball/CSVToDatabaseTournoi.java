package fr.diginamic.d02202024.projetjpafootball;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.diginamic.d02202024.projetjpafootball.entitees.Tournoi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CSVToDatabaseTournoi {

	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("football");
        EntityManager em = emf.createEntityManager();

        try {
            List<String[]> records = CSVReaderExample
                    .readCSV("C:\\Users\\artno\\OneDrive\\Bureau\\DIGINAMIC\\Projet_JPA_foot\\results.csv");

            em.getTransaction().begin();

            Map<String, Tournoi> tournois = new HashMap<>();

            for (String[] record : records) {
                String tournoiName = record[5].trim(); // Colonne F (index 5)

                if (!tournois.containsKey(tournoiName)) {
                    Tournoi tournoi = new Tournoi(tournoiName);
                    tournois.put(tournoiName, tournoi);
                    em.persist(tournoi);
                }
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
