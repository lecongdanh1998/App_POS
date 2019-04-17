package vn.edu.poly.apppos.Presenter.Customer;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Adapter.CustomListviewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewTotalActivity;
import vn.edu.poly.apppos.Model.Customer.MTPCustomer;

public class Customer implements MTPCustomer {
    PTVCustomer ptvCustomer;
    Activity activity;
    Context context;
    vn.edu.poly.apppos.Model.Customer.Customer customer;

    public Customer(PTVCustomer ptvCustomer, Context context) {
        this.ptvCustomer = ptvCustomer;
        this.context = context;
        this.activity = (Activity) context;
        customer = new vn.edu.poly.apppos.Model.Customer.Customer(this,context);
    }

    public void initDataTotal(){
        customer.initDataTotal();
    }

    public void initData(){
        customer.initData();
    }

    @Override
    public void onData(CustomListviewActivity adapter) {
        ptvCustomer.onData(adapter);
    }

    @Override
    public void onDataTotal(CustomListviewTotalActivity adapter) {
        ptvCustomer.onDataTotal(adapter);
    }
}
