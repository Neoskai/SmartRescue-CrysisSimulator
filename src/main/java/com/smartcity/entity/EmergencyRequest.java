package com.smartcity.entity;

/**
 * Emergency request to send
 * Created by lpotages on 19/12/16.
 */
public class EmergencyRequest implements Request{

    public EmergencyRequest(){}

    public EmergencyRequest(Services service, Level emergencyLevel, String address){
        this.service = service;
        this.emergencyLevel = emergencyLevel;
        this.address = address;
    }

    private Services service;
    private Level emergencyLevel;
    private String address; // address of the emergency

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public Level getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(Level emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmergencyRequest request = (EmergencyRequest) o;

        if (service != request.service) return false;
        if (emergencyLevel != request.emergencyLevel) return false;
        return address.equals(request.address);

    }

    @Override
    public int hashCode() {
        int result = service.hashCode();
        result = 31 * result + emergencyLevel.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EmergencyRequest{" +
                "service=" + service +
                ", emergencyLevel=" + emergencyLevel +
                ", address='" + address + '\'' +
                '}';
    }
}
