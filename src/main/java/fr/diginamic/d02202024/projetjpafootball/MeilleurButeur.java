package fr.diginamic.d02202024.projetjpafootball;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeilleurButeur {
    public static void main(String[] args) {
        try {
            // Lire le fichier CSV
            List<String[]> records = CSVReaderExample
                    .readCSV("C:\\Users\\artno\\OneDrive\\Bureau\\DIGINAMIC\\Projet_JPA_foot\\goalscorers.csv");

            // Créer une map pour compter les occurrences des noms des buteurs
            Map<String, Integer> buteurCount = new HashMap<>();

            // Parcourir les enregistrements et compter les occurrences
            for (String[] record : records) {
                String buteur = record[4].trim(); // Colonne D (index 3)
                buteurCount.put(buteur, buteurCount.getOrDefault(buteur, 0) + 1);
            }

            // Trouver le buteur avec le plus d'occurrences
            String meilleurButeur = null;
            int maxCount = 0;
            for (Map.Entry<String, Integer> entry : buteurCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    meilleurButeur = entry.getKey();
                }
            }

            // Afficher le meilleur buteur
            System.out.println("Le meilleur buteur est : " + meilleurButeur + " avec " + maxCount + " buts.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
