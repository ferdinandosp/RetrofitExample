package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageDefault {

    @SerializedName("small_image")
    @Expose
    private SmallImage smallImage;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;

    /**
     * 
     * @return
     *     The smallImage
     */
    public SmallImage getSmallImage() {
        return smallImage;
    }

    /**
     * 
     * @param smallImage
     *     The small_image
     */
    public void setSmallImage(SmallImage smallImage) {
        this.smallImage = smallImage;
    }

    /**
     * 
     * @return
     *     The image
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

}
