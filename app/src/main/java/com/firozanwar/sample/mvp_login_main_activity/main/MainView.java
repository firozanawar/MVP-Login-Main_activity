package com.firozanwar.sample.mvp_login_main_activity.main;

import java.util.List;

/**
 * Created by firozanwar on 17/10/17.
 */

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
