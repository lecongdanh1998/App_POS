package vn.edu.poly.apppos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import vn.edu.poly.apppos.Contructor.ContructorCustomerProducts;
import vn.edu.poly.apppos.Contructor.ContructorLibrary;
import vn.edu.poly.apppos.R;

public class CustomListviewActivity extends BaseAdapter {

    private Context mContext;
    ArrayList<ContructorCustomerProducts> arrayList;
    LayoutInflater inflater;

    public CustomListviewActivity(Context mContext, ArrayList<ContructorCustomerProducts> arrayList) {
        this.mContext = mContext;
        this.arrayList = arrayList;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.custom_listview_customer_products, null);
            viewHolder.viewfinal = convertView.findViewById(R.id.viewfinal);
//            viewHolder.android_gridview_image = (ImageView) convertView.findViewById(R.id.android_gridview_image);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ContructorCustomerProducts library = arrayList.get(i);
        if(arrayList.size() > 0){
            if(i == arrayList.size()-1){
                viewHolder.viewfinal.setVisibility(View.GONE);
            }
        }
//        Picasso.get()
//                .load(library.getImage())
//                .into(viewHolder.android_gridview_image);
        return convertView;
    }

    class ViewHolder {
        View viewfinal;
//        ImageView android_gridview_image;
    }

}
