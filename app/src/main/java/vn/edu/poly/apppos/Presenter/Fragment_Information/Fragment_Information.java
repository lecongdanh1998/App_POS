package vn.edu.poly.apppos.Presenter.Fragment_Information;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomListviewAllemPloyees;
import vn.edu.poly.apppos.Contructor.ContructorListViewAllemPloyees;
import vn.edu.poly.apppos.Model.Fragment_All_employess.Fragment_All_employess;
import vn.edu.poly.apppos.Model.Fragment_Information.MTPFragment_Information;

public class Fragment_Information implements MTPFragment_Information {
    vn.edu.poly.apppos.Model.Fragment_Information.Fragment_Information fragment_information;
    Context context;
    Activity activity;
    PTVFragment_Information ptvFragment_information;

    public Fragment_Information(Context context, PTVFragment_Information ptvFragment_information) {
        this.context = context;
        this.ptvFragment_information = ptvFragment_information;
        this.activity = (Activity) context;
        fragment_information = new vn.edu.poly.apppos.Model.Fragment_Information.Fragment_Information(this, context);
    }

    public void initDataEmployees() {
        fragment_information.initDataEmployees();
    }

    @Override
    public void onDataEmployees(CustomListviewAllemPloyees adapter, ArrayList<ContructorListViewAllemPloyees> arrayList) {
        ptvFragment_information.onDataEmployees(adapter, arrayList);
    }
}

