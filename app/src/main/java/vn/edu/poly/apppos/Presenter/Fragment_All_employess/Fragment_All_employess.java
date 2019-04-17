package vn.edu.poly.apppos.Presenter.Fragment_All_employess;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomListviewAllemPloyees;
import vn.edu.poly.apppos.Contructor.ContructorListViewAllemPloyees;
import vn.edu.poly.apppos.Model.Fragment_All_employess.MTPFragment_All_employess;

public class Fragment_All_employess implements MTPFragment_All_employess {
    vn.edu.poly.apppos.Model.Fragment_All_employess.Fragment_All_employess fragment_all_employess;
    PTVFragment_All_employess ptvFragment_all_employess;
    Context context;
    Activity activity;


    public Fragment_All_employess(PTVFragment_All_employess ptvFragment_all_employess, Context context) {
        this.ptvFragment_all_employess = ptvFragment_all_employess;
        this.context = context;
        this.activity = (Activity) context;
        fragment_all_employess = new vn.edu.poly.apppos.Model.Fragment_All_employess.Fragment_All_employess(this, context);
    }

    public void initDataEmployees(){
        fragment_all_employess.initDataEmployees();
    }

    @Override
    public void onDataEmployees(CustomListviewAllemPloyees adapter,int size) {
        ptvFragment_all_employess.onDataEmployees(adapter,size);
    }
}
