import org.presenter.Presenter;
import ui.DesctopUI;
import ui.View;
import weatherApi.Service;
import weatherApi.WeatherService;

public class Main {
    public static void main(String[] args) {
        View view = new DesctopUI();
        Service service = new WeatherService();
        new Presenter(view, service);
        view.start();
    }
}
