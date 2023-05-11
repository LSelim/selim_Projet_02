package com.hemebiotech.analytics;

import java.util.*;

/**
 * Classe pour compter et trier les occurrences des symptomes.
 */
public class AnalyticsCounter {

    private final ISymptomReader symptomReader;

    /**
     * Constructeur de la classe AnalyticsCounter.
     *
     * @param symptomReader Une implémentation de l'interface ISymptomReader pour lire les symptomes.
     */
    public AnalyticsCounter(ISymptomReader symptomReader) {
        this.symptomReader = symptomReader;
    }

    /**
     * Compte les occurrences de chaque symptome et les trie par ordre alphabétique.
     *
     * @return Une LinkedHashMap triée contenant les symptomes en clés et leur nombre d'occurrences en valeurs.
     */
    public Map<String, Integer> countSymptoms() {
        List<String> symptoms = symptomReader.getSymptoms();

        Map<String, Integer> symptomCountMap = new HashMap<>();
        for (String symptom : symptoms) {
            String normalizedSymptom = symptom.trim().toLowerCase();
            int count = symptomCountMap.getOrDefault(normalizedSymptom, 0);
            symptomCountMap.put(normalizedSymptom, count + 1);
        }

        Map<String, Integer> sortedSymptomCountMap = new LinkedHashMap<>();
        symptomCountMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(entry -> sortedSymptomCountMap.put(entry.getKey(), entry.getValue()));

        return sortedSymptomCountMap;
    }
}
