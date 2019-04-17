package vn.edu.poly.apppos.View.Employees;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import vn.edu.poly.apppos.Component.BaseActivity.Base;
import vn.edu.poly.apppos.Model.Customer.connective.OnNumberChangeCallback;
import vn.edu.poly.apppos.Model.Employees.TruyenDataInformationMain;
import vn.edu.poly.apppos.Model.Fragment_All_employess.TruyenDataInformation;
import vn.edu.poly.apppos.Presenter.Employees.Employees;
import vn.edu.poly.apppos.Presenter.Employees.PTVEmployees;
import vn.edu.poly.apppos.R;

public class EmployeesActivity extends Base implements PTVEmployees, View.OnClickListener, TruyenDataInformation {
    Employees employees;
    TruyenDataInformationMain callback;
    ImageView img_menu_information;

    @Override
    protected int initLayout() {
        return R.layout.activity_employees;
    }

    @Override
    protected void initView() {
        img_menu_information = findViewById(R.id.img_menu_information);
    }

    @Override
    protected void initData() {
        employees = new Employees(this, this);
    }

    @Override
    protected void initOnClick() {
        img_menu_information.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_menu_information:
                onBackPressed();
                break;
        }
    }

    @Override
    public void onPosition(int position) {
        callback.onPosition(position);
    }


    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof TruyenDataInformationMain) {
            callback = (TruyenDataInformationMain) fragment;
        }
    }
}
