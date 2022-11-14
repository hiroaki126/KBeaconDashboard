package com.iot.kbeacondashboard;

public class DeviceInfo {
    String macAddress;
    float temperature;
    float humidity;

    public DeviceInfo() {
        macAddress = "";
        temperature = 0;
        humidity = 0;
    }

    public DeviceInfo(String macAddress, float temperature, float humidity) {
        this.macAddress = macAddress;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
