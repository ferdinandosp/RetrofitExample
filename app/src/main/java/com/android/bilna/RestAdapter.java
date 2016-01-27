package com.android.bilna;

import com.android.bilna.products.ProductApiInterface;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by ferdinando on 26/01/16.
 */
public class RestAdapter {

    private static RestAdapter instance;

    public static RestAdapter instance() {
        if(instance == null) instance = new RestAdapter();

        return instance;
    }

    private Retrofit retrofit;

    public RestAdapter() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://beta.bilna.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public ProductApiInterface getProductApiInterface() {
        return retrofit.create(ProductApiInterface.class);
    }


}
