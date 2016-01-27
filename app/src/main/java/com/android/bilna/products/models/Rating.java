
package com.android.bilna.products.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("summary")
    @Expose
    private int summary;
    @SerializedName("reviewer")
    @Expose
    private int reviewer;

    /**
     * 
     * @return
     *     The summary
     */
    public int getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(int summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The reviewer
     */
    public int getReviewer() {
        return reviewer;
    }

    /**
     * 
     * @param reviewer
     *     The reviewer
     */
    public void setReviewer(int reviewer) {
        this.reviewer = reviewer;
    }

}
