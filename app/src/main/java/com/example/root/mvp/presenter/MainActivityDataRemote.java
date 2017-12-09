package com.example.root.mvp.presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.root.mvp.model.PojoMain;
import com.google.gson.Gson;

/**
 * Created by root on 09/12/17.
 */

public class MainActivityDataRemote implements MainActivityDataResource {

    Context context;
    private String url = "http://api.themoviedb.org/3/movie/top_rated?api_key=d0a67526a3d2f792f62893d7f963ae55";

    public MainActivityDataRemote(Context context) {
        this.context = context;
    }

    @Override
    public void getMainActivityList(@NonNull final MainActivityGetCallBack mainActivityGetCallBack) {

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, String.valueOf(url),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        final PojoMain pojoMain = new Gson().fromJson(response, PojoMain.class);
                        if (pojoMain == null) {
                            mainActivityGetCallBack.onError("Error");
                        } else {
                            mainActivityGetCallBack.onSuccess(pojoMain.getResults());
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mainActivityGetCallBack.onError("Error");
            }
        });

        requestQueue.add(stringRequest);
    }
}