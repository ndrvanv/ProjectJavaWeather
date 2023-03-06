package ui;

import org.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        String city = scan();
        presenter.onClick(city);
    }
    private String scan() {
        System.out.println("Enter the city: ");
        return scanner.nextLine();
    }
    public void answer(String text) {
        System.out.println(text);
    }
}
