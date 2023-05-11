package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Interface pour écrire les symptomes et leur nombre d'occurrences dans une source de données.
 */
public interface ISymptomWriter {
	/**
     * Écrit les symptômes et leur nombre d'occurrences dans un fichier.
     *
     * @param symptomCountMap Une Map contenant les symptomes en clés et leur nombre d'occurrences en valeurs.
     * @param filepath        Le chemin du fichier où écrire les symptômes et leur nombre d'occurrences.
     * @throws IOException Si une erreur se produit lors de l'écriture du fichier.
     */
	void writeSymptomToFile(Map<String, Integer> symptomCountMap, String filepath) throws IOException;

}
