package weatherApi.weather;

public class Weather {
    private Current current;
    private Location location;

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Weather: " + "\n" +
                "City: " + location.getName() + "\'" + "\n" +
                "Temperature: " + current.getTemperature() + "\n" +
                "Observation Time: " + current.getObservationTime() + "\'" + "\n" +
                "Pressure: " + current.getPressure() + "\n" +
                "Humidity: " + current.getHumidity() + "\n" +
                "lat: " + location.getLat() + "\'" + "\n" +
                "lot: " + location.getLon() + "\'";
    }
}
