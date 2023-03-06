package weatherApi;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
//        Зарегистрироваться на сайте weatherstack.com для получения ключа
//http://api.weatherstack.com/current?access_key=f&query=moscow

public class Connection {
    private static final String apiKey = "";
    public String getInfo(String city) throws Exception{
        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city);
        URLConnection connection = url.openConnection();
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();

    }
}
