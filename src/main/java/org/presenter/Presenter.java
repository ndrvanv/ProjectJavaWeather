package org.presenter;

import ui.View;
import weatherApi.Service;
import weatherApi.weather.Weather;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void onClick(String city) {
        String answer = service.getInfo(city);
        view.answer(answer);
    }
}
