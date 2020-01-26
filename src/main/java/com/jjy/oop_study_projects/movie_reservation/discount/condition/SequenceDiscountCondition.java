package com.jjy.oop_study_projects.movie_reservation.discount.condition;

import com.jjy.oop_study_projects.movie_reservation.Screening;

public class SequenceDiscountCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
