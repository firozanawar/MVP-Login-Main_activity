package com.firozanwar.sample.mvp_login_main_activity.login;

import android.os.Handler;
import android.text.TextUtils;


/**
 * This is actual class where all the login is written.
 */
public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String userName, final String password, final onLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(userName)){
                    listener.onUserNameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
