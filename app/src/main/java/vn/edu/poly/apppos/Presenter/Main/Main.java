package vn.edu.poly.apppos.Presenter.Main;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Adapter.CustomListviewActivityCustomerMain;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsClickMain;
import vn.edu.poly.apppos.Model.Main.MTPMain;

public class Main implements MTPMain {
    PTVMain ptvMain;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.Main.Main main;

    public Main(PTVMain ptvMain, Context context) {
        this.ptvMain = ptvMain;
        this.context = context;
        this.activity = (Activity) context;
        main = new vn.edu.poly.apppos.Model.Main.Main(this, context);
    }

    public void initDataCustomerList(){
        main.initDataCustomerList();
    }

    public void initDataProductsClick(){
        main.initDataProductsClick();
    }

    @Override
    public void onDataCustomerList(CustomListviewActivityCustomerMain adapter) {
        ptvMain.onDataCustomerList(adapter);
    }

    @Override
    public void onDataProductsClick(CustomListviewProductsClickMain adapter) {
        ptvMain.onDataProductsClick(adapter);
    }
}
