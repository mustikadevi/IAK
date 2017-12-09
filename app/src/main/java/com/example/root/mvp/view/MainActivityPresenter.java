package com.example.root.mvp.view;

import com.example.root.mvp.model.PojoMain.ResultsBean;
import com.example.root.mvp.presenter.MainActivityDataResource.MainActivityGetCallBack;
import com.example.root.mvp.presenter.MainActivityRepositories;
import com.example.root.mvp.view.MainActivityContract.View;

import java.util.List;

/**
 * Created by root on 09/12/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{
    MainActivityContract.View view;
    private MainActivityRepositories mainActivityRepositories;

    public MainActivityPresenter(MainActivityRepositories mainActivityRepositories) {
        this.mainActivityRepositories = mainActivityRepositories;
    }

    @Override
    public void onAttachView(View view) {
        this.view = view;
    }

    @Override
    public void getData() {
        mainActivityRepositories.getMainActivityList(new MainActivityGetCallBack() {
            @Override
            public void onSuccess(List<ResultsBean> data) {
                view.onSuccess(data);
            }

            @Override
            public void onError(String msg) {
                view.onError(msg);
            }
        });
    }

}
