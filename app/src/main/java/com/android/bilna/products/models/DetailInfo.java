
package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetailInfo {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("how_to_use")
    @Expose
    private String howToUse;
    @SerializedName("nutrition_fact")
    @Expose
    private String nutritionFact;

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The howToUse
     */
    public String getHowToUse() {
        return howToUse;
    }

    /**
     * 
     * @param howToUse
     *     The how_to_use
     */
    public void setHowToUse(String howToUse) {
        this.howToUse = howToUse;
    }

    /**
     * 
     * @return
     *     The nutritionFact
     */
    public String getNutritionFact() {
        return nutritionFact;
    }

    /**
     * 
     * @param nutritionFact
     *     The nutrition_fact
     */
    public void setNutritionFact(String nutritionFact) {
        this.nutritionFact = nutritionFact;
    }

}
