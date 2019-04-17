package vn.edu.poly.apppos.Presenter.fragment_A;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Adapter.CustomGridViewOther;
import vn.edu.poly.apppos.Model.fragment_A.MTPfragment_A;

public class fragment_A implements MTPfragment_A {
    PTVfragment_A ptVfragment_a;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.fragment_A.fragment_A fragment_a;
    public fragment_A(PTVfragment_A ptVfragment_a, Context context) {
        this.ptVfragment_a = ptVfragment_a;
        this.context = context;
        this.activity = (Activity) context;
        fragment_a = new vn.edu.poly.apppos.Model.fragment_A.fragment_A(this,context);
    }

    public void initData(){
        fragment_a.initData();
    }

    @Override
    public void onData(CustomGridViewOther adapter) {
        ptVfragment_a.onData(adapter);
    }
}
