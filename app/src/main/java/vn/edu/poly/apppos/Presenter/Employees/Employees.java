package vn.edu.poly.apppos.Presenter.Employees;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Model.Employees.MTPEmployees;

public class Employees implements MTPEmployees {
    PTVEmployees ptvEmployees;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.Employees.Employees employees;

    public Employees(PTVEmployees ptvEmployees, Context context) {
        this.ptvEmployees = ptvEmployees;
        this.context = context;
        this.activity = (Activity) context;
        employees = new vn.edu.poly.apppos.Model.Employees.Employees(this, context);
    }
}
