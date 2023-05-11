package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation de ISymptomReader pour lire les symptomes à partir d'un fichier.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private final String filepath;

    /**
     * Constructeur de la classe ReadSymptomDataFromFile.
     *
     * @param filepath Le chemin du fichier contenant les symptomes.
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() {
        List<String> symptoms = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = reader.readLine();
            while (line != null) {
                symptoms.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return symptoms;
    }
}
