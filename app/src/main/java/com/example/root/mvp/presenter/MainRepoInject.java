package com.example.root.mvp.presenter;

import android.content.Context;

/**
 * Created by root on 09/12/17.
 */

public class MainRepoInject {
    public static MainActivityRepositories provideToMainRepo(Context context) {
        return new MainActivityRepositories(new MainActivityDataRemote(context));
    }
}
