package vn.edu.poly.apppos.Model.Fragment_Information;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomListviewAllemPloyees;
import vn.edu.poly.apppos.Contructor.ContructorListViewAllemPloyees;

public interface MTPFragment_Information {
    void onDataEmployees(CustomListviewAllemPloyees adapter,  ArrayList<ContructorListViewAllemPloyees> arrayList);

}
