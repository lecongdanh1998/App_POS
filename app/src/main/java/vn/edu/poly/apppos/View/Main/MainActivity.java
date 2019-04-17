package vn.edu.poly.apppos.View.Main;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import vn.edu.poly.apppos.Adapter.CustomListviewActivityCustomerMain;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsClickMain;
import vn.edu.poly.apppos.Component.BaseActivity.Base;
import vn.edu.poly.apppos.Model.Customer.connective.OnNumberChangeCallback;
import vn.edu.poly.apppos.Model.Fragment_products_small.onDataContructor;
import vn.edu.poly.apppos.Model.Fragment_select_Products.OnNumberChangeCallbackList;
import vn.edu.poly.apppos.Presenter.Main.Main;
import vn.edu.poly.apppos.Presenter.Main.PTVMain;
import vn.edu.poly.apppos.R;
import vn.edu.poly.apppos.View.Employees.EmployeesActivity;

public class MainActivity extends Base implements PTVMain, View.OnClickListener, OnNumberChangeCallbackList, onDataContructor {
    Main main;
    Fragment fragment_customer, fragment_products;
    OnNumberChangeCallback callback;
    ImageView img_select_type;
    int encode;
    ListView lst_main_customer, lst_main_customer1;
    Dialog dialogAddproducts;
    ImageView img_btn_close, img_menu_products;
    LinearLayout linearLayout_black_customer_main, linearLayout_black_customer_main1;
    RelativeLayout relativeLayout_black_customer_main, customer_relativeLayout, relativeLayout_black_customer_main1;

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        img_menu_products = findViewById(R.id.img_menu_products);
        lst_main_customer1 = findViewById(R.id.lst_main_customer1);
        linearLayout_black_customer_main1 = findViewById(R.id.linearLayout_black_customer_main1);
        relativeLayout_black_customer_main1 = findViewById(R.id.relativeLayout_black_customer_main1);
        fragment_customer = getSupportFragmentManager().findFragmentById(R.id.fragment_customer);
        fragment_products = getSupportFragmentManager().findFragmentById(R.id.fragment_products);
        img_select_type = findViewById(R.id.img_select_type);
        lst_main_customer = findViewById(R.id.lst_main_customer);
        linearLayout_black_customer_main = findViewById(R.id.linearLayout_black_customer_main);
        relativeLayout_black_customer_main = findViewById(R.id.relativeLayout_black_customer_main);
        customer_relativeLayout = findViewById(R.id.customer_relativeLayout);

    }

    @Override
    protected void initData() {
        main = new Main(this, this);
        main.initDataCustomerList();
        main.initDataProductsClick();
        relativeLayout_black_customer_main.setVisibility(View.GONE);
        linearLayout_black_customer_main.setVisibility(View.GONE);
        relativeLayout_black_customer_main1.setVisibility(View.GONE);
        linearLayout_black_customer_main1.setVisibility(View.GONE);

    }

    @Override
    protected void initOnClick() {
        img_menu_products.setOnClickListener(this);
        relativeLayout_black_customer_main1.setOnClickListener(this);
        relativeLayout_black_customer_main.setOnClickListener(this);
        img_select_type.setOnClickListener(this);
        customer_relativeLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_select_type:
                initChange();
                break;
            case R.id.relativeLayout_black_customer_main:
                relativeLayout_black_customer_main.setVisibility(View.GONE);
                linearLayout_black_customer_main.setVisibility(View.GONE);
                break;
            case R.id.customer_relativeLayout:
                relativeLayout_black_customer_main.setVisibility(View.VISIBLE);
                linearLayout_black_customer_main.setVisibility(View.VISIBLE);
                break;
            case R.id.relativeLayout_black_customer_main1:
                linearLayout_black_customer_main1.setVisibility(View.GONE);
                relativeLayout_black_customer_main1.setVisibility(View.GONE);
                break;
            case R.id.img_btn_close:
                dialogAddproducts.cancel();
                break;
            case R.id.img_menu_products:
                initIntentView(EmployeesActivity.class);
                break;
        }
    }

    public void initChange() {
        if (encode == 0) {
            callback.onConnective(encode);
            img_select_type.setImageResource(R.drawable.ic_apps_white_24dp);
            encode = 1;
        } else if (encode == 1) {
            callback.onConnective(encode);
            img_select_type.setImageResource(R.drawable.ic_format_list_bulleted_white_24dp);
            encode = 0;
        }
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof OnNumberChangeCallback) {
            callback = (OnNumberChangeCallback) fragment;
        }
    }


    private void initIntentView(Class c) {
        Intent mainIntent = new Intent(this, c);
        startActivity(mainIntent);
    }

    @Override
    public void onDataCustomerList(CustomListviewActivityCustomerMain adapter) {
        lst_main_customer.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDataProductsClick(CustomListviewProductsClickMain adapter) {
        lst_main_customer1.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onConnectiveList(int Request) {
        linearLayout_black_customer_main1.setVisibility(View.VISIBLE);
        relativeLayout_black_customer_main1.setVisibility(View.VISIBLE);
    }

    @Override
    public void DataContructor() {
        initdialogAddproducts();
    }

    public void initdialogAddproducts() {
        dialogAddproducts = new Dialog(this);
        dialogAddproducts.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogAddproducts.setContentView(R.layout.dialog_add_products);
        dialogAddproducts.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialogAddproducts.setCancelable(false);
        img_btn_close = dialogAddproducts.findViewById(R.id.img_btn_close);
        img_btn_close.setOnClickListener(this);
        dialogAddproducts.show();
    }
}
