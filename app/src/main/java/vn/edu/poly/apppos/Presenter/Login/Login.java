package vn.edu.poly.apppos.Presenter.Login;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Model.Login.MTPLogin;

public class Login implements MTPLogin {
    PTVLogin ptvLogin;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.Login.Login login;

    public Login(PTVLogin ptvLogin, Context context) {
        this.ptvLogin = ptvLogin;
        this.context = context;
        this.activity = (Activity) context;
        login = new vn.edu.poly.apppos.Model.Login.Login(this, context);
    }


    public void initLogin(int requestcode,String email, String password) {
        login.initLogin(requestcode,email,password);
    }

    @Override
    public void onDataIntent(int requestcode) {
        ptvLogin.onDataIntent(requestcode);
    }
}
