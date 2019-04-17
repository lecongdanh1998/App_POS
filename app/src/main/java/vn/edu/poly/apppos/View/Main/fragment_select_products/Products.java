package vn.edu.poly.apppos.View.Main.fragment_select_products;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.AdapterTabLayoutFrangment;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Model.Customer.connective.OnNumberChangeCallback;
import vn.edu.poly.apppos.Model.Fragment_select_Products.OnNumberChangeCallbackList;
import vn.edu.poly.apppos.Presenter.Fragment_select_Products.PTVProducts;
import vn.edu.poly.apppos.R;
import vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_orther_small.Orther_small;
import vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_products_small.Products_small;

public class Products extends Base implements PTVProducts, View.OnClickListener, ViewPager.OnPageChangeListener {
    View view;
    public TabLayout tab_layout;
    public ViewPager mViewPager;
    ArrayList listFragment;
    ArrayList<String> listTitle;
    AdapterTabLayoutFrangment adapterTabLayoutFrangment;
    public TextView tabOne, tabTwo;
    public int index_change;
    vn.edu.poly.apppos.Presenter.Fragment_select_Products.Products products;
    OnNumberChangeCallbackList callbackList;
    int encode;
    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.fragment_select_products, parent, false);
    }

    @Override
    public void initView() {
        tab_layout = view.findViewById(R.id.tabLayout);
        mViewPager = view.findViewById(R.id.viewPager);
        tab_layout.setupWithViewPager(mViewPager);
    }

    @Override
    public void initData() {
        products = new vn.edu.poly.apppos.Presenter.Fragment_select_Products.Products(this, getContext());
        initTabLayOut();
        createTabIcons();
    }

    public void initTabLayOut() {
        listFragment = new ArrayList();
        listFragment.add(new Products_small());
        listFragment.add(new Orther_small());
        listTitle = new ArrayList<>();
        listTitle.add(getResources().getString(R.string.products));
        listTitle.add(getResources().getString(R.string.orther));
        adapterTabLayoutFrangment = new AdapterTabLayoutFrangment(
                getActivity().getSupportFragmentManager(), getContext(), listTitle, listFragment
        );
        mViewPager.setAdapter(adapterTabLayoutFrangment);

    }

    @Override
    public void initOnClick() {
        mViewPager.addOnPageChangeListener(this);
        tabOne.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab:
                callbackList.onConnectiveList(encode);
                mViewPager.setCurrentItem(0);
                break;
        }
    }

    private void createTabIcons() {
        tabOne = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tabsarena, null);
        tabOne.setText(getResources().getString(R.string.products));
        tabOne.setTextColor(getResources().getColor(R.color.color_background));
        tabOne.setBackground(getResources().getDrawable(R.drawable.border_tab));
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_keyboard_arrow_down_green_24dp, 0);
        tab_layout.getTabAt(0).setCustomView(tabOne);
        tabTwo = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tabsarena, null);
        tabTwo.setText(getResources().getString(R.string.orther));
        tab_layout.getTabAt(1).setCustomView(tabTwo);
        mViewPager.setCurrentItem(index_change);
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                tabOne.setText(getResources().getString(R.string.products));
                tabOne.setTextColor(getResources().getColor(R.color.color_background));
                tabOne.setBackground(getResources().getDrawable(R.drawable.border_tab));
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_keyboard_arrow_down_green_24dp, 0);
                tab_layout.getTabAt(0).setCustomView(tabOne);
                tabTwo.setText(getResources().getString(R.string.orther));
                tabTwo.setTextColor(getResources().getColor(R.color.colorWhite));
                tabTwo.setBackgroundColor(Color.TRANSPARENT);
                tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                tab_layout.getTabAt(1).setCustomView(tabTwo);
                // icon Tham quan
                // icon giỏ hàng
                break;
            case 1:

                tabOne.setText(getResources().getString(R.string.products));
                tabOne.setTextColor(getResources().getColor(R.color.colorWhite));
                tabOne.setBackgroundColor(Color.TRANSPARENT);
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_keyboard_arrow_down_white_24dp, 0);
                tab_layout.getTabAt(0).setCustomView(tabOne);

                tabTwo.setText(getResources().getString(R.string.orther));
                tabTwo.setTextColor(getResources().getColor(R.color.color_background));
                tabTwo.setBackground(getResources().getDrawable(R.drawable.border_tab));
                tab_layout.getTabAt(1).setCustomView(tabTwo);
                // icon Tham quan
                // icon giỏ hàng
                break;

        }

    }

    @Override
    public void onPageScrollStateChanged(int i) {
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof OnNumberChangeCallbackList) {
            callbackList = (OnNumberChangeCallbackList) activity;
        }
    }
}
