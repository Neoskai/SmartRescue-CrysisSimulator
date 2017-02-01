package com.smartcity;

import com.smartcity.entity.Crysis;
import com.smartcity.simulator.AbstractGenerator;
import com.smartcity.simulator.CrossSimulator;
import com.smartcity.simulator.RequestGenerator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CrossSimulator generator = new CrossSimulator();
        generator.run();
        System.out.println("Launching requests");


        // Step 1 : Retrieve configuration informations
        // Step 2: Generer la liste des requetes.
        // Step 3: Envoyer les requetes vers le serveur sur un interval de temps
        // Step 4: Intercepter les requetes vers les clients android pour generer des reponses acceptations / refus
        // Step 7: Simuler l'envoi de fin d'opération

        // Step 5: Monitorer l'etat des vehicules sur la base de données
        // Step 6: Calculer la durée moyenne d'intervention
        

        // Echelle: 1 sec = 5 min

        // A faire: Injecter une liste de locations de base pour les vehicules en fonction des perimetres

        /*
        Working Skeleton:
        Generation d'une requete vers le serveur
        Interception requete client puis generer la requete acceptation
        Receptionner la confirmation
        Simuler l'opération (thread sleep 5)
        envoyer la confirmation de fin

        Monitorer toute l'opération depuis le client.
         */
    }

}
