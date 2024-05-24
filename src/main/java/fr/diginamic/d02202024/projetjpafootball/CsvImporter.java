package fr.diginamic.d02202024.projetjpafootball;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CsvImporter {

	 public static void main(String[] args) throws IOException {
	        Path filePath = Paths.get("C:\\Users\\artno\\OneDrive\\Bureau\\DIGINAMIC\\Projet_JPA_foot\\goalscorers.csv");

	        try (Stream<String> lines = Files.lines(filePath)) {
	            lines.forEach(System.out::println);
	        }
    }
}
