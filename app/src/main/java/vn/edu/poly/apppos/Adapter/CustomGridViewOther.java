package vn.edu.poly.apppos.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import vn.edu.poly.apppos.Contructor.ContructorGirdviewOther;
import vn.edu.poly.apppos.Contructor.ContructorLibrary;
import vn.edu.poly.apppos.R;

public class CustomGridViewOther extends BaseAdapter {

    private Context mContext;
    ArrayList<ContructorGirdviewOther> arrayList;
    LayoutInflater inflater;

    public CustomGridViewOther(Context mContext, ArrayList<ContructorGirdviewOther> arrayList) {
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
            convertView = inflater.inflate(R.layout.custom_girdview_orther, null);
            viewHolder.linearLayout_background_other = convertView.findViewById(R.id.linearLayout_background_other);
            viewHolder.relativeLayout_background_other = convertView.findViewById(R.id.relativeLayout_background_other);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ContructorGirdviewOther contructorGirdviewOther = arrayList.get(i);
        if (contructorGirdviewOther.getPosition() == 0) {
            viewHolder.linearLayout_background_other.setBackgroundResource(R.drawable.background_green_other);
            viewHolder.relativeLayout_background_other.setBackgroundResource(R.drawable.background_green_other_radius);
            viewHolder.relativeLayout_background_other.setVisibility(View.VISIBLE);
        } else if (contructorGirdviewOther.getPosition() == 1) {
            viewHolder.linearLayout_background_other.setBackgroundResource(R.drawable.background_orange_other);
            viewHolder.relativeLayout_background_other.setBackgroundResource(R.drawable.background_orange_other_radius);
            viewHolder.relativeLayout_background_other.setVisibility(View.VISIBLE);
        } else if (contructorGirdviewOther.getPosition() == 2) {
            viewHolder.linearLayout_background_other.setBackgroundResource(R.drawable.background_blue_other);
            viewHolder.relativeLayout_background_other.setVisibility(View.INVISIBLE);
        } else if (contructorGirdviewOther.getPosition() == 3) {
            viewHolder.linearLayout_background_other.setBackgroundResource(R.drawable.background_red_other);
            viewHolder.relativeLayout_background_other.setVisibility(View.INVISIBLE);
        }
        return convertView;
    }

    class ViewHolder {
        LinearLayout linearLayout_background_other;
        RelativeLayout relativeLayout_background_other;
    }

}
