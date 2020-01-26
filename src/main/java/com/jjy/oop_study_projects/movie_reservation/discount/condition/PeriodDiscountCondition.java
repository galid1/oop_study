package com.jjy.oop_study_projects.movie_reservation.discount.condition;

import com.jjy.oop_study_projects.movie_reservation.Screening;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.DayOfWeek;
import java.time.LocalTime;

@AllArgsConstructor
@Builder
public class PeriodDiscountCondition implements DiscountCondition{
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getWhenScreened().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
    }
}
