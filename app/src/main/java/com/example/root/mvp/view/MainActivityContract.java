package com.example.root.mvp.view;

import com.android.volley.toolbox.StringRequest;
import com.example.root.mvp.base.BasePresenter;
import com.example.root.mvp.model.PojoMain;

import java.util.List;

/**
 * Created by root on 09/12/17.
 */

public class MainActivityContract {

    public interface View {
        void onSuccess(List<PojoMain.ResultsBean> data);
        void onError(String msg);
    }

    public interface Presenter extends BasePresenter<View> {
        void getData();
    }
}
