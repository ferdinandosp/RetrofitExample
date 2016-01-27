package com.android.bilna;

import android.test.InstrumentationTestCase;

import com.android.bilna.products.models.ProductSearchResult;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends InstrumentationTestCase {

    public void test() throws IOException {
        RestAdapter restAdapter = RestAdapter.instance();
        Call<ProductSearchResult> call = restAdapter.getProductApiInterface().searchProducts("susu", 5);

        Response<ProductSearchResult> productModels = call.execute();

        call.enqueue(new Callback<ProductSearchResult>() {
            @Override
            public void onResponse(Response<ProductSearchResult> response) {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

        ProductSearchResult a = productModels.body();
    }
}