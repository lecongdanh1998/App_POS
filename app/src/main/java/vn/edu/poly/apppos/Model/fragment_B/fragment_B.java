package vn.edu.poly.apppos.Model.fragment_B;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomGridViewOther;
import vn.edu.poly.apppos.Contructor.ContructorGirdviewOther;

public class fragment_B {
    MTPfragment_B mtPfragment_b;
    Context context;
    Activity activity;
    ArrayList<ContructorGirdviewOther> arrayList;
    CustomGridViewOther adapter;

    public fragment_B(MTPfragment_B mtPfragment_b, Context context) {
        this.mtPfragment_b = mtPfragment_b;
        this.context = context;
        this.activity = (Activity) context;
        arrayList = new ArrayList<>();
    }


    public void initData() {
        arrayList.clear();
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(1));
        arrayList.add(new ContructorGirdviewOther(2));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(3));
        arrayList.add(new ContructorGirdviewOther(1));
        arrayList.add(new ContructorGirdviewOther(2));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(1));
        arrayList.add(new ContructorGirdviewOther(2));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(3));
        arrayList.add(new ContructorGirdviewOther(1));
        arrayList.add(new ContructorGirdviewOther(2));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(1));
        arrayList.add(new ContructorGirdviewOther(2));
        arrayList.add(new ContructorGirdviewOther(0));
        arrayList.add(new ContructorGirdviewOther(3));
        arrayList.add(new ContructorGirdviewOther(1));
        arrayList.add(new ContructorGirdviewOther(2));
        adapter = new CustomGridViewOther(context, arrayList);
        mtPfragment_b.onData(adapter);
    }
}
