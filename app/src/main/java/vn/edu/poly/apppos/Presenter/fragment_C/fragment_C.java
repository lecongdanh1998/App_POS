package vn.edu.poly.apppos.Presenter.fragment_C;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Adapter.CustomGridViewOther;
import vn.edu.poly.apppos.Model.fragment_B.MTPfragment_B;
import vn.edu.poly.apppos.Model.fragment_C.MTPfragment_C;

public class fragment_C implements MTPfragment_C {
    PTVfragment_C ptVfragment_c;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.fragment_C.fragment_C fragment_c;
    public fragment_C(PTVfragment_C ptVfragment_c, Context context) {
        this.ptVfragment_c = ptVfragment_c;
        this.context = context;
        this.activity = (Activity) context;
        fragment_c = new vn.edu.poly.apppos.Model.fragment_C.fragment_C(this,context);
    }

    public void initData(){
        fragment_c.initData();
    }

    @Override
    public void onData(CustomGridViewOther adapter) {
        ptVfragment_c.onData(adapter);
    }
}
