
package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price_type")
    @Expose
    private String priceType;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("meta_title")
    @Expose
    private String metaTitle;
    @SerializedName("meta_desc")
    @Expose
    private String metaDesc;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("url_key")
    @Expose
    private String urlKey;
    @SerializedName("short_desc")
    @Expose
    private String shortDesc;
    @SerializedName("brand")
    @Expose
    private Brand brand;
    @SerializedName("warehouse")
    @Expose
    private Warehouse warehouse;
    @SerializedName("vendor")
    @Expose
    private Vendor vendor;
    @SerializedName("rating")
    @Expose
    private Rating rating;
    @SerializedName("image_default")
    @Expose
    private ImageDefault imageDefault;
    @SerializedName("image_list")
    @Expose
    private List<ImageList> imageList = new ArrayList<ImageList>();
    @SerializedName("detail_info")
    @Expose
    private DetailInfo detailInfo;
    @SerializedName("attribute_config")
    @Expose
    private List<Object> attributeConfig = new ArrayList<Object>();
    @SerializedName("attribute_bundle")
    @Expose
    private List<Object> attributeBundle = new ArrayList<Object>();
    @SerializedName("is_using_simple")
    @Expose
    private String isUsingSimple;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("tier")
    @Expose
    private List<Object> tier = new ArrayList<Object>();
    @SerializedName("stock_data")
    @Expose
    private StockData stockData;
    @SerializedName("is_new")
    @Expose
    private boolean isNew;
    @SerializedName("is_in_stock")
    @Expose
    private boolean isInStock;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The priceType
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 
     * @param priceType
     *     The price_type
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /**
     * 
     * @return
     *     The productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 
     * @param productType
     *     The product_type
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * 
     * @return
     *     The metaTitle
     */
    public String getMetaTitle() {
        return metaTitle;
    }

    /**
     * 
     * @param metaTitle
     *     The meta_title
     */
    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    /**
     * 
     * @return
     *     The metaDesc
     */
    public String getMetaDesc() {
        return metaDesc;
    }

    /**
     * 
     * @param metaDesc
     *     The meta_desc
     */
    public void setMetaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
    }

    /**
     * 
     * @return
     *     The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 
     * @return
     *     The urlKey
     */
    public String getUrlKey() {
        return urlKey;
    }

    /**
     * 
     * @param urlKey
     *     The url_key
     */
    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    /**
     * 
     * @return
     *     The shortDesc
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * 
     * @param shortDesc
     *     The short_desc
     */
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    /**
     * 
     * @return
     *     The brand
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The warehouse
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * 
     * @param warehouse
     *     The warehouse
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * 
     * @return
     *     The vendor
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * 
     * @param vendor
     *     The vendor
     */
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The imageDefault
     */
    public ImageDefault getImageDefault() {
        return imageDefault;
    }

    /**
     * 
     * @param imageDefault
     *     The image_default
     */
    public void setImageDefault(ImageDefault imageDefault) {
        this.imageDefault = imageDefault;
    }

    /**
     * 
     * @return
     *     The imageList
     */
    public List<ImageList> getImageList() {
        return imageList;
    }

    /**
     * 
     * @param imageList
     *     The image_list
     */
    public void setImageList(List<ImageList> imageList) {
        this.imageList = imageList;
    }

    /**
     * 
     * @return
     *     The detailInfo
     */
    public DetailInfo getDetailInfo() {
        return detailInfo;
    }

    /**
     * 
     * @param detailInfo
     *     The detail_info
     */
    public void setDetailInfo(DetailInfo detailInfo) {
        this.detailInfo = detailInfo;
    }

    /**
     * 
     * @return
     *     The attributeConfig
     */
    public List<Object> getAttributeConfig() {
        return attributeConfig;
    }

    /**
     * 
     * @param attributeConfig
     *     The attribute_config
     */
    public void setAttributeConfig(List<Object> attributeConfig) {
        this.attributeConfig = attributeConfig;
    }

    /**
     * 
     * @return
     *     The attributeBundle
     */
    public List<Object> getAttributeBundle() {
        return attributeBundle;
    }

    /**
     * 
     * @param attributeBundle
     *     The attribute_bundle
     */
    public void setAttributeBundle(List<Object> attributeBundle) {
        this.attributeBundle = attributeBundle;
    }

    /**
     * 
     * @return
     *     The isUsingSimple
     */
    public String getIsUsingSimple() {
        return isUsingSimple;
    }

    /**
     * 
     * @param isUsingSimple
     *     The is_using_simple
     */
    public void setIsUsingSimple(String isUsingSimple) {
        this.isUsingSimple = isUsingSimple;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The tier
     */
    public List<Object> getTier() {
        return tier;
    }

    /**
     * 
     * @param tier
     *     The tier
     */
    public void setTier(List<Object> tier) {
        this.tier = tier;
    }

    /**
     * 
     * @return
     *     The stockData
     */
    public StockData getStockData() {
        return stockData;
    }

    /**
     * 
     * @param stockData
     *     The stock_data
     */
    public void setStockData(StockData stockData) {
        this.stockData = stockData;
    }

    /**
     * 
     * @return
     *     The isNew
     */
    public boolean isIsNew() {
        return isNew;
    }

    /**
     * 
     * @param isNew
     *     The is_new
     */
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * 
     * @return
     *     The isInStock
     */
    public boolean isIsInStock() {
        return isInStock;
    }

    /**
     * 
     * @param isInStock
     *     The is_in_stock
     */
    public void setIsInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }

}
