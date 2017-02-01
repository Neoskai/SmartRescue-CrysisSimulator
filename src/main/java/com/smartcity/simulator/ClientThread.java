package com.smartcity.simulator;

import com.smartcity.entity.Services;

/**
 * Thread simulating the comportment of a client
 * Created by lpotages on 13/01/17.
 */
public class ClientThread extends Thread {

    private Services vehicleType;
    private String id;

    public ClientThread(Services vehicleType, String id ){
        this.vehicleType = vehicleType;
        this.id = id;
    }

    public void run() {
        // Traitement des demandes d'intervention (Disponible/ Acceptation ou pas)
        // Envoi de reponse au serveur GO
        // Traitement de l'acceptation du serveur go / Absence de reponse du serveur go

        // Etats possibles:
        // En intervention
        // Libre
        // EN attente de confirmation de traitement

        int randomNum = 1000 +(int)(Math.random() * 10000);
        try {
            Thread.sleep(randomNum);
        }catch(Exception e){
            System.err.println("Could not generate client thread");
        }
    }
}
