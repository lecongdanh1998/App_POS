package vn.edu.poly.apppos.Model.Main;

import vn.edu.poly.apppos.Adapter.CustomListviewActivityCustomerMain;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsClickMain;

public interface MTPMain {
    void onDataCustomerList(CustomListviewActivityCustomerMain adapter);
    void onDataProductsClick(CustomListviewProductsClickMain adapter);
}
