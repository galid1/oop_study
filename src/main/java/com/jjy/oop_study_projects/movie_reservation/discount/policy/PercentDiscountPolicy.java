package com.jjy.oop_study_projects.movie_reservation.discount.policy;

import com.jjy.oop_study_projects.common.Money;
import com.jjy.oop_study_projects.movie_reservation.Screening;
import com.jjy.oop_study_projects.movie_reservation.discount.condition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy{
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditionList) {
        super(conditionList);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
