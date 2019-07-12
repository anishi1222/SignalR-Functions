package com.climateinfo;

import java.time.ZonedDateTime;

public class ClimateInfo {
    String device;
    String timestamp;
    float humid;
    float temp;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public float getHumid() {
        return humid;
    }

    public void setHumid(float humid) {
        this.humid = humid;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public ClimateInfo(){}

    public ClimateInfo(String device, String timestamp, float humid, float temp) {
        this.device=device;
        this.humid=humid;
        this.temp=temp;
        this.timestamp=timestamp;
    }
}

