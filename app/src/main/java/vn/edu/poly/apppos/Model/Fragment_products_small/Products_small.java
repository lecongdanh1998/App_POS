package vn.edu.poly.apppos.Model.Fragment_products_small;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

import vn.edu.poly.apppos.Adapter.CustomGridViewActivity;
import vn.edu.poly.apppos.Adapter.CustomListviewProductsListActivity;
import vn.edu.poly.apppos.Contructor.ContructorLibrary;
import vn.edu.poly.apppos.Contructor.ContructorProductsList;

public class Products_small {
    MTPProductsSmall mtpProductsSmall;
    Context context;
    Activity activity;
    ArrayList<ContructorLibrary> arrayList;
    CustomGridViewActivity adapter;
    ArrayList<ContructorProductsList> arrayListList;
    CustomListviewProductsListActivity adapterList;
    public Products_small(MTPProductsSmall mtpProductsSmall, Context context) {
        this.mtpProductsSmall = mtpProductsSmall;
        this.context = context;
        this.activity = (Activity) context;
        arrayList = new ArrayList<>();
        arrayListList = new ArrayList<>();
    }

    public void initData() {
        arrayList.clear();
        arrayList.add(new ContructorLibrary("http://cdn.shopify.com/s/files/1/1352/9125/products/oh_heck_-_gray_1200x1200.png?v=1542925362"));
        arrayList.add(new ContructorLibrary("https://static1.squarespace.com/static/5105d89ee4b0869f6416d903/5137a990e4b09e6afa7e25d6/5734a782e321401f984b4b90/1463068561152/c3-hat-front.png?format=500w"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8ymLzveVevkBiSkki9tcJiGjVaObo82zIUMapaE0KLxtHrHzO"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi1d4rAWn7xagwHgxOjnhnEmnXPuc6SuJiTQ4Xg3kZgTNIBpFmzA"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROJnnL3optxUfF7ToVKmna7e7cg71NYKBCBUYDO3wP8iJxsN6E"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqhY311qUpvvhYZy6SOaKCsJux0t6qgkeQG72rHEcwJ4eJDlS3"));
        arrayList.add(new ContructorLibrary("http://cdn.shopify.com/s/files/1/1352/9125/products/oh_heck_-_gray_1200x1200.png?v=1542925362"));
        arrayList.add(new ContructorLibrary("https://static1.squarespace.com/static/5105d89ee4b0869f6416d903/5137a990e4b09e6afa7e25d6/5734a782e321401f984b4b90/1463068561152/c3-hat-front.png?format=500w"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8ymLzveVevkBiSkki9tcJiGjVaObo82zIUMapaE0KLxtHrHzO"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi1d4rAWn7xagwHgxOjnhnEmnXPuc6SuJiTQ4Xg3kZgTNIBpFmzA"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROJnnL3optxUfF7ToVKmna7e7cg71NYKBCBUYDO3wP8iJxsN6E"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqhY311qUpvvhYZy6SOaKCsJux0t6qgkeQG72rHEcwJ4eJDlS3"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEPtCLlSEk9ZJFylzVwjxb4A_PDidEDJbOmdzK5r4vSUGfHTyZ"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDo8PGpCKnmmtQh3f1OnEikE5RS94niPpb-nu5WCDTr8FGxIqNGQ"));
        arrayList.add(new ContructorLibrary("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThzJHAtiRZ_outjmqVqncx1Ne-IS6LJlrr4yjWlw1GCZIWkviIxw"));
        adapter = new CustomGridViewActivity(context, arrayList);
        mtpProductsSmall.onData(adapter);
    }

    public void initDataList(){
        arrayListList.clear();
        arrayListList.add(new ContructorProductsList("http://cdn.shopify.com/s/files/1/1352/9125/products/oh_heck_-_gray_1200x1200.png?v=1542925362"));
        arrayListList.add(new ContructorProductsList("https://static1.squarespace.com/static/5105d89ee4b0869f6416d903/5137a990e4b09e6afa7e25d6/5734a782e321401f984b4b90/1463068561152/c3-hat-front.png?format=500w"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8ymLzveVevkBiSkki9tcJiGjVaObo82zIUMapaE0KLxtHrHzO"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi1d4rAWn7xagwHgxOjnhnEmnXPuc6SuJiTQ4Xg3kZgTNIBpFmzA"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROJnnL3optxUfF7ToVKmna7e7cg71NYKBCBUYDO3wP8iJxsN6E"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqhY311qUpvvhYZy6SOaKCsJux0t6qgkeQG72rHEcwJ4eJDlS3"));
        arrayListList.add(new ContructorProductsList("http://cdn.shopify.com/s/files/1/1352/9125/products/oh_heck_-_gray_1200x1200.png?v=1542925362"));
        arrayListList.add(new ContructorProductsList("https://static1.squarespace.com/static/5105d89ee4b0869f6416d903/5137a990e4b09e6afa7e25d6/5734a782e321401f984b4b90/1463068561152/c3-hat-front.png?format=500w"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8ymLzveVevkBiSkki9tcJiGjVaObo82zIUMapaE0KLxtHrHzO"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi1d4rAWn7xagwHgxOjnhnEmnXPuc6SuJiTQ4Xg3kZgTNIBpFmzA"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROJnnL3optxUfF7ToVKmna7e7cg71NYKBCBUYDO3wP8iJxsN6E"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqhY311qUpvvhYZy6SOaKCsJux0t6qgkeQG72rHEcwJ4eJDlS3"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEPtCLlSEk9ZJFylzVwjxb4A_PDidEDJbOmdzK5r4vSUGfHTyZ"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDo8PGpCKnmmtQh3f1OnEikE5RS94niPpb-nu5WCDTr8FGxIqNGQ"));
        arrayListList.add(new ContructorProductsList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThzJHAtiRZ_outjmqVqncx1Ne-IS6LJlrr4yjWlw1GCZIWkviIxw"));
        adapterList = new CustomListviewProductsListActivity(context, arrayListList);
        mtpProductsSmall.onDataList(adapterList);
    }

}
