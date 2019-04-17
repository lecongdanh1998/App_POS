package vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_products_small;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import vn.edu.poly.apppos.Adapter.CustomGridViewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsListActivity;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Model.Customer.connective.OnNumberChangeCallback;
import vn.edu.poly.apppos.Model.Fragment_products_small.onDataContructor;
import vn.edu.poly.apppos.Model.Fragment_select_Products.OnNumberChangeCallbackList;
import vn.edu.poly.apppos.Presenter.Fragment_products_small.PTVProductsSmall;
import vn.edu.poly.apppos.R;

public class Products_small extends Base implements PTVProductsSmall, OnNumberChangeCallback, AdapterView.OnItemClickListener {
    vn.edu.poly.apppos.Presenter.Fragment_products_small.Products_small products_small;
    View view;
    GridView gridView;
    ListView listView;
    onDataContructor dataContructor;

    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.fragment_products_small, parent, false);
    }

    @Override
    public void initView() {
        gridView = view.findViewById(R.id.grid_view_products_small);
        listView = view.findViewById(R.id.listview_list);
    }

    @Override
    public void initData() {
        products_small = new vn.edu.poly.apppos.Presenter.Fragment_products_small.Products_small(this, getContext());
        products_small.initData();
        products_small.initDataList();
        listView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void initOnClick() {
        gridView.setOnItemClickListener(this);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onData(CustomGridViewActivity adapter) {
        gridView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDataList(CustomListviewProductsListActivity adapter) {
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void initChange(int Request) {
        if (Request == 0) {
            gridView.setVisibility(View.INVISIBLE);
            listView.setVisibility(View.VISIBLE);
        } else if (Request == 1) {
            gridView.setVisibility(View.VISIBLE);
            listView.setVisibility(View.INVISIBLE);
        }
    }


    @Override
    public void onConnective(int Request) {
        initChange(Request);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        dataContructor.DataContructor();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof onDataContructor) {
            dataContructor = (onDataContructor) activity;
        }
    }
}
