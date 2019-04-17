package vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_orther_small.fragment_A;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import vn.edu.poly.apppos.Adapter.CustomGridViewOther;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Presenter.fragment_A.PTVfragment_A;
import vn.edu.poly.apppos.R;

public class fragment_A extends Base implements PTVfragment_A {
    View view;
    GridView grid_view_orther;
    vn.edu.poly.apppos.Presenter.fragment_A.fragment_A fragment_a;
    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.fragment_orther_a, parent, false);
    }

    @Override
    public void initView() {
        grid_view_orther = view.findViewById(R.id.grid_view_orther);
    }

    @Override
    public void initData() {
        fragment_a = new vn.edu.poly.apppos.Presenter.fragment_A.fragment_A(this,getContext());
        fragment_a.initData();
    }

    @Override
    public void initOnClick() {

    }

    @Override
    public void onData(CustomGridViewOther adapter) {

        grid_view_orther.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
