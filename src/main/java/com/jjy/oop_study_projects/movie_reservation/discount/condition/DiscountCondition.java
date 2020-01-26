package com.jjy.oop_study_projects.movie_reservation.discount.condition;

import com.jjy.oop_study_projects.movie_reservation.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
