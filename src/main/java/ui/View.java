package ui;

import org.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);
    void start();

    void answer(String toString);
}
