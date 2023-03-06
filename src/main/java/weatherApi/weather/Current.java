package weatherApi.weather;

public class Current {
    private int temperature;
    private String observation_time;
    private int pressure;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getObservationTime() {
        return observation_time;
    }

    public void setObservationTime(String observationTime) {
        this.observation_time = observationTime;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
