package vn.edu.poly.apppos.Model.Fragment_Information;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import vn.edu.poly.apppos.Adapter.CustomListviewAllemPloyees;
import vn.edu.poly.apppos.Contructor.ContructorListViewAllemPloyees;

public class Fragment_Information  {
    MTPFragment_Information mtpFragment_information;
    Context context;
    Activity activity;
    ArrayList<ContructorListViewAllemPloyees> arrayList;
    CustomListviewAllemPloyees adapter;
    public Fragment_Information(MTPFragment_Information mtpFragment_information, Context context) {
        this.mtpFragment_information = mtpFragment_information;
        this.context = context;
        this.activity = (Activity) context;
        arrayList = new ArrayList<>();
    }
    public void initDataEmployees() {
        arrayList.clear();
        arrayList.add(new ContructorListViewAllemPloyees("B Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("A Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("C Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("D Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("E Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("F Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("G Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("B Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("A Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("C Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("B Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("A Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("a Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("C Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("D Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("E Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("F Staff"));
        arrayList.add(new ContructorListViewAllemPloyees("G Staff"));
        Collections.sort(arrayList, new Comparator<ContructorListViewAllemPloyees>() {
            @Override
            public int compare(ContructorListViewAllemPloyees o1, ContructorListViewAllemPloyees o2) {
                String nameFirst = o1.getName().substring(0,1);
                String nameTrue = o2.getName().substring(0,1);
                return nameFirst.toLowerCase().compareToIgnoreCase(nameTrue.toLowerCase());
            }
        });

        adapter = new CustomListviewAllemPloyees(context, arrayList);
        mtpFragment_information.onDataEmployees(adapter,arrayList);
    }
}
