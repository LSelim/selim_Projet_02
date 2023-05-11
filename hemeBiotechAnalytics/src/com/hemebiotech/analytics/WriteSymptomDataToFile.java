package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Implémentation de ISymptomWriter pour écrire les symptomes et leur nombre d'occurrences dans un fichier.
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

    @Override
    public void writeSymptomToFile(Map<String, Integer> symptomCountMap, String filepath) throws IOException {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (Map.Entry<String, Integer> entry : symptomCountMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
    }
}
