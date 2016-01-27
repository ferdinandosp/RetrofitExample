
package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("original")
    @Expose
    private int original;
    @SerializedName("final")
    @Expose
    private int _final;
    @SerializedName("discount")
    @Expose
    private int discount;
    @SerializedName("max")
    @Expose
    private int max;
    @SerializedName("min")
    @Expose
    private int min;

    /**
     * 
     * @return
     *     The original
     */
    public int getOriginal() {
        return original;
    }

    /**
     * 
     * @param original
     *     The original
     */
    public void setOriginal(int original) {
        this.original = original;
    }

    /**
     * 
     * @return
     *     The _final
     */
    public int getFinal() {
        return _final;
    }

    /**
     * 
     * @param _final
     *     The final
     */
    public void setFinal(int _final) {
        this._final = _final;
    }

    /**
     * 
     * @return
     *     The discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * 
     * @param discount
     *     The discount
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * 
     * @return
     *     The max
     */
    public int getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 
     * @return
     *     The min
     */
    public int getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(int min) {
        this.min = min;
    }

}
