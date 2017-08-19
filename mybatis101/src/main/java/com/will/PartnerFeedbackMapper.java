package com.will;

/**
 * Created by william on 16/8/3.
 */
public interface PartnerFeedbackMapper {
    public void insert (PartnerFeedback partnerFeedback);
    public PartnerFeedback findFeedbackById(int id);
}
