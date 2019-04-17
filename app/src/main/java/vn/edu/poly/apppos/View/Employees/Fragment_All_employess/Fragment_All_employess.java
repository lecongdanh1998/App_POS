package vn.edu.poly.apppos.View.Employees.Fragment_All_employess;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import vn.edu.poly.apppos.Adapter.CustomListviewAllemPloyees;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Model.Fragment_All_employess.TruyenDataInformation;
import vn.edu.poly.apppos.Presenter.Fragment_All_employess.PTVFragment_All_employess;
import vn.edu.poly.apppos.R;

public class Fragment_All_employess extends Base implements PTVFragment_All_employess, AdapterView.OnItemClickListener {
    View view;
    vn.edu.poly.apppos.Presenter.Fragment_All_employess.Fragment_All_employess fragment_all_employess;
    ListView lst_all_employees;
    int size;
    TruyenDataInformation dataContructor;
    CustomListviewAllemPloyees mListViewAdapter;

    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.fragment_all_employees, parent, false);
    }

    @Override
    public void initView() {
        lst_all_employees = view.findViewById(R.id.lst_all_employees);
    }

    @Override
    public void initData() {
        fragment_all_employess = new vn.edu.poly.apppos.Presenter.Fragment_All_employess.Fragment_All_employess(this, getContext());
        fragment_all_employess.initDataEmployees();
    }

    @Override
    public void initOnClick() {
        lst_all_employees.setOnItemClickListener(this);
    }

    @Override
    public void onDataEmployees(CustomListviewAllemPloyees adapter, int size) {
        lst_all_employees.setAdapter(adapter);
        this.mListViewAdapter = adapter;
        adapter.notifyDataSetChanged();
        this.size = size;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mListViewAdapter.setSelectedItem(position);
        dataContructor.onPosition(position);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof TruyenDataInformation) {
            dataContructor = (TruyenDataInformation) activity;
        }
    }

}
