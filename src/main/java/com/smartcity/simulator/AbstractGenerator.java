package com.smartcity.simulator;

import com.smartcity.entity.Crysis;

import java.util.Scanner;

/**
 * Abstract generator
 * Created by lpotages on 01/02/17.
 */
public class AbstractGenerator {
    public Crysis crysisSelection(){
        Crysis crysis = Crysis.APOCALYPSE;

        System.out.println("-----========= Please choose the desired Crysis ======------");
        for(Crysis c : Crysis.values()){
            System.out.println("- " + c.getName());
        }
        Scanner reader = new Scanner(System.in);
        String crysisName = reader.nextLine();

        for(Crysis c: Crysis.values()){
            if (crysisName.equals(c.getName())){
                crysis = c;
            }
        }
        System.out.println("You chose crysis: " + crysis +"\n");

        return crysis;
    }
}
