package vn.edu.poly.apppos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import vn.edu.poly.apppos.Contructor.ContructorProductsClickMain;
import vn.edu.poly.apppos.Contructor.ContructorProductsList;
import vn.edu.poly.apppos.R;

public class CustomListviewProductsClickMain extends BaseAdapter {

    private Context mContext;
    ArrayList<ContructorProductsClickMain> arrayList;
    LayoutInflater inflater;

    public CustomListviewProductsClickMain(Context mContext, ArrayList<ContructorProductsClickMain> arrayList) {
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
            convertView = inflater.inflate(R.layout.custom_listview_product_click, null);
            viewHolder.viewfinal = convertView.findViewById(R.id.viewfinal);
//            viewHolder.img_avatar = convertView.findViewById(R.id.img_avatar);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ContructorProductsClickMain library = arrayList.get(i);
        if(arrayList.size() > 0){
            if(i == arrayList.size()-1){
                viewHolder.viewfinal.setVisibility(View.GONE);
            }
        }
//        Picasso.get()
//                .load(library.getImage())
//                .into(viewHolder.img_avatar);
        return convertView;
    }

    class ViewHolder {
        View viewfinal;
        CircleImageView img_avatar;
    }

}
