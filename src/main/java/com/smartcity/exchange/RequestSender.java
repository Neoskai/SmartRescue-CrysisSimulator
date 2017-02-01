package com.smartcity.exchange;

import com.mashape.unirest.http.Unirest;
import com.smartcity.entity.EmergencyRequest;

/**
 * Class responsible to send request to the server concerned
 * Created by lpotages on 19/12/16.
 */

public class RequestSender {
    String SERVER_ENDPOINT;

    public RequestSender(){
        //SERVER_ENDPOINT = "http://morning-beyond-41458.herokuapp.com/java";
        SERVER_ENDPOINT = "http://localhost:1234/java";
    }

    /**
     * Function that sends a request to the server
     * @param newRequest The request to send
     */
    public void sendEmergency(EmergencyRequest newRequest) {
        try {
            Unirest.post(SERVER_ENDPOINT)
                    .field("emergencyLevel", newRequest.getEmergencyLevel().name())
                    .field("address", newRequest.getAddress())
                    .field("service", newRequest.getService().name())
                    .asString();
        } catch (Exception e){
            System.err.println(e);
            System.err.println("Could not send request to server");
        }
    }
}
