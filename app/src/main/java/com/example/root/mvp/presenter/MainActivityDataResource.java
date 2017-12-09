package com.example.root.mvp.presenter;

import android.support.annotation.NonNull;
import com.example.root.mvp.model.PojoMain;
import java.util.List;

/**
 * Created by root on 09/12/17.
 */

public interface MainActivityDataResource {

    interface MainActivityGetCallBack{
        void onSuccess(List<PojoMain.ResultsBean> data);
        void onError(String msg);
    }

    void getMainActivityList(@NonNull MainActivityGetCallBack mainActivityGetCallBack);
}
