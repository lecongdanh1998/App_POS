package vn.edu.poly.apppos.View.Employees.Fragment_Information;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomListviewAllemPloyees;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Contructor.ContructorListViewAllemPloyees;
import vn.edu.poly.apppos.Model.Employees.TruyenDataInformationMain;
import vn.edu.poly.apppos.Model.Fragment_All_employess.TruyenDataInformation;
import vn.edu.poly.apppos.Model.Fragment_products_small.onDataContructor;
import vn.edu.poly.apppos.Presenter.Fragment_Information.PTVFragment_Information;
import vn.edu.poly.apppos.R;

public class Fragment_Information extends Base implements PTVFragment_Information, TruyenDataInformationMain {
    vn.edu.poly.apppos.Presenter.Fragment_Information.Fragment_Information fragment_information;
    View view;
    ListView lst_dataposition_information;
    TextView txt_first_name;
    ArrayList<ContructorListViewAllemPloyees> arrayList;

    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.fragment_information, parent, false);
    }

    @Override
    public void initView() {
        txt_first_name = view.findViewById(R.id.txt_first_name);
        lst_dataposition_information = view.findViewById(R.id.lst_dataposition_information);
    }

    @Override
    public void initData() {
        fragment_information = new vn.edu.poly.apppos.Presenter.Fragment_Information.Fragment_Information(getContext(), this);
        fragment_information.initDataEmployees();
        initAddInformation(0);

    }

    @Override
    public void initOnClick() {

    }

    @Override
    public void onDataEmployees(CustomListviewAllemPloyees adapter, ArrayList<ContructorListViewAllemPloyees> arrayList) {
        lst_dataposition_information.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        this.arrayList = arrayList;
    }

    private void initAddInformation(int position) {
        txt_first_name.setText(arrayList.get(position).getName());
    }


    @Override
    public void onPosition(int position) {
        initAddInformation(position);
    }
}
