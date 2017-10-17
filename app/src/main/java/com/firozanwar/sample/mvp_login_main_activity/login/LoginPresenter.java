package com.firozanwar.sample.mvp_login_main_activity.login;


/**
 * Presenter contains all the methods which shows the operation on UI by some click etc.
 * e.g validate, item click etc.
 */
public interface LoginPresenter {

    void validateCredentials(String username,String passwor);
    void onDestroy();
}
