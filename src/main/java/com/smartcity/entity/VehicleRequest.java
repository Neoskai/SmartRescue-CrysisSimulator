package com.smartcity.entity;

/**
 * Vehicle Request
 * Created by lpotages on 13/01/17.
 */

public class VehicleRequest {
    private int emergencyId;
    private String vehicleId;

    public int getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(int emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
}
