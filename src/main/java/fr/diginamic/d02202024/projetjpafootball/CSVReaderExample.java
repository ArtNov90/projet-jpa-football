package fr.diginamic.d02202024.projetjpafootball;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVReaderExample {
	public static List<String[]> readCSV(String filePath) throws Exception {
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			return reader.readAll();
		}
	}
}
