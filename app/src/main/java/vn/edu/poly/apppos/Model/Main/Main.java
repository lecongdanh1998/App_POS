package vn.edu.poly.apppos.Model.Main;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomListviewActivityCustomerMain;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsClickMain;
import vn.edu.poly.apppos.Contructor.ContructorCustomerMain;
import vn.edu.poly.apppos.Contructor.ContructorProductsClickMain;
import vn.edu.poly.apppos.Model.Login.MTPLogin;

public class Main {
    MTPMain mtpMain;
    Context context;
    Activity activity;
    ArrayList<ContructorCustomerMain> arrayList;
    CustomListviewActivityCustomerMain adapter;
    ArrayList<ContructorProductsClickMain> arrayListProductsClick;
    CustomListviewProductsClickMain adapterProductsClick;
    public Main(MTPMain mtpMain, Context context) {
        this.mtpMain = mtpMain;
        this.context = context;
        this.activity = (Activity) context;
        arrayList = new ArrayList<>();
        arrayListProductsClick = new ArrayList<>();
    }
    
    public void initDataCustomerList(){
        arrayList.clear();
        for (int i = 0; i <5 ; i++) {
            arrayList.add(new ContructorCustomerMain());
        }
        adapter = new CustomListviewActivityCustomerMain(context, arrayList);
        mtpMain.onDataCustomerList(adapter);
    }

    public void initDataProductsClick(){
        arrayListProductsClick.clear();
        for (int i = 0; i <5 ; i++) {
            arrayListProductsClick.add(new ContructorProductsClickMain());
        }
        adapterProductsClick = new CustomListviewProductsClickMain(context, arrayListProductsClick);
        mtpMain.onDataProductsClick(adapterProductsClick);
    }
}
