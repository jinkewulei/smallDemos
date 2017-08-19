package com.will;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhaolingchao on 16/8/3.
 */
public class PartnerFeedback implements Serializable, Cloneable {

    private Integer id;
    private Integer productId;
    private String pageTitle;
    private String feedback;
    private Date feedbackTime;

    public PartnerFeedback() {

    }

    public PartnerFeedback(Integer productId, String pageTitle, String feedback) {
        this.productId = productId;
        this.pageTitle = pageTitle;
        this.feedback = feedback;
        this.feedbackTime = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

}