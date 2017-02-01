package com.smartcity.simulator;

import com.smartcity.entity.Services;

import java.util.ArrayList;
import java.util.List;

/**
 * Class handling the request for a server
 * Factory that creates the clientThreads when a request is done by the server
 * Created by lpotages on 13/01/17.
 */
public class ClientSimulator {

    List<ClientThread> clientPool;

    public ClientSimulator(){
        clientPool = new ArrayList<ClientThread>();
    }

    /**
     * Initializes the basic pool of elements
     * @param policeElem Number of police vehicle
     * @param ambulanceElem Number of ambulance vehicle
     * @param pompierElem Number of pompier vehicle
     */
    public void initializePool(int policeElem, int ambulanceElem, int pompierElem){
        for(int i = 0; i < policeElem; i++){
            clientPool.add(new ClientThread(Services.POLICE, "police-"+i));
        }

        for(int i = 0; i < ambulanceElem; i++){
            clientPool.add(new ClientThread(Services.AMBULANCE, "ambulance-"+i));
        }

        for(int i = 0; i < pompierElem; i++){
            clientPool.add(new ClientThread(Services.POMPIER, "pompier-"+i));
        }
    }
}
