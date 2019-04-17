package vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_orther_small;

import android.content.Context;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import vn.edu.poly.apppos.Adapter.AdapterTabLayoutFrangment;
import vn.edu.poly.apppos.Component.BaseFragment.Base;
import vn.edu.poly.apppos.Component.MyViewPagerAdapter;
import vn.edu.poly.apppos.R;
import vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_orther_small.fragment_A.fragment_A;
import vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_orther_small.fragment_B.fragment_B;
import vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_orther_small.fragment_C.fragment_C;
import vn.edu.poly.apppos.View.Main.fragment_select_products.fragment_products_small.Products_small;

public class Orther_small extends Base implements ViewPager.OnPageChangeListener {
    View view;
    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    ArrayList listFragment;
    ArrayList<String> listTitle;
    AdapterTabLayoutFrangment adapterTabLayoutFrangment;
    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.fragment_orther_small, parent, false);
    }

    @Override
    public void initView() {
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        dotsLayout = (LinearLayout) view.findViewById(R.id.layoutDots);

    }

    @Override
    public void initData() {
        listFragment = new ArrayList();
        listFragment.add(new fragment_A());
        listFragment.add(new fragment_B());
        listFragment.add(new fragment_C());
        addBottomDots(0);
        listTitle = new ArrayList<>();
        listTitle.add("A");
        listTitle.add("B");
        listTitle.add("C");
        adapterTabLayoutFrangment = new AdapterTabLayoutFrangment(
                getChildFragmentManager(), getContext(),listTitle, listFragment
        );
        viewPager.setAdapter(adapterTabLayoutFrangment);
    }

    @Override
    public void initOnClick() {
        viewPager.addOnPageChangeListener(this);
    }

    private void addBottomDots(int currentPage) {
        dots = new TextView[listFragment.size()];
        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(getContext());
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInactive[currentPage]);
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0)
            dots[currentPage].setTextColor(colorsActive[currentPage]);
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        addBottomDots(i);

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}
