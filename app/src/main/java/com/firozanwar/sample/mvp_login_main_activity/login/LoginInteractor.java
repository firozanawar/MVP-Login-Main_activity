package com.firozanwar.sample.mvp_login_main_activity.login;


/**
 * LoginInteractor interface the methods the conditions can be occured on presenter's method.
 */
public interface LoginInteractor {

    interface onLoginFinishedListener{

        void onUserNameError();
        void onPasswordError();
        void onSuccess();
    }

    void login(String userName, String password,onLoginFinishedListener listener);
}
