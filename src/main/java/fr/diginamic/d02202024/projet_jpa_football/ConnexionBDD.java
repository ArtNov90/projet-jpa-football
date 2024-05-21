package fr.diginamic.d02202024.projet_jpa_football;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionBDD {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("football");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println(entityManager);

		entityManager.close();
		entityManagerFactory.close();

	}

}
