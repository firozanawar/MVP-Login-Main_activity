package com.firozanwar.sample.mvp_login_main_activity.login;


/**
 * This is implementation class for Presenter which gets the call from view
 * and pass it to interactor. In Interactor the actual login is written.
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.onLoginFinishedListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String username, String passwor) {
        if(loginView!=null){
            loginView.showProgress();
        }

        loginInteractor.login(username,passwor,this);
    }

    @Override
    public void onDestroy() {
        loginView=null;
    }

    @Override
    public void onUserNameError() {
        if (loginView != null) {
            loginView.setUserNameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToMain();
        }
    }
}
