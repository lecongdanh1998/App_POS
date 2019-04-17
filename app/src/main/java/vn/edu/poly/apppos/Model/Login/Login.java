package vn.edu.poly.apppos.Model.Login;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Util.ValidateForm;

public class Login {
    MTPLogin mtpLogin;
    Context context;
    Activity activity;

    public Login(MTPLogin mtpLogin, Context context) {
        this.mtpLogin = mtpLogin;
        this.context = context;
        this.activity = (Activity) context;
    }


    public void initLogin(int requestcode, String email, String password) {
        mtpLogin.onDataIntent(1);
        switch (requestcode) {
            case 0:
//                BaseActivity.editorResultUserName = BaseActivity.dataResultUserName.edit();
//                BaseActivity.editorResultUserName.putInt("codePassword", requestcode);
//                BaseActivity.editorResultUserName.putString("textEmail", email);
//                BaseActivity.editorResultUserName.putString("textPassword", "");
//                BaseActivity.editorResultUserName.commit();
                break;
            case 1:
//                BaseActivity.editorResultUserName = BaseActivity.dataResultUserName.edit();
//                BaseActivity.editorResultUserName.putInt("codePassword", requestcode);
//                BaseActivity.editorResultUserName.putString("textEmail", email);
//                BaseActivity.editorResultUserName.putString("textPassword", password);
//                BaseActivity.editorResultUserName.commit();
                break;
        }


//        if (new ValidateForm().validateTextEmpty(email) == false && new ValidateForm().validateTextEmpty(password) == false) {
//            mtpLogin.onDataIntent(1);
//        } else if (new ValidateForm().validateTextEmpty(email) == true && new ValidateForm().validateTextEmpty(password) == false) {
//            mtpLogin.onDataIntent(2);
//        } else if (new ValidateForm().validateTextEmpty(email) == false && new ValidateForm().validateTextEmpty(password) == true) {
//            mtpLogin.onDataIntent(3);
//        } else {
//            mtpLogin.onDataIntent(4);
//        }
    }
}
