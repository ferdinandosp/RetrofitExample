
package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StockData {

    @SerializedName("min_basket")
    @Expose
    private int minBasket;
    @SerializedName("max_basket")
    @Expose
    private int maxBasket;
    @SerializedName("qty")
    @Expose
    private int qty;

    /**
     * 
     * @return
     *     The minBasket
     */
    public int getMinBasket() {
        return minBasket;
    }

    /**
     * 
     * @param minBasket
     *     The min_basket
     */
    public void setMinBasket(int minBasket) {
        this.minBasket = minBasket;
    }

    /**
     * 
     * @return
     *     The maxBasket
     */
    public int getMaxBasket() {
        return maxBasket;
    }

    /**
     * 
     * @param maxBasket
     *     The max_basket
     */
    public void setMaxBasket(int maxBasket) {
        this.maxBasket = maxBasket;
    }

    /**
     * 
     * @return
     *     The qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * 
     * @param qty
     *     The qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

}
