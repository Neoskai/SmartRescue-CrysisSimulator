package com.smartcity.simulator;

import com.smartcity.entity.Crysis;
import com.smartcity.entity.Services;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

/**
 * Advanced generator
 * Created by lpotages on 01/02/17.
 */

public class CrossSimulator extends AbstractGenerator implements Runnable{
    private Crysis crysisType;

    public void run() {
        crysisType = crysisSelection();

        ServiceRequestThread pompierThread = new ServiceRequestThread(crysisType, Services.POMPIER);
        ServiceRequestThread ambulanceThread = new ServiceRequestThread(crysisType, Services.AMBULANCE);
        ServiceRequestThread policeThread = new ServiceRequestThread(crysisType,Services.POLICE);

        pompierThread.start();
        ambulanceThread.start();
        policeThread.start();
    }
}
