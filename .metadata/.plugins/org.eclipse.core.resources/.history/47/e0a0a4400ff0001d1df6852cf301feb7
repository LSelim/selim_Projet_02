package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

/**
 * Classe principale de l'application d'analyse des symptomes. Elle lit un fichier de symptomes,
 * compte les occurrences de chaque symptome, trie les symptomes par ordre alphabétique et
 * écrit les résultats dans un fichier result.out.txt en sortie.
 */

public class Main {
	/**
     * Méthode principale pour exécuter l'application d'analyse des symptomes.
     * @throws IOException Si une erreur se produit lors de la lecture ou de l'écriture des fichiers textes.
     */

    public static void main(String[] args) throws IOException {

        System.out.println("Début du programme");

        /**
         * Chemin des fichier de symptomes et result.out.txt
         */
        String filepath = "ressources/symptoms.txt";
        String outputFilePath = "ressources/result.out";

        /**
         * Lecture des symptomes à partir du fichier symptoms.txt
         */
        System.out.println("Lecture des symptômes à partir du fichier : " + filepath);
        ISymptomReader symptomReader = new ReadSymptomDataFromFile(filepath);

        /**
         * Création de l'objet AnalyticsCounter pour compter et trier les symptomes
         */
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(symptomReader);

        /**
         * Comptage du nombre d'occurrences de chaque symptome et tri par ordre alphabétique
         */
        System.out.println("Comptage du nombre d'occurrences de chaque symptôme");
        Map<String, Integer> symptomCountMap = analyticsCounter.countSymptoms();

        /**
         * Affichage des symptomes triés et leur nombre d'occurrence dans la console
         */
        System.out.println("Symptômes triés par ordre alphabétique et leur nombre d'occurrence :");
        symptomCountMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("Écriture des symptômes triés et leur nombre d'occurrence dans le fichier : " + outputFilePath);
        ISymptomWriter symptomWriter = new WriteSymptomDataToFile();
        symptomWriter.writeSymptomToFile(symptomCountMap, outputFilePath);

        System.out.println("Fin du programme");
    }
}