package com.smartcity.simulator;

import com.smartcity.entity.Crysis;
import com.smartcity.entity.EmergencyRequest;
import com.smartcity.entity.Level;
import com.smartcity.entity.Services;
import com.smartcity.exchange.RequestSender;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Part of the simulator generating all requests to the server
 * Created by lpotages on 19/12/16.
 */
public class RequestGenerator extends AbstractGenerator implements Runnable{
    private Crysis crysisType;
    private List<EmergencyRequest> requestList;
    private RequestSender requestSender;

    public RequestGenerator(){
        requestList = new ArrayList<EmergencyRequest>();
        requestSender = new RequestSender();
    }

    public RequestGenerator(Crysis crysisType){
        this();
        this.crysisType = crysisType;
    }

    /**
     * Function launching all the initial requests depending on the crysis given in input
     */
    public void generateRequests(){
        // Depending on the crysis level for each part, launch requests to the service

        Level pompierLevel = crysisType.getPompierLevel();
        Level policeLevel = crysisType.getPoliceLevel();
        Level ambulanceLevel = crysisType.getAmbulanceLevel();

        requestList.add(new EmergencyRequest(Services.POMPIER,pompierLevel,AddressGenerator.getAdress()));
        requestList.add(new EmergencyRequest(Services.POLICE,policeLevel,AddressGenerator.getAdress()));
        requestList.add(new EmergencyRequest(Services.AMBULANCE,ambulanceLevel,AddressGenerator.getAdress()));
    }

    /**
     * Sending all the requests to the server
     */
    public void run(){
        crysisType = this.crysisSelection();
        for(EmergencyRequest request : requestList){
            try {
                Thread.sleep(1000);
                requestSender.sendEmergency(request);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("All requests sent");
    }
}
