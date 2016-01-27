package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageList {

    @SerializedName("label")
    @Expose
    private Object label;
    @SerializedName("image_resize")
    @Expose
    private ImageResize imageResize;

    /**
     * 
     * @return
     *     The label
     */
    public Object getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(Object label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The imageResize
     */
    public ImageResize getImageResize() {
        return imageResize;
    }

    /**
     * 
     * @param imageResize
     *     The image_resize
     */
    public void setImageResize(ImageResize imageResize) {
        this.imageResize = imageResize;
    }

}
