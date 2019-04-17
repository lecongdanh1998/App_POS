package vn.edu.poly.apppos.Presenter.Fragment_products_small;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Adapter.CustomGridViewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsListActivity;
import vn.edu.poly.apppos.Model.Fragment_products_small.MTPProductsSmall;
import vn.edu.poly.apppos.Model.Fragment_select_Products.MTPProducts;

public class Products_small implements MTPProductsSmall {
    PTVProductsSmall ptvProductsSmall;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.Fragment_products_small.Products_small products_small;

    public Products_small(PTVProductsSmall ptvProductsSmall, Context context) {
        this.ptvProductsSmall = ptvProductsSmall;
        this.context = context;
        this.activity = (Activity) context;
        products_small = new vn.edu.poly.apppos.Model.Fragment_products_small.Products_small(this, context);
    }

    public void initData() {
        products_small.initData();
    }
    public void initDataList() {
        products_small.initDataList();
    }

    @Override
    public void onData(CustomGridViewActivity adpter) {
        ptvProductsSmall.onData(adpter);
    }

    @Override
    public void onDataList(CustomListviewProductsListActivity adapter) {
        ptvProductsSmall.onDataList(adapter);
    }
}
