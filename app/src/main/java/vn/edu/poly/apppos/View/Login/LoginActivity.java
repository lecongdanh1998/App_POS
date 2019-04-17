package vn.edu.poly.apppos.View.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import vn.edu.poly.apppos.Component.BaseActivity.Base;
import vn.edu.poly.apppos.Presenter.Login.Login;
import vn.edu.poly.apppos.Presenter.Login.PTVLogin;
import vn.edu.poly.apppos.R;
import vn.edu.poly.apppos.View.Main.MainActivity;

public class LoginActivity extends Base implements PTVLogin, View.OnClickListener {
    Login login;
    Button btnLogin;
    EditText edtEmail, edtPassword;
    String email = "";
    String password = "";

    @Override
    protected int initLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        edtEmail = findViewById(R.id.email);
        edtPassword = findViewById(R.id.passwordLogin);
        btnLogin = findViewById(R.id.btn_login);
    }

    @Override
    protected void initData() {
        login = new Login(this, this);

    }

    @Override
    protected void initOnClick() {
        try {
            btnLogin.setOnClickListener(this);
            edtPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_SEARCH
                            || actionId == EditorInfo.IME_ACTION_DONE
                            || event.getAction() == KeyEvent.ACTION_DOWN
                            && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {

                        checkLogin();
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                checkLogin();
                break;
        }
    }

    private void checkLogin() {
        email = edtEmail.getText().toString().trim();
        password = edtPassword.getText().toString().trim();
        login.initLogin(1, email, password);
//        if (checkbox_password.isChecked()) {
//
//        } else {
//            presenterLogin.initLogin(0, email, password);
//        }
    }

    private void initIntentView(Class c) {
        Intent mainIntent = new Intent(this, c);
        startActivity(mainIntent);
    }

    @Override
    public void onDataIntent(int requestcode) {
        switch (requestcode) {
            case 1:
                initIntentView(MainActivity.class);
                break;
            case 2:
                edtEmail.setError("Please enter your email!");
                break;
            case 3:
                edtPassword.setError("Please enter your password!");
                break;
            case 4:
                edtEmail.setError("Please enter your email!");
                edtPassword.setError("Please enter your password!");
                break;
        }
    }
}
