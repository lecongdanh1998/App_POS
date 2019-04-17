package vn.edu.poly.apppos.Model.Customer;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomGridViewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewTotalActivity;
import vn.edu.poly.apppos.Contructor.ContructorCustomerProducts;
import vn.edu.poly.apppos.Contructor.ContructorCustomerProductsTotal;
import vn.edu.poly.apppos.Contructor.ContructorLibrary;

public class Customer {
    MTPCustomer mtpCustomer;
    Activity activity;
    Context context;
    ArrayList<ContructorCustomerProducts> arrayList;
    CustomListviewActivity adapter;
    ArrayList<ContructorCustomerProductsTotal> arrayListTotal;
    CustomListviewTotalActivity adapterTotal;
    public Customer(MTPCustomer mtpCustomer, Context context) {
        this.mtpCustomer = mtpCustomer;
        this.context = context;
        this.activity = (Activity) context;
        arrayList = new ArrayList<>();
        arrayListTotal = new ArrayList<>();
    }
    public void initData() {
        arrayList.clear();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new ContructorCustomerProducts());

        }
        adapter = new CustomListviewActivity(context, arrayList);
        mtpCustomer.onData(adapter);
    }

    public void initDataTotal(){
        arrayListTotal.clear();
        for (int i = 0; i < 5; i++) {
            arrayListTotal.add(new ContructorCustomerProductsTotal());

        }
        adapterTotal = new CustomListviewTotalActivity(context, arrayListTotal);
        mtpCustomer.onDataTotal(adapterTotal);
    }
}
