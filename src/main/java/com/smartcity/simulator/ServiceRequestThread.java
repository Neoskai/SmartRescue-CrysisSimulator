package com.smartcity.simulator;

import com.smartcity.entity.Crysis;
import com.smartcity.entity.EmergencyRequest;
import com.smartcity.entity.Level;
import com.smartcity.entity.Services;
import com.smartcity.exchange.RequestSender;

import java.util.ArrayList;
import java.util.Random;

/**
 * Request Generator on a larger size
 * Created by lpotages on 01/02/17.
 */

public class ServiceRequestThread extends Thread{
    private Crysis crysisType;
    private Services service;

    private RequestSender requestSender;

    private ServiceRequestThread(){
        requestSender = new RequestSender();
    }

    public ServiceRequestThread(Crysis crysisType, Services service){
        this();
        this.crysisType = crysisType;
        this.service = service;
    }

    /**
     * Sending all the requests to the server
     */
    public void run(){
        int lowerBound, higherBound;
        Level level;
        Random rand = new Random();

        switch(service){
            case AMBULANCE:
                lowerBound = crysisType.getAmbulanceLevel().getLowerBound();
                higherBound = crysisType.getAmbulanceLevel().getHigherBound();
                level = crysisType.getAmbulanceLevel();
                break;
            case POLICE:
                lowerBound = crysisType.getPoliceLevel().getLowerBound();
                higherBound = crysisType.getPoliceLevel().getHigherBound();
                level = crysisType.getPoliceLevel();
                break;
            default:
                lowerBound = crysisType.getPompierLevel().getLowerBound();
                higherBound = crysisType.getPompierLevel().getHigherBound();
                level = crysisType.getPompierLevel();
                break;
        }

        while(true) {
            int randomSleep = rand.nextInt((higherBound - lowerBound) + 1) + lowerBound;
            try {
                Thread.sleep(randomSleep);
            } catch (Exception e){
                System.err.println("Error during sleep");
            }
            EmergencyRequest request = new EmergencyRequest();
            request.setEmergencyLevel(level);
            request.setService(service);
            request.setAddress(AddressGenerator.getAdress());
            requestSender.sendEmergency(request);
            System.out.println("Request sent by service: " + service.name());
        }
    }
}
