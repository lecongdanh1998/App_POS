package vn.edu.poly.apppos.Model.Customer;

import vn.edu.poly.apppos.Adapter.CustomGridViewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewTotalActivity;

public interface MTPCustomer {
    void onData(CustomListviewActivity adapter);
    void onDataTotal(CustomListviewTotalActivity adapter);
}
