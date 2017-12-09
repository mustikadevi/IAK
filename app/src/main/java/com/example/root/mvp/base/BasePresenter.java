package com.example.root.mvp.base;

/**
 * Created by root on 09/12/17.
 */

public interface BasePresenter<T> {

    void onAttachView(T view);

}
