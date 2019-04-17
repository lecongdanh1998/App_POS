package vn.edu.poly.apppos.Presenter.Main;

import vn.edu.poly.apppos.Adapter.CustomListviewActivityCustomerMain;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsClickMain;

public interface PTVMain {
    void onDataCustomerList(CustomListviewActivityCustomerMain adapter);
    void onDataProductsClick(CustomListviewProductsClickMain adapter);

}
