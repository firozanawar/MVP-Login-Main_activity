package com.firozanwar.sample.mvp_login_main_activity.login;

/**
 * View or (LoginView) interface contains all the methods that happens
 * on the view/UI.
 */
public interface LoginView {

    void showProgress();
    void hideProgress();
    void setUserNameError();
    void setPasswordError();
    void navigateToMain();
}
