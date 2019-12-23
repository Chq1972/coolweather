package com.coolweather.android;

import java.io.Serializable;

public class DataSerializable implements Serializable {
    private String weatherID;

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public String getWeatherID() {
        return weatherID;
    }
}
