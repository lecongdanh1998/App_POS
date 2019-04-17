package vn.edu.poly.apppos.Presenter.Customer;

import vn.edu.poly.apppos.Adapter.CustomListviewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewTotalActivity;

public interface PTVCustomer {
    void onData(CustomListviewActivity adapter);
    void onDataTotal(CustomListviewTotalActivity adapter);

}
