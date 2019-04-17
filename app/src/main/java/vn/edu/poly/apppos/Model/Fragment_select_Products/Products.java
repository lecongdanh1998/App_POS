package vn.edu.poly.apppos.Model.Fragment_select_Products;

import android.app.Activity;
import android.content.Context;

public class Products {
    MTPProducts mtpProducts;
    Context context;
    Activity activity;

    public Products(MTPProducts mtpProducts, Context context) {
        this.mtpProducts = mtpProducts;
        this.context = context;
        this.activity = (Activity) context;
    }
}
