package vn.edu.poly.apppos.Model.Employees;

import android.app.Activity;
import android.content.Context;

public class Employees {
    MTPEmployees mtpEmployees;
    Context context;
    Activity activity;

    public Employees(MTPEmployees mtpEmployees, Context context) {
        this.mtpEmployees = mtpEmployees;
        this.context = context;
        this.activity = (Activity) context;
    }
}
