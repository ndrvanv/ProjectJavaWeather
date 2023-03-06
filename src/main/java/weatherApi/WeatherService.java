package weatherApi;

import weatherApi.weather.Weather;

public class WeatherService implements Service{
    private Connection connection;
    private Formatter formatter;
    private static final String EMPTY_ERROR = "You did not the city!";

    public WeatherService() {
        connection = new Connection();
        formatter = new Formatter();
    }

    @Override
    public String getInfo(String city) {
        if (city.equals("")) {
            return EMPTY_ERROR;
        }
        try {
            String info = connection.getInfo(city);
            Weather weather = formatter.parse(info);
            String answer = weather.toString();
            return answer;
        }
        catch (NullPointerException e) {
            return "Wrong city name!";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
