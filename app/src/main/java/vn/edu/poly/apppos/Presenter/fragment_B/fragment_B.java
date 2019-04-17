package vn.edu.poly.apppos.Presenter.fragment_B;

import android.app.Activity;
import android.content.Context;

import vn.edu.poly.apppos.Adapter.CustomGridViewOther;
import vn.edu.poly.apppos.Model.fragment_A.MTPfragment_A;
import vn.edu.poly.apppos.Model.fragment_B.MTPfragment_B;

public class fragment_B implements MTPfragment_B {
    PTVfragment_B ptVfragment_b;
    Context context;
    Activity activity;
    vn.edu.poly.apppos.Model.fragment_B.fragment_B fragment_b;
    public fragment_B(PTVfragment_B ptVfragment_b, Context context) {
        this.ptVfragment_b = ptVfragment_b;
        this.context = context;
        this.activity = (Activity) context;
        fragment_b = new vn.edu.poly.apppos.Model.fragment_B.fragment_B(this,context);
    }

    public void initData(){
        fragment_b.initData();
    }

    @Override
    public void onData(CustomGridViewOther adapter) {
        ptVfragment_b.onData(adapter);
    }
}
