package com.jjy.oop_study_projects.movie_reservation.discount.policy;

import com.jjy.oop_study_projects.common.Money;
import com.jjy.oop_study_projects.movie_reservation.Screening;
import com.jjy.oop_study_projects.movie_reservation.discount.condition.DiscountCondition;

import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditionList;

    public DiscountPolicy(DiscountCondition ...conditionList) {
        this.conditionList = Arrays.asList(conditionList);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition: this.conditionList) {
            if(condition.isSatisfiedBy(screening))
                return this.getDiscountAmount(screening);
        }

        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
