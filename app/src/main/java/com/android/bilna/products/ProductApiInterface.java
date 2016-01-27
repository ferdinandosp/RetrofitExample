package com.android.bilna.products;

import com.android.bilna.products.models.ProductSearchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductApiInterface {
    @GET("products/search")
    Call<ProductSearchResult> searchProducts(@Query("q") String q, @Query("limit") int limit);
}