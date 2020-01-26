package com.jjy.oop_study_projects.movie_reservation.discount.policy;

import com.jjy.oop_study_projects.common.Money;
import com.jjy.oop_study_projects.movie_reservation.Screening;
import com.jjy.oop_study_projects.movie_reservation.discount.condition.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy{
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditionList) {
        super(conditionList);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
