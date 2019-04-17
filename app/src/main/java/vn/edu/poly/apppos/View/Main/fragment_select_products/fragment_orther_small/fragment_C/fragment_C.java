package vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_orther_small.fragment_C;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import vn.edu.poly.apppos.Adapter.CustomGridViewOther;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Presenter.fragment_C.PTVfragment_C;
import vn.edu.poly.apppos.R;

public class fragment_C extends Base implements PTVfragment_C {
    View view;
    GridView grid_view_orther;
    vn.edu.poly.apppos.Presenter.fragment_C.fragment_C fragment_c;
    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.fragment_orther_c, parent, false);
    }

    @Override
    public void initView() {
        grid_view_orther = view.findViewById(R.id.grid_view_orther);
    }

    @Override
    public void initData() {
        fragment_c = new vn.edu.poly.apppos.Presenter.fragment_C.fragment_C(this,getContext());
        fragment_c.initData();
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
