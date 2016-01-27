
package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("horizontal")
    @Expose
    private String horizontal;
    @SerializedName("vertical")
    @Expose
    private String vertical;
    @SerializedName("detail")
    @Expose
    private String detail;

    /**
     * 
     * @return
     *     The base
     */
    public String getBase() {
        return base;
    }

    /**
     * 
     * @param base
     *     The base
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 
     * @return
     *     The horizontal
     */
    public String getHorizontal() {
        return horizontal;
    }

    /**
     * 
     * @param horizontal
     *     The horizontal
     */
    public void setHorizontal(String horizontal) {
        this.horizontal = horizontal;
    }

    /**
     * 
     * @return
     *     The vertical
     */
    public String getVertical() {
        return vertical;
    }

    /**
     * 
     * @param vertical
     *     The vertical
     */
    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    /**
     * 
     * @return
     *     The detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 
     * @param detail
     *     The detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

}
