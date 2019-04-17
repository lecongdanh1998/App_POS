package vn.edu.poly.apppos.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import vn.edu.poly.apppos.Contructor.ContructorCustomerProductsTotal;
import vn.edu.poly.apppos.Contructor.ContructorListViewAllemPloyees;
import vn.edu.poly.apppos.R;

public class CustomListviewAllemPloyees extends BaseAdapter {

    private Context mContext;
    ArrayList<ContructorListViewAllemPloyees> arrayList;
    LayoutInflater inflater;
    int textA, positionA,
            textB, positionB,
            textC, positionC,
            textD, positionD,
            textE, positionE,
            textF, positionF,
            textG, positionG,
            textH, positionH;
    int size, positionSize;

    public CustomListviewAllemPloyees(Context mContext, ArrayList<ContructorListViewAllemPloyees> arrayList) {
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

    private int mSelectedPosition = 0;

    public void setSelectedItem(int itemPosition) {
        mSelectedPosition = itemPosition;
        notifyDataSetChanged();
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.custom_listview_all_employees, null);
            viewHolder.txt_bangchucai = convertView.findViewById(R.id.txt_bangchucai);
            viewHolder.txt_title_all_employees = convertView.findViewById(R.id.txt_title_all_employees);
            viewHolder.view_first = convertView.findViewById(R.id.view_first);
            viewHolder.txt_number_custom = convertView.findViewById(R.id.txt_number_custom);
            viewHolder.txt_role_all_employees = convertView.findViewById(R.id.txt_role_all_employees);
            viewHolder.relativeLayout_background_all_employees = convertView.findViewById(R.id.relativeLayout_background_all_employees);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ContructorListViewAllemPloyees library = arrayList.get(i);
        String name = library.getName().substring(0, 1);
        if (name.toString().equalsIgnoreCase("A")) {
            viewHolder.txt_bangchucai.setText("A");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textA == 0) {
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                viewHolder.view_first.setVisibility(View.VISIBLE);
                textA++;
                positionA = i;
            } else {
                if (positionA == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        } else if (name.toString().equalsIgnoreCase("B")) {
            viewHolder.txt_bangchucai.setText("B");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textB == 0) {
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                viewHolder.view_first.setVisibility(View.VISIBLE);
                textB++;
                positionB = i;
            } else {
                if (positionB == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        } else if (name.toString().equalsIgnoreCase("C")) {
            viewHolder.txt_bangchucai.setText("C");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textC == 0) {
                viewHolder.view_first.setVisibility(View.VISIBLE);
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                textC++;
                positionC = i;
            } else {
                if (positionC == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        } else if (name.toString().equalsIgnoreCase("D")) {
            viewHolder.txt_bangchucai.setText("D");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textD == 0) {
                viewHolder.view_first.setVisibility(View.VISIBLE);
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                textD++;
                positionD = i;
            } else {
                if (positionD == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        } else if (name.toString().equalsIgnoreCase("E")) {
            viewHolder.txt_bangchucai.setText("E");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textE == 0) {
                viewHolder.view_first.setVisibility(View.VISIBLE);
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                textE++;
                positionE = i;
            } else {
                if (positionE == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        } else if (name.toString().equalsIgnoreCase("F")) {
            viewHolder.txt_bangchucai.setText("F");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textF == 0) {
                viewHolder.view_first.setVisibility(View.VISIBLE);
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                textF++;
                positionF = i;
            } else {
                if (positionF == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        } else if (name.toString().equalsIgnoreCase("G")) {
            viewHolder.txt_bangchucai.setText("G");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textG == 0) {
                viewHolder.view_first.setVisibility(View.VISIBLE);
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                textG++;
                positionG = i;
            } else {
                if (positionG == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        } else if (name.toString().equalsIgnoreCase("H")) {
            viewHolder.txt_bangchucai.setText("H");
            viewHolder.txt_title_all_employees.setText(library.getName());
            if (textH == 0) {
                viewHolder.view_first.setVisibility(View.VISIBLE);
                viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                textH++;
                positionH = i;
            } else {
                if (positionH == i) {
                    viewHolder.view_first.setVisibility(View.VISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.VISIBLE);
                } else {
                    viewHolder.view_first.setVisibility(View.INVISIBLE);
                    viewHolder.txt_bangchucai.setVisibility(View.GONE);
                }
            }
        }
        if (i == mSelectedPosition) {
            viewHolder.relativeLayout_background_all_employees.setBackgroundColor(Color.parseColor("#0cc579"));
            viewHolder.txt_title_all_employees.setTextColor(Color.parseColor("#FFFFFF"));
            viewHolder.txt_role_all_employees.setTextColor(Color.parseColor("#FFFFFF"));
            viewHolder.txt_number_custom.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            viewHolder.relativeLayout_background_all_employees.setBackgroundColor(Color.parseColor("#FFFFFF"));
            viewHolder.txt_title_all_employees.setTextColor(Color.parseColor("#5e5e5e"));
            viewHolder.txt_role_all_employees.setTextColor(Color.parseColor("#5e5e5e"));
            viewHolder.txt_number_custom.setTextColor(Color.parseColor("#5e5e5e"));
        }
        return convertView;
    }


    class ViewHolder {
        View view_first;
        TextView txt_title_all_employees, txt_bangchucai, txt_number_custom, txt_role_all_employees;
        RelativeLayout relativeLayout_background_all_employees;
    }

}
