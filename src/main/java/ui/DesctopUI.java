package ui;

import org.presenter.Presenter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DesctopUI extends JFrame implements View{
    private Label lCity;
    private JTextArea answer, zero;
    private TextField city;
    private Button findInfo;
    private Presenter presenter;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    public void start() {
        setSize(400, 600);
        lCity = new Label("City: ");
        answer = new JTextArea();
        zero = new JTextArea();
        findInfo = new Button("Check the weather: ");
        city = new TextField();

        setLayout(new GridLayout(3, 2));
        add(lCity);
        add(city);
        add(answer);
        add(zero);
        add(findInfo);

        findInfo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.onClick(city.getText());
            }
        });

        setVisible(true);
    }

    @Override
    public void answer(String answer) {
        this.answer.setText(answer);
    }
}
