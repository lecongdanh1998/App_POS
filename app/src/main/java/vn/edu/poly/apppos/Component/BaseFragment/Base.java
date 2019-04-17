package vn.edu.poly.apppos.Component.BaseFragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class Base extends Fragment {
    public static SharedPreferences dataPostionEmployees;
    public static SharedPreferences.Editor editorPostionEmployees;
    private View mViewBase;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewBase = provideYourFragmentView(inflater, container, savedInstanceState);
        initEditor();
        initView();
        initData();
        initOnClick();
        return mViewBase;
    }

    private void initEditor() {
        dataPostionEmployees = getActivity().getSharedPreferences("data_PostionEmployees", getActivity().MODE_PRIVATE);
    }

    public abstract View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState);

    public abstract void initView();

    public abstract void initData();

    public abstract void initOnClick();


}
