package com.smartcity.simulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Adress Generator
 * Created by lpotages on 05/01/17.
 */
public class AddressGenerator {
    private static List<String> adresseAvailable = Arrays.asList(
            "10 boulevard notre dame 06600 Antibes",
            "20 Avenue des Aloes 0600 Antibes",
            "50 Avenue aristide Briant 0600 antibes",
            "7 Rue du Petit four 06600 Antibes",
            "22 Rue Bricka 06600 Antibes",
            "30 Rue du cannet 06600 Antibes"
    );
    public static String getAdress(){
        Random rand = new Random();
        int randomAddr = rand.nextInt((adresseAvailable.size()-1) + 1);

        return adresseAvailable.get(randomAddr);
    }
}
