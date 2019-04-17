package vn.edu.poly.apppos.Presenter.Fragment_select_Products;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Model.Fragment_select_Products.MTPProducts;

public class Products implements MTPProducts {
    PTVProducts ptvProducts;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.Fragment_select_Products.Products products;

    public Products(PTVProducts ptvProducts, Context context) {
        this.ptvProducts = ptvProducts;
        this.context = context;
        this.activity= (Activity) context;
        products = new vn.edu.poly.apppos.Model.Fragment_select_Products.Products(this,context);
    }
}
