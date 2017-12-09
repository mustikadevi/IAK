package com.example.root.mvp.presenter;

import android.support.annotation.NonNull;

/**
 * Created by root on 09/12/17.
 */

public class MainActivityRepositories implements MainActivityDataResource {

    MainActivityDataResource mainActivityDataResource;

    public MainActivityRepositories(MainActivityDataResource mainActivityDataResource) {
        this.mainActivityDataResource = mainActivityDataResource;
    }

    @Override
    public void getMainActivityList(@NonNull MainActivityGetCallBack mainActivityGetCallBack) {
        mainActivityDataResource.getMainActivityList(mainActivityGetCallBack);
    }
}
