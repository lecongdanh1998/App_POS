package vn.edu.poly.apppos.View.Main.fragment_select_customer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import vn.edu.poly.apppos.Adapter.CustomListviewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewTotalActivity;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Presenter.Customer.PTVCustomer;
import vn.edu.poly.apppos.R;

public class Customer extends Base implements PTVCustomer, View.OnClickListener {
    View view;
    ListView listview_products, listview_products_total;
    vn.edu.poly.apppos.Presenter.Customer.Customer customer;
    ImageView img_select_type;

    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        return view = inflater.inflate(R.layout.fragment_select_customer, parent, false);
    }

    @Override
    public void initView() {
        img_select_type = view.findViewById(R.id.img_select_type);
        listview_products_total = view.findViewById(R.id.lst_products_total);
        listview_products = view.findViewById(R.id.lst_products);
    }
    @Override
    public void initData() {
        customer = new vn.edu.poly.apppos.Presenter.Customer.Customer(this, getContext());
        customer.initData();
        customer.initDataTotal();

    }

    @Override
    public void initOnClick() {
        img_select_type.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_select_type:
                break;
        }
    }
    @Override
    public void onData(CustomListviewActivity adapter) {
        listview_products.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        setListViewHeightBasedOnChildren(listview_products);
    }

    @Override
    public void onDataTotal(CustomListviewTotalActivity adapter) {
        listview_products_total.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        setListViewHeightBasedOnChildren(listview_products_total);
    }


    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null)
            return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }




}
